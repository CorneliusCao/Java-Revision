import java.util.Scanner;

public class Ex42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int product = 1;
		int lowerbound = scanner.nextInt();
		int upperbound = scanner.nextInt();
		for (int i = lowerbound; i <= upperbound; i++) {
			product *= i;
		}
		System.out.println("Factorial is: " + product);
	}
}
