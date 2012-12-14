#include <cstdio>
#include <vector>
#include <algorithm>

int main( int argc, char **argv ) {
	printf("argc is %d \n", argc);
	for( int i=0; i<argc; i++ ) {
		printf("argv[%d] is %d \n", i, (int) argv[i]);
	}
	printf("Done\n\n");
	return 0;
}