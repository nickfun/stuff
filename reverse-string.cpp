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

void reverse_words_helper( char* str ) {
  if( str == NULL ) {
    return;
  }
  reverse_words_helper( strtok( NULL, " "));
  cout << str << " ";
}

void reverse_words( const char *str ) {
  int len = strlen( str );
  char* newstr = new char [ len+1 ];
  strcpy( newstr, str );
  reverse_words_helper( strtok( newstr, " "));
}



int main( int argc, char **argv )
{
  char *s1 = "Hello world!";
  char *s2 = "A man, a plan, a canal, Panama";
  char *x;
  cout << "1: " << s1 << endl << "2: " << s2 << endl << endl;
  x  = reverse(s1);
  x = reverse(s2);
  cout << "1: " << s1 << endl << "2: " << s2 << endl << endl;
  reverse_words(s1);
  reverse_words(s2);
  return 0;
}
