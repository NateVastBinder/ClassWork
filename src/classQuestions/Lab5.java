package classQuestions;

import java.util.Iterator;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	countTheA(input);
		removeWhiteSpaces(input);
		findDuplicates(input);
		reversingWords();
	}

public static void countTheA(Scanner input) {
	
	System.out.println("Type in a sentence to see how many A's are in the sentence");
	String sentence = input.next();
	int amountOfAs = 0;
	
	
	for (int i = 0; i < sentence.length(); i++) {
		if (sentence.charAt(i) == 'a') {			
		++amountOfAs;
		}
		if (sentence.charAt(i) == 'A') {
		++amountOfAs;
		}
	}
	System.out.println("There are " + amountOfAs + " a's in your sentence");
}
	public static void removeWhiteSpaces(Scanner input) {
		System.out.println("Please type a sentence with spaces so that it can remove the spaces ");
		String withWhiteSpaces = input.nextLine();
		withWhiteSpaces.toCharArray();
		String holdingString = "";
		
		for (int i = 0; i < withWhiteSpaces.length(); i++) {
			if(withWhiteSpaces.charAt(i) != ' ') {
				holdingString += withWhiteSpaces.charAt(i);
		}
		}
		System.out.println(holdingString);
		} 
		
	public static void findDuplicates(Scanner input) {
		System.out.println("Please type in a sentence to find the duplicates");
		String withDuplicates = input.nextLine();
		withDuplicates.toCharArray();
		String holdingString = "";
		
		for (int i = 0; i < withDuplicates.length()-1; i++) {			
			for(int j = i + 1; j < withDuplicates.length(); j++) {
				if(withDuplicates.charAt(i) == withDuplicates.charAt(j)) {
					
					holdingString = holdingString + withDuplicates.charAt(i);
					
					break;
				}
	}
		}
		holdingString.toCharArray();
		System.out.println(holdingString + " Are the dupliates in your sentence");
	}
	
	public static void reversingWords() {
		String[] base = {"How", "are","you"};
		
		for (int i = base.length-1; i >= 0; i--) {
			System.out.println(base[i]);
		}
	
		}
	
		
		
	
	
	}


