package basics;

public class Calculator_V1 {

	public int add(int...a) {
		int sum=0;
		for(int b : a) {
			sum = sum + b;
		}
		return sum;
	}
}
