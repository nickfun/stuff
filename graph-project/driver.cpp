// 140 nodes
// 667 links

#include <iostream>
using namespace std;

#include <list>
using std::list;

#include <windows.h>	// for pause

//#include "Node.h"
#include "GraphManager.h"

#include <cstdlib>

//=======
// Function Prototypes
void printGraph( GraphManager &g );
void printGraphSummary( GraphManager &g );
void dijkstra( GraphManager &g, Node *begin, Node *end );
void showNode( string strnode, GraphManager &myGraph );


int main()
{
	GraphManager myGraph;
	list< Node* >::iterator   lit;
	vector< Node* >::iterator vit;
	list< Node* > path;
	string start("Buenos Aires, Argentina"), end("Caracas, Venezuela");

	myGraph.load( "flight.txt" );

	//printGraph( myGraph );
	printGraphSummary( myGraph );

	map< string, Node* >::iterator it = myGraph.getNodes();
	while( 1 )
	{
		start = (*it).second->getName();
		it++;
		if( it == myGraph.getLastNode() )
		{
			break;
		}
		end = (*it).second->getName();
		it++;
		if( it == myGraph.getLastNode() )
		{
			break;
		}
		path = myGraph.depthFirstSearch( start, end );
		cout << path.size() << ": " << start << " to " << end << endl;
	}
	/*
	cout << "**********************" << endl;
	cout << "Path from " << start << " to " << end << endl;

	path = myGraph.depthFirstSearch( start, end );
	if( path.size() == 0 )
	{
		cout << "No path!" << endl;
	}
	else
	{
		cout << path.size() << " hops in the graph!" << endl;
		for( lit = path.begin(); lit != path.end(); lit++ )
		{
			cout << "--> " << (*lit)->getName() << endl;
		}
	}

	*/

	system("Pause");

	return 0;
}

void printGraph( GraphManager &g )
{
	map< string, Node* >::iterator git;
	vector< Node* >::iterator nit;

	for( git = g.getNodes(); git != g.getLastNode(); git++ )
	{
		cout << "Node ";
		cout << git->second->getName();
		cout << " has ";
		cout << git->second->getNumLinks();
		cout << " links" << endl;
		for( nit = git->second->getLinks(); nit != git->second->getLastLink(); nit++ )
		{
			cout << "--> " << (*nit)->getName() << endl;
		}
		cout << endl;
	}	
	return;
}

void showNode( string strnode, GraphManager &myGraph )
{
	// show a node
	vector< Node* >::iterator vit;
	cout << "Show node... ";
	getline( cin, strnode );
	Node *n = myGraph.fetch( strnode );
	if( n == NULL )
	{
		cout << strnode << " isn't in the graph" << endl;
	}
	else
	{
		cout << n->getName() << " links to: " << endl;
		for( vit = n->getLinks(); vit != n->getLastLink(); vit++ )
		{
			cout << (*vit)->getName() << endl;
		}
	}
}

void printGraphSummary( GraphManager &g )
{
	cout << "The graph has " << g.getNumNodes() << " nodes and ";
	cout << g.getNumLinks() << " links." << endl;
	
	int size[15] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

	map< string, Node* >::iterator it;

	for( it = g.getNodes(); it != g.getLastNode(); it++ )
	{
		size[ it->second->getNumLinks() ]++;
	}

	for( int i=0; i<15; i++ )
	{
		if( size[i] != 0 )
		{
			cout << "There are " << size[i] << " nodes with " << i << " links" << endl;
		}
	}
}

/****************************
	Find shortest path from begin to end
	************************/
void dijkstra( GraphManager &g, Node *begin, Node *end )
{
	return;
}

/*	
	Struct to keep track of data used for Dijkstras algorithm
	
class ddate
{
public:
	bool pathKnown;
	int length;
	Node *prev;

	ddate() {
		pathKnown = false;
		length = -1;
		prev = NULL;
	}
};
*/