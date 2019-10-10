import java.util.Scanner;

public class Months {
   public static void main(String[] args) {
   	int monthNum = -1;
  
    String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the month: ");
    String input = scnr.nextLine();

    String abbreviation = input.substring(0,3).toUpperCase(); 

    for(int i = 0; i < months.length; i++){
    	if(months[i].equals(input.toUpperCase()) ){
    		monthNum = i + 1; 
    		break;
    	} 
	}

	System.out.println("You entered " + input);
	System.out.println("Its abbreviation is " + abbreviation);
	System.out.println("This is month number " + monthNum);

   }
}
