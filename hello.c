#include <stdio.h>

static char input[2048];

int main(int argc, char** argv) {
  puts("REPL beings now\nUse Ctrl+c to Exit\n\n");
  while (1) {
    fputs("repl> ", stdout);
    fgets(input, 2048, stdin);
    printf("read: %s", input);
  }
}
