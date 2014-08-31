/**
 * 7 if an element in a MxN matrix is zero, set the entire row & column to zero.
 */

class Seven {
    public static void main(String[] args) {
	System.out.println("Sup");
	int[][] matrix = 
	    {{1,1,1,1,1},
	     {1,1,1,0,1},
	     {1,1,1,1,1},
	     {1,1,1,1,0},
	     {1,1,1,1,1}};
	printMatrix(matrix, 5);
	matrix = convertMatrix(matrix,5);
	printMatrix(matrix, 5);
    }

    public static void printMatrix(int[][] matrix, int m) {
	for (int i=0; i<m; i++) {
	    for (int j=0; j<m; j++) {
		System.out.print(matrix[i][j]);
	    }
	    System.out.println("");
	}
    }

}

