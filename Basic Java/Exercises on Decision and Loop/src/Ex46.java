
public class Ex46 {
	public static void main(String[] args) {
		int n = 3;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		double average;
		
		System.out.println("The first " + nMax + " Fibonacci numbers are:");
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			sum += fn;
			System.out.print(fn + " ");
			++n;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
		}
		System.out.println("The average is: " + sum * 1.0 / nMax);
	}
}
