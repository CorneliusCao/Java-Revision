import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lowerbound = scanner.nextInt();
		int upperbound = scanner.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = lowerbound; i <= upperbound; i++) {
			sum += i;
			++count;
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + sum * 1.0 / count);
	}
}
