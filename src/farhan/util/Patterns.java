package farhan.util;

public class Patterns {
	public void printSquareWithNumbers(int side) {
//		1 	2 	3 	4 	5 	
//		6 	7 	8 	9 	10	
//		11 	12 	13 	14 	15 	
//		16 	17 	18 	19 	20 	
//		21 	22 	23 	24 	25 
		boolean state = false;
		for (int i = 1; i <= side * side; i++) {

			if (state) {
				System.out.print(i + " \t");
				if (i % side == 0)
					System.out.println();
			} else {
				System.out.print(i + " \t");
				if (i % side == 0)
					System.out.println();
			}

		}
	}

	public void pattern1(int side) {
//		1	2	3	4	5	
//		10	9	8	7	6	
//		11	12	13	14	15	
//		20	19	18	17	16	
//		21	22	23	24	25
		int add = 0;
		for (int i = 1; i <= side; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= side; j++) {
					System.out.print((j + add) + "\t");
				}
				add += side;
			} else {
				for (int j = side; j >= 1; j--) {
					System.out.print((j + add) + "\t");
				}
				add += side;
			}
			System.out.println();
		}
	}
}
