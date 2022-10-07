package classQuestions;

public class findTheSmallest {

	public static void main(String[] args) {
		// Find the smallest
		double number1 = 2;
		double number2 = 2;
		double number3 = 1;

		if (number1 <= number2 && number1 <= number3) {
			System.out.println(number1 + " is the Smallest");
		} else if (number2 <= number3 && number2 <= number1) {
			System.out.println(number2 + " is the Smallest");
		} else if (number3 <= number1 && number3 <= number2) {
			System.out.println(number3 + " is the Smallest");

		}
	}

}
