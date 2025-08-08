package farhan.experiments;

public class BitwiseSwap {
	public static void main(String[] args) {
		int a = 5; //0101
		int b = 2; //0010
		b = a ^ b; //0111 = 7
		a = a ^ b; //0010 = 2
		b = a ^ b; //0101 = 5
		
		boolean x = true;
		boolean y = true;
		System.out.println(x ^ y);
	}
}
