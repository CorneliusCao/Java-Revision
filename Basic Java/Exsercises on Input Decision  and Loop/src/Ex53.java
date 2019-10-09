import java.util.Scanner;

public class Ex53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double radius, diameter, circumference, area;
		System.out.println("Enter the radius");
		radius = scanner.nextDouble();
		diameter = 2.0 * radius;
		area = Math.PI * Math.pow(radius, 2.0);
		circumference = 2.0 * Math.PI * radius;
		System.out.println("Radius is : " + radius);
		System.out.printf("Diameter is: %.2f%n", diameter);
		System.out.printf("Area is: %.2f%n", area);
		System.out.printf("Circumference is: %.2f%n", circumference);
	}
}
