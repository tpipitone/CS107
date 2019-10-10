import java.util.Scanner;

public class CharacterOps{
	public static void main(String[] args) {
		char[] vowels   = { 'a','e','i','o','u' }; 
		Scanner scnr = new Scanner(System.in);
		boolean isVowel = false; 

		System.out.println("Enter your first name: ");
		String name = scnr.nextLine(); 
		char firstLetter = name.charAt(0); 

		for(char ch : vowels){
			if (ch == Character.toLowerCase(firstLetter) ){
				isVowel = true; 
			}
		}

		System.out.println("Hello, " + name + "!");

		if( !(Character.isAlphabetic(firstLetter)) ){
			System.out.println("The first letter of your name, '" + firstLetter + "', is neither a vowel or a consonant.");
		} else if (isVowel) { 
			System.out.println("The first letter of your name, '" + firstLetter + "', is a vowel.");
		} else {
			System.out.println("The first letter of your name, '" + firstLetter + "', is a consonant.");
		}
	}
}