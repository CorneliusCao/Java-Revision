import java.util.Scanner;

public class Ex52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1, number2, number3, sum, product, max, min;
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
	
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		number3 = scanner.nextInt();
		
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		
		max = (number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3));
		min = (number1 < number2 ? (number1 < number3 ? number1 : number3) : (number2 < number3 ? number2 : number3));
		
		System.out.println("Sum is: " + sum);
		System.out.println("Product is: " + product);
		System.out.println("Max is: " + max);
		System.out.println("Min is: " + min);
	}
}
