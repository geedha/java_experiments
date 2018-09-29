import java.util.Scanner;


public class Triangle extends Shape {
	Scanner input = new Scanner(System.in);
	private double height;

	public void area() {
		System.out.println("Enter Length of triangle : ");
		height = input.nextDouble();
		breath = input.nextDouble();
		System.out.println("Area of the rectangle is"+(0.5*(height*breath)));
	}
	
}
