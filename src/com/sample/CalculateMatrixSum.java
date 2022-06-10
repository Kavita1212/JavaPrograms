package com.sample;

public class CalculateMatrixSum {

	/*
	 * The function/method calculateMatrixSum returns an integre representing the
	 * sum of odd elements of the given matrix whose ith and jth index are the same
	 * 
	 * The function/method calculateMatrixSum accepts three arguments -rows,an integer
	 * representing the number of rows of the given matrix,columns,
	 * an integer representing the number of columns of the given matrix 
	 * and matrix representing a two dimensional array of integers.
	 * 	  0 1	
	 * 0  1 2
	 * 1  3 9
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[][] = {{1, 2}, {3, 9}};
		//int a[][] = {{1, 2}, {3, 4}};
		//int a[][] = {{21, 2}, {3, 41}};
		
		int a[][] = {{1,2},{2,3}};
		int rows = a.length;
		int column = a.length;
		CalculateMatrixSum cl = new CalculateMatrixSum();
		int num = cl.calculateMatrixSum(rows, column, a);
		System.out.println("num==" + num);

	}
	int calculateMatrixSum(int rows,int columns,int matrix[][])
	{
		int i,j,sum=0;
		if((rows>0) &&(columns>0)) {
			for (i = 0; i < rows; i++) {
				//sum=0;
				for ( j = 0; j < columns; j++) {
					if(i ==j) {
						//if(matrix[i][j]/2!=0)
						if(matrix[i][j]%2!=0)
							sum +=matrix[i][j];
					}
				}
			}
			return sum;
		}
		else
			return sum;
	}
	
}

