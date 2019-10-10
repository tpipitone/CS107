import java.util.Scanner;

/*
 * Description:  this program takes a raw phone number and returns area code, exchange number, and last 4 digits 
 * Date:  10/08/19
 * CS 107, Section 1
 * @author: Thomas Pipitone, 824506781
 */

public class Lab5c{
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter 10-digit telephone number: ");
		String rawInput  = scnr.nextLine();

		if(rawInput.length() != 10){
			System.out.println("You entered " + rawInput);
			System.out.println("Please enter a 10-digit number");

		} else {

			String areaCode  = rawInput.substring(0,3);
			String exchange  = rawInput.substring(3,6);
			String lastNum   = rawInput.substring(6);
			String formatted = ("(" + areaCode + ") " + exchange + "-" + lastNum);

			System.out.println("You entered " + rawInput);
			System.out.println("The area code is " + areaCode);
			System.out.println("The exchange is " + exchange);
			System.out.println("The number is " + lastNum);
			System.out.println("The complete telephone number is " + formatted);
		}
	}
}