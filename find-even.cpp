#include <cstdio>
#include <cstdlib>
#include <vector>
#include <algorithm>

using namespace std;

void printVector( vector<int> list ) {
    vector<int>::iterator it;
    for( it = list.begin(); it != list.end(); it++ ) {
        printf("%d ", (*it) );
    }
    printf("\n");
}

/**
 * Given an array of positive ints. The array will have all ints show up
 * an odd number of times, exept for ONE that will show up an even number of times
 * return the number that shows up an even number of times
 */
int findEven( vector<int> list ) {
    int last, count;
    vector<int>::iterator it;

    sort(list.begin(), list.end());
    last = 0;
    count = 2;

    for( it = list.begin(); it != list.end(); it++ ) {
        if( last == (*it) ) {
            count++;
        }
        else
        {
            // we are looking at a new element.
            // did we just finish looking at an element an even number of times?
            if( count % 2 != 0 ) {
                // yep. last was the answer
                return last;
            }
            else
            {
                // nope. new number, setup last and count
                last = (*it);
                count = 1;
            }
        }
    }
    return -1;
}

int main( int argc, char **argv ) {

    vector<int> list;

    for( int i=1; i<argc; i++ ) {
        list.push_back( atoi(argv[i] ));
    }

    printVector(list);
    printf("The answer is %d\n", findEven(list) );
    return 0;
}