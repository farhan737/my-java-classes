package farhan.util;

public class Patterns {
	public void printSquareWithNumbers(int side) {
//		example:
//		input: 5
//		output:
//		1 	2 	3 	4 	5 	
//		6+4 	7+2 	8 	9-2 	10-4 	
//		11 	12 	13 	14 	15 	
//		16 	17 	18 	19 	20 	
//		21 	22 	23 	24 	25 
		boolean state = false;
		for (int i = 1; i <= side * side; i++) {
			
			if(state) {
				System.out.print(i + " \t");
				if (i % side == 0)
					System.out.println();
			}
			else {
				System.out.print(i + " \t");
				if (i % side == 0)
					System.out.println();
			}
			
		}
	}
}
