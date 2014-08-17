#include <stdio.h>

int main( int argc, char** argv) {
  int x = 12;
  {
    printf("x is %d\n", x);
    int x = 200;
    printf("x is %d\n", x);
  }
  printf("x is %d\n", x);
  printf("done.\n\n");
  return 0;
}
