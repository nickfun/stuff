/*
	Nicholas Funnell <nick@nick.gs>
	Feb 24, 2011
	CS3240

	Class to manage the Nodes that make up our Graph
*/

#include "GraphManager.h"
#include <map>
using std::map;

#include <iostream>
using std::cout; 
using std::endl;		

#include <fstream>
using std::ifstream;

#include <string>
using std::string;

#include <cstddef> // definition of NULL

#include <list>
using std::list;

/****************************
	CONSTRUCTOR
	Nothing to init yet
	************************/
GraphManager::GraphManager()
{
	// do anything?
}

/****************************
	LOAD FROM FILE
	************************/
void GraphManager::load( char *filename )
{
	/**************
		EXAMPLE INPUT
From:  Tokyo, Japan
To  :  Ottawa, Canada
       Vilnius, Lithuania
       Rome, Italy
From:  Hong Kong, SAR
To  :  New York City, United States
       New Delhi, India
       Washington, United States
	********/
	ifstream fin( filename );
	string line;
	string city;
	string source;
	if( !fin.good() ) {
		cout << "Can't open file" << endl;
	}
	while( fin.good() )
	{
		getline( fin, line );
		if( fin.eof() )
		{
			break;
		}

		// use substr to get the name of the city
		city = line.substr( 7 );
		// is this a source city?
		if( line.find("From") != line.npos )
		{
			source = city;
		}
		else
		{
			this->linkNode( source, city );
		}
	}
	return;	
}

/****************************
	SAVE TO A FILE
	************************/
void GraphManager::save( char *filename )
{
	// save to file here
}

/****************************
	Add a node to the graph
	Allocates memory for the Node and insert it into our map
	***************************/
void GraphManager::createNode( string name )
{
	Node *n = new Node( name );
	graph.insert( std::pair< string, Node* >( n->getName(), n ) );
}

/****************************
	Link Existing Nodes

	If a node does not exist, it will be created

	Always returns 0

	************************/
int GraphManager::linkNode( string from, string to)
{
	map< string, Node*>::iterator it;

	it = graph.find( from );
	if( it == graph.end() )
	{
		// Node does not exist, create it
		this->createNode( from );
		// find it
		it = graph.find( from );
		// now `it` points to where we want
	}
	Node *f = it->second;

	it = graph.find( to );
	if( it == graph.end() )
	{
		// second node doesn't exist, create it
		this->createNode( to );
		it = graph.find( to );
		// now `it` points to where we want
	}
	Node *t = it->second;

	f->addLink( t );
	return 0;
}

/****************************
	Doubly Link Nodes

	For conviences, one function to link Nodes bidirectionally

	No more error codes! If a node doesn't exist, it will be created
	and linked.
	
	ERROR CODES:
	0		success
	-21		first argument is not in map
	-12		second argument is not in map
	************************/
int GraphManager::doubleLink( string first, string second)
{
	return linkNode( first, second ) + 2*linkNode( second, first );
}

/****************************
	Number of Nodes in Graph
	************************/
int GraphManager::getNumNodes()
{
	return graph.size();
}

/****************************
	Number of Links or Edges in graph
	************************/
int GraphManager::getNumLinks()
{
	map< string, Node* >::iterator it;
	int size = 0;
	for( it = graph.begin(); it != graph.end(); it++ )
	{
		size += (*it).second->getNumLinks();
	}
	return size;
}

/****************************
	Iterator to beginning of map
	************************/
map< string, Node* >::iterator GraphManager::getNodes()
{
	return graph.begin();
}

/****************************
	Iterator to end of map
	************************/
map< string, Node* >::iterator GraphManager::getLastNode()
{
	return graph.end();
}

Node* GraphManager::fetch( string n )
{
	map< string, Node* >::iterator i = graph.find( n );
	if( i == graph.end() )
	{
		return NULL;
	}
	return (*i).second;
}

/****************************
	DEPTH FIRST SEARCH

	Find a path from "start" to "end" using a depth-first
	search algorithm
	************************/
list< Node* > GraphManager::depthFirstSearch( string start, string end )
{
	Node *s = graph[ start ];
	Node *e   = graph[ end ];
	Node *v;
	list< Node* > path;
	list< Node* > stack;
	int i = 0;

	// quick check to see if a path is even possible
	if( s->getNumLinks() == 0 || e->getNumLinks() == 0 )
	{
		return path;
	}

	// push the starting node
	stack.push_front( s );

	// depth first search
	do
	{
		// pop the stack
		v = stack.front();
		stack.pop_front();

		if( v->getName() == end )
		{
			// we are done!
			path.push_back( v );
			return path;
		}
		else
		{
			// write
			path.push_back( v );

			for( vector< Node* >::iterator it = v->getLinks(); it != v->getLastLink(); it++ )
			{
				// algorithm calls for push_front to be the top of stack, but
				// that gives an infinite loop, so I pust to the bottom of
				// the stack instead.
				
				//stack.push_front( (*it) );
				stack.push_back( (*it) );

			}
		}
	} while( ! stack.empty() );
	// no path found
	path.clear();
	return path;
}