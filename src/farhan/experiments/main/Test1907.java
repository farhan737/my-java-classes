package farhan.experiments.main;

public class Test1907 {
	public static void main(String[] args) {
		int x = 1;
		// 1
		// 1 - 3 + 3 - 1 + 1 - 2 + 1 + 1 - 1 + 1
		int result = x++ - ++x + x-- - --x + x++ - x + --x + x-- - ++x + x;
//		System.out.println(result + " " + x);
		System.out.println(1 - 3 + 3 - 1 + 1 - 2 + 1 + 1 - 1 + 1);
	}
}
