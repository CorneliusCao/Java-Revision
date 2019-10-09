
public class Ex43 {
	public static void main(String[] args) {
		int maxDenominator = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		double absDiff;
		
//		Left to right;
		for (int i = 1; i < maxDenominator; i++) {
			sumL2R += 1 * 1.0 / i;
		}
		
//		Right to left
		for (int i = maxDenominator; i >= 1; i--) {
			sumR2L += 1 * 1.0 / i;
		}
		absDiff = Math.abs(sumR2L - sumL2R);
		System.out.println(absDiff);
	}
}
