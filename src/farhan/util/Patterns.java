package farhan.util;

final public class Patterns {
	/**
	 * Prints a square number pattern of size × size.
	 * <p>
	 * Example for side = 5:
	 * 
	 * <pre>
	 *  1   2   3   4   5
	 *  6   7   8   9   10
	 *  11  12  13  14  15
	 *  16  17  18  19  20
	 *  21  22  23  24  25
	 * </pre>
	 *
	 * @param side the dimension of the square (number of rows/columns)
	 */
	public static void pattern1(int side) {
		for (int i = 1; i <= side * side; i++) {
			System.out.print(i + " \t");
			if (i % side == 0) {
				System.out.println();
			}
		}
	}

	public static void pattern2(int side) {
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

	public static void pattern3(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

//	  _ _ _ _ _ _ 
//	 |_|_|_|_|_|_|
//	 |_|_|_|_|_|_|
//	 |_|_|_|_|_|_|
//	 |_|_|_|_|_|_|
//	 |_|_|_|_|_|_|
	public static void pattern4(int size) {
		for (int i = 0; i < size; i++) {
			if (i == 0)
				System.out.println(" _".repeat(size));
			System.out.print("|_".repeat(size));
			System.out.println("|");
		}
	}

//	* * * * 
//	 * * *
//	* * * * 
//	 * * *
//	* * * * 
	public static void pattern5(int length, int width) {
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0)
				System.out.println("* ".repeat(width));
			else
				System.out.println(" *".repeat(width - 1));
		}
	}

	public static void pattern6(int size) {
		// top half
		for (int i = size; i >= 0; i -= 2) {
			int spacesBefore = (size - i) / 2;
			System.out.println(" ".repeat(spacesBefore) + "*" + " ".repeat(i) + "*");
		}

		// bottom half
		for (int i = 2; i <= size; i += 2) {
			int spacesBefore = (size - i) / 2;
			System.out.println(" ".repeat(spacesBefore) + "*" + " ".repeat(i + 1) + "*");
		}
	}

	public static int pat7(int size) {
		int count = 0;
		for (int i = size; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				count++;
			}
		}
		return count * 2;
	}

	public static void pattern7(int size) {
		int c = 1;
		int spaces = 0;
		int hLimit = pat7(size);
		for (int i = size; i > 0; i--) {
			System.out.print("\t".repeat(spaces));
			spaces++;
			for (int j = 0; j < i; j++) {
				System.out.print(c + "\t");
				c++;
			}
			hLimit = hLimit - i;
			for (int j = 0; j < i; j++) {
				System.out.print(hLimit + 1 + "\t");
				hLimit++;
			}
			hLimit = hLimit - i;
			System.out.println();
		}
	}

	public static void pattern8(String name) {
		int start = 65;
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < name.length(); j++) {
				if (j == i) {
					System.out.print(name.charAt(i) + "\t");
				} else if (j == name.length() - i - 1) {
					System.out.print(name.charAt(i) + "\t");
				} else {
					System.out.print((char) start + "\t");
					start++;
				}
			}
			System.out.println();
		}
	}
}
