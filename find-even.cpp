#include <cstdio>
#include <cstdlib>
#include <vector>
#include <algorithm>

using namespace std;

int main( int argc, char **argv ) {
	
	vector<int> list;

	for( int i=0; i<argc; i++ ) {
		printf("argv[%d] is %d \n", i, atoi( argv[i] ));
	}
	printf("Done\n\n");
	return 0;
}