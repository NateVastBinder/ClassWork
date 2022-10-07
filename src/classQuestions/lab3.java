package classQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		menu(input);
		
	}
	public static void replaceALetter(Scanner input) {
		System.out.println("Type in a sentence to remove all the A's in the sentence: ");
		
		String innitialSentence = input.next();
		String sentenceWithoutA = innitialSentence.replaceAll("A", " ").replaceAll("a", "");
		
		
		System.out.println("Your new sentence is " + sentenceWithoutA);
		
	}
	public static void findDuplicates(Scanner input) {
		System.out.println("Enter a sentence to remove the dulplicate latters: ");
		String string = input.next();
		String dupes = "";
			for (int i = 0; i < string.length()-1; i++) {			
			for(int j = i + 1; j < string.length(); j++) {
				if(string.charAt(i) == string.charAt(j)) {
					dupes = dupes + Character.toString(string.charAt(j));
					break;
				}
			}
			}
		for (int i = 0; i < dupes.length(); i++) {
			string = string.replaceAll(Character.toString(dupes.charAt(i)), "");
		}
		System.out.println(string);
	

	}
	public static void countVowels(Scanner input) {
		
		System.out.println("Enter a sentence for the program to count the vowels: ");
		String vowels = input.next();
		int vowelsStart = 0;
		int consonants = 0;
		
		       
		
		for(int i = 0; i < vowels.length(); i++) {
		if (vowels.charAt(i) == 'a') {
			++vowelsStart;
		}else if (vowels.charAt(i) == 'e') {
			++vowelsStart;
		}else if (vowels.charAt(i) == 'i') {
			++vowelsStart;
		}else if (vowels.charAt(i) == 'o') {
			++vowelsStart;
		}else if (vowels.charAt(i) == 'u') {
			++vowelsStart;
		}else {
			++consonants;
		}
		}
		System.out.println("The amount of vowels is " + vowelsStart + " and the amount of consonants are " + consonants);
	
		
	}		
	public static void nonDoubles(Scanner input) {
		System.out.println("Enter a sentence to move all the duplicate letters to the end");
		String string = input.next();
		String newString = "";
		String stringWithoutDoubles = "";
		String dupes = "";
		
		for (int i = 0; i < string.length()-1; i++) {			
		for(int j = i + 1; j < string.length(); j++) {
			if(string.charAt(i) == string.charAt(j)) {
				dupes = dupes + Character.toString(string.charAt(j));
				break;
			}
		}
		
		}
	for (int i = 0; i < dupes.length(); i++) {
		newString = string.replaceAll(Character.toString(dupes.charAt(i)), "");
		stringWithoutDoubles = newString + dupes;
	}
	System.out.println(stringWithoutDoubles);
		
		
	}

	public static void menu(Scanner input) {
		
		System.out.println("Select number 1 = Remove a letter\n" +
							"Select number 2 = Remove duplicate characters\n" + 
							"Select number 3 = Count the vowels in a sentence\n" + 
							"Select number 4 = Move all duplicates to the end of the sentence\n" +
							"Select number 5 = Exit\n" +
							"Enter the number below\n");
		int menuNumber = input.nextInt();
		do {
		switch (menuNumber) {
			case 1 :
				replaceALetter(input);
				break;
			case 2 :
				findDuplicates(input);
				break;
			case 3 :
				countVowels(input);
				break;
			case 4 :
				nonDoubles(input);
				break;
		}
		}while (input.nextInt() < 5);
		
	}
	

}
