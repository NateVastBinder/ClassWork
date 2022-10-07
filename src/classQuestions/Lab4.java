package classQuestions;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		addition(input, input);
//
//		 System.out.println(squirrelPlay(95, true));
//		 lotteryTicket();


		 System.out.println(findingX("xxx"));
//		 System.out.println(repeatedString(input));
	}

	public static void addition(Scanner input, Scanner input1 ) {
		System.out.println("Type in two integers");
	int a = input.nextInt();
	int b = input1.nextInt();
	int sum = a + b; 
	
	int lengtha = String.valueOf(a).length();
	int lengthsum = String.valueOf(sum).length();
	
	if (Integer.valueOf(lengtha) >= Integer.valueOf(lengthsum)) {
		System.out.println("The sum of your two numbers is " + sum);
	}else {
		System.out.println("The sum is above the digit of the first value your returned value is " + a);
	}
	
	}

	public static boolean squirrelPlay(int i, boolean b) {
		int tempurature = i;
		boolean summer = b;

		if (summer = true && tempurature <= 100 && tempurature >= 60) {
			System.out.println("The tempurature is " + i + " so ");
			return true;
		}else if (summer = false && tempurature <= 90 && tempurature >= 60) {
			System.out.println("The tempurature is " + i + "so ");
			return true;
		}else {
		return false;	
		}
	}
		
	public static void lotteryTicket() {
			int a = 1;
			int b = 2;
			int c = 2;
			
			
			if (a == c && c != b) {
				System.out.println("Your lottery ticket had the value of 10");
		}else if (b == c && c != a) {
				System.out.println("Your lottery ticket had the value of  10");
		}else if (a == b && b == c) {
			System.out.println("Your lottery ticket had the value of 20");
		}else if (a == b && b != c) {
			System.out.println("Your lottery ticket had the value of  10");
		}else if(a != b && b != c) {
			System.out.println("Your lottery ticket had the value of  0");
		}	
		}
		
	public static int findingX(String message) {
		
		int numberOfX = 1;
	
		for (int i = 0; i < message.length()-1; i++) {
			if (message.charAt(i) == 'x' && message.charAt(i + 1) == 'x') {
				++numberOfX;
			}
		
		}
		return numberOfX;
		
	}
	public static String repeatedString(Scanner input) {
		String message = "Hi";
		String hold = "";
		int numberOfTimes = 1;;
		int amountOfHi = 3;
		 do{    
//		 System.out.print(message);   
		 hold += message;
		       numberOfTimes++;
		 }while(numberOfTimes <= amountOfHi);    
		
		
		return hold;
		
		
	}
}
