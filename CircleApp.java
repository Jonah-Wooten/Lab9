import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input scanner
		Scanner input = new Scanner(System.in);
		double number;
		double circumference;
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Please enter a radius");

			number = input.nextDouble();
			Circle circle1 = new Circle(number);

			System.out.println(circle1.getFormattedCircumference());

			System.out.println("Would you like to contine? y/n");
			input.nextLine();
			cont = input.nextLine();

		}
		System.out.println("GoodBye");

	}

}
