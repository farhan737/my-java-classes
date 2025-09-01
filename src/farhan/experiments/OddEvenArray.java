package farhan.experiments;

public class OddEvenArray {
	public int[] calcOddEven(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if(i%2 == 0) numbers[i] *= 2;
			else numbers[i] *= 3;
		}
		return numbers;
	}
}
