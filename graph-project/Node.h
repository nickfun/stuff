/****************************
	Nicholas Funnell <nick@nick.gs>
	Feb 24, 2011
	CS3120

	NODE

	A Node has a name and a vector of pointers to other Nodes.
	Most operations involving nodes should be done by the GraphManager class.

	***************************/

#ifndef NODE_H
#define NODE_H

#include <vector>
#include <string>

using std::vector;
using std::string;

class Node
{
public: 
	string getName();
	Node( string name );
	vector< Node* >::iterator getLinks();
	vector< Node* >::iterator getLastLink();
	void addLink( Node *n );
	int getNumLinks();

	int getWeight();
	int getScore();
	void setScore( int s );

private:
	string name;
	vector< Node* > links;
	int score;
};

#endif