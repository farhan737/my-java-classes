package farhan.experiments.main;

import farhan.util.CollUtils;

public class Lab0309 {
	public static void main(String[] args) {
		System.out.println("original matrix");
		int[][] matrix = {{1,2,3},{4,5,6}};
		for(int[] a:matrix) {
			CollUtils.printForEach(a, " ");
			System.out.println();
		}
		
		System.out.println("transpose matrix");
		CollUtils.transposeMatrix(matrix); 
	}
}
