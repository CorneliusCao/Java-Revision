import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mark = scanner.nextInt();
		
		if (mark >= 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println("DONE");
	}
}
