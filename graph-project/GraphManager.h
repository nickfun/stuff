/****************************
	Nicholas Funnell <nick@nick.gs>
	Feb 24, 2011
	CS3120

	GRAPH MANAGER

	Class to manage the Nodes and their connections
	Instead of allocating nodes by hand, just pass in a Name to call them
	and the manager will take care of the rest.

	Internally it uses a std::map to keep track of the nodes

	***************************/

#ifndef GRAPHMANAGER_H
#define GRAPHMANAGER_H

#include "Node.h"

#include <list>
using std::list;

#include <map>
using std::map;

class GraphManager
{
public:
	GraphManager();
	void load( char *filename );
	void save( char *filename );
	void createNode( string name );
	int linkNode( string from, string to );
	int doubleLink( string first, string second );
	int getNumNodes();
	int getNumLinks();
	Node* fetch( string n );

	map< string, Node* >::iterator getNodes();
	map< string, Node* >::iterator getLastNode();

	list< Node* > depthFirstSearch( string start, string end );

private:
	map< string, Node* > graph;

};

#endif