#include <iostream>
using namespace std;

int fib( int n ) {
    if( n == 0 || n == 1 ) {
        return n;
    }
    return fib(n-2) + fib(n-1);
}

int main( int argc, char **argv ) {
    for( int i=0; i<10; i++ ) {
        cout << i << " " << fib(i) << endl;
    }
    return 0;
}
