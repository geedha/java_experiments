import java.util.Scanner;
public class Rectangle extends Shape {
	
	public void area() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length of Rectangle : ");
		System.out.println("Enter breath of the rectangle:");
		length = input.nextDouble();
		breath = input.nextDouble();
		System.out.println("Area of the rectangle is"+(length*breath));
		

	}

}
