#include <iostream>

using std::cout;
using std::endl;

int countBits( int x ) {
  int count = 0;
  unsigned int mask = 1;
  unsigned int end = mask << 31;
  do {
    if( (x & mask) == mask ) {
      count++;
    }
    mask = mask << 1;
  } while( mask != end );
  return count;
}

int main( int argc, char **argv ) {
  int list[] = {
    32, 64, 128, 717, 65000,
    63, 511, 2047, 900,  2012 
  };
  int len    = 10;
  for( int i=0; i<=len; i++ ) {
    cout << list[i] << " has " << countBits( list[i] ) << " bits on" << endl;
  }
  cout << endl;
  return 0;
}
