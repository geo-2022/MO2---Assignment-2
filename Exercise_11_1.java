import java.util.Scanner;

public class Exercise_11_1 {
	public static void main(String[] args) {
		// Scanner object
		Scanner input = new Scanner(System.in);

		// Tell user to enter three sides of the triangle
		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		// Tell user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		// Tell user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// Triangle object with user input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
	}
}