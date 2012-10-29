#include <iostream>
#include <string.h>

using std::cout;
using std::endl;
using std::cin;

char* reverse( const char *str ) {
  int len = strlen(str) - 1;
  char *newstr = new char[ len+1 ];
  char temp;
  for( int i=0; i<len+1; i++ ) {
    newstr[i] = str[len-i];
  }
  return newstr;
}

int main( int argc, char **argv )
{
  char *s1 = "Hello world!";
  char *s2 = "A man, a plan, a canal, Panama";
  cout << "1: " << s1 << endl << "2: " << s2 << endl << endl;
  s1 = reverse(s1);
  s2 = reverse(s2);
  cout << "1: " << s1 << endl << "2: " << s2 << endl << endl;
  return 0;
}
