package classQuestions;

import java.util.Iterator;

public class lab1 {

	public static void main(String[] args) {
		// You have three numbers you need to find the biggest number out of the three

		double number1 = 69;
		double number2 = 420;
		double number3 = 645;
		boolean a = false;
		boolean b = false;
		int k = 6;
		int n = 3;
		int pNum = 6;
		int primeNum = 4;
		System.out.println("Question 1. The largest of the three numbers is " + max3(number1, number2, number3));
		System.out.println("Question 2. The smallest of the three Numbers is " + min3(number1, number2, number3));
		System.out.println("Question 3. The number in the middle of the three is " + mid3(number1, number2, number3));
		System.out.println("Question 4. The xor value is " + xor(a, b));
		System.out.println("Question 5. If you think " + n + " is a factor of " + k + " you are " + isFactor(k, n));
		System.out.println("Question 6. If you think " + pNum + " is a perfect number you are " + isPerfect(pNum));
		System.out.println("Question 7. If you think " + primeNum + " is a prime number you are " + isPrime(primeNum));
		
		

	}

	public static double max3(double number1, double number2, double number3) {
		if (number1 >= number2 && number1 >= number3) {
			return number1;
		} else if (number2 >= number3 && number2 >= number1) {
			return number2;
		} else if (number3 >= number2 && number3 >= number1) {
			return number3;
		} else {
			return 0;
		}

	}

	public static double min3(double number1, double number2, double number3) {
		if (number1 <= number2 && number1 <= number3) {
			return number1;
		} else if (number2 <= number1 && number2 <= number3) {
			return number2;
		} else if (number3 <= number1 && number3 <= number2) {
			return number3;
		} else {
			return 0;
		}

	}

	public static double mid3(double number1, double number2, double number3) {
		double middle = ((number1 + number2 + number3) - max3(number1, number2, number3)
				- min3(number1, number2, number3));

		return middle;
	}

	public static boolean xor(boolean a ,boolean b) {

		double solution = 5;
		

		if (a == true && b == true) {
			return false;
		} else if (a == true && b == false) {
			return true;
		} else if (a == false && b == true) {
			return true;
		} else if (a == false && b == false) {
			return false;
		} else {

			return false;
		}

	}

	public static boolean isFactor(int k, int n) {
		if (k % n == 0) {
			return true;
		}

		return false;

	}

	public static boolean isPerfect(int pNum) {
		// empty container to hold the sum of all factors
		int sum = 0;
		for (int i = 1; i < pNum; i++) {
			if (isFactor(pNum, i)) {
				sum += i;
			}
		}
		if (sum == pNum) {
			return true;
		}
		return false;
	}
		public static boolean isPrime(int primeNum) {
			for (int i = 2; i < primeNum; i++) {
				if(isFactor( primeNum, i)) {
				return false;
			}
	
	}
			return true;
		}
}
