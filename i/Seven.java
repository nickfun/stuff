/**
 * Nick F
 * 2014-08-30 19:05:00 PST
 * 7 if an element in a MxN matrix is zero, set the entire row & column to zero.
 * CTCI 1.7
 * @TODO work on MxN, not MxM matrix!!!
 */

import java.util.*;

class Seven {
    public static void main(String[] args) {
	int[][] matrix = 
	    {{1,1,1,1,1},
	     {1,1,1,0,1},
	     {1,1,1,1,1},
	     {1,1,1,1,0},
	     {1,1,1,1,1}};
	System.out.println("Input:");
	printMatrix(matrix, 5);
	matrix = convertMatrix(matrix,5);
	System.out.println("Output:");
	printMatrix(matrix, 5);
    }

    public static int[][] convertMatrix(int[][] orig, int size) {
	int[][] matrix = new int[size][size];
	// copy contents, note when a row or column is zero
	List<Integer> rows = new ArrayList<Integer>();
	List<Integer> cols = new ArrayList<Integer>();
	int t;
	for (int i=0; i<size; i++) {
	    for (int j=0; j<size; j++) {
		t = orig[i][j];
		matrix[i][j] = t;
		if (t==0) {
		    rows.add(i);
		    cols.add(j);
		}
	    }
	}
	for (int r : rows) {
	    for (int i=0; i<size; i++) {
		matrix[r][i] = 0;
	    }
	}
	for (int c : cols) {
	    for (int i=0; i<size; i++) {
		matrix[i][c] = 0;
	    }
	}
		  
	return matrix;
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

