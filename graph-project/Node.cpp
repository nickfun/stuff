/*
	Nicholas Funnell <nick@nick.gs>
	Feb 24, 2011
	CS3240

	Node class for graph project
*/

#include "Node.h"

/****************************
	CONSTRUCTOR

	sets the name of the Node
	************************/
Node::Node( string newname )
{
	name = newname;
}

/****************************
	Add a link
	************************/
void Node::addLink( Node *n )
{
	links.push_back( n );
}

/****************************
	Get iterator to traverse over the links
	************************/
vector< Node* >::iterator Node::getLinks()
{
	return links.begin();
}

/****************************
	Get iterator that points to last element
	Needed for looping with iterators
	************************/
vector< Node* >::iterator Node::getLastLink()
{
	return links.end();
}

/****************************
	Get the name of this Node
	************************/
string Node::getName()
{
	return name;
}

/****************************
	Get the number of Nodes that we link to
	************************/
int Node::getNumLinks()
{
	return links.size();
}

int Node::getWeight()
{
	return 1;
}

void Node::setScore( int s )
{
	this->score = s;
}

int Node::getScore()
{
	return this->score;
}
