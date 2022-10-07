package classQuestions;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	radiusOfCircle(input);
	areaOfTriangle(input);
	evenOrOdd(input);
	intToDouble(input);
	letterToNumber(input);
	doubleToInt(input);
	leapYear(input);
	}

	public static void radiusOfCircle(Scanner input) {
		System.out.println("Enter the radius of your circle: ");
		double radius = input.nextDouble();
		
		double area = Math.PI * (radius * radius);
		
		System.out.println(area);
		
	}
	
	public static void areaOfTriangle(Scanner input) {

		System.out.println("Enter the height of your triangle: ");
		double height = input.nextDouble();
		System.out.println("Enter the base length of your triangle: ");
		double base = input.nextDouble();
		
		System.out.println(.5 * base * height);	
	}
	public static void evenOrOdd(Scanner input) {

		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		if(num % 2 == 0)
			System.out.println(num + " is even");
			else
				System.out.println(num + " is odd");
	}
	public static void intToDouble(Scanner input) {
		
		System.out.println("Type in an integer");
				int theirNumber = input.nextInt();
			
		System.out.println("You typed in " + theirNumber + " your new number number is " + (double)theirNumber);	
	}
	public static void letterToNumber(Scanner input) {
		
		System.out.println("Please type a letter of the alphabet ");
		char value = input.next().charAt(0);
		int ascii = value;
		System.out.println("The asci value of " + value + " is " + ascii);
	}
	public static void doubleToInt(Scanner input) {
		
		System.out.println("Please enter an integer with a decimal: ");
		double theirNumber = input.nextDouble();
		int roundedValue  = (int)Math.round(theirNumber);
		System.out.println("You entered " + theirNumber + " the new value is " + roundedValue);
		
	}
	public static void leapYear(Scanner input) {
		
		System.out.println("Type in 4 numbers that resresent a year");
		int year = input.nextInt();
		
		if (year % 4 == 0) {
			System.out.println("The year is a leap year");
		}else {
			System.out.println("The year is not a leap year");
		}
		
		
	}
	
}

