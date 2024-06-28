package com.ts;

public class AverageOf2DArray {
	public static void main(String[] args) {
		int x[][] = {{4,5,9},{4,7,42},{2,11,0}};
		int sum = 0;
		float avg = 0;
		int add = 0;
		
		for(int i=0 ; i<x.length ; i++) {
			for(int j=0 ; j<x[i].length ; j++) {
				sum = sum + x[i][j];	
			}
			add = add + x[i].length;
			avg = sum / add;
		}
	    System.out.println("Average of array elements : "+ avg);
		}
}

