
public class Ex14 {
	public static void main(String[] args) {
		int number = 3;
		System.out.println("The number is " + number);
		//Nested if
		if (number == 1) {
			System.out.println("One");
		} else if (number == 2) {
			System.out.println("Two");
		} else if (number == 3) {
			System.out.println("Three");
		} else if (number == 4) {
			System.out.println("Four");
		} else if (number == 5) {
			System.out.println("Five");
		} else if (number == 6) {
			System.out.println("Six");
		} else if (number == 7) {
			System.out.println("Seven");
		} else if (number == 8) {
			System.out.println("Eight");
		} else if (number == 9) {
			System.out.println("Nine");
		}
		
		//Switch - Case
		switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			break;
		}
	}
}
