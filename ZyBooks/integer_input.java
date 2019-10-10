import java.util.Scanner;

public class integer_input{
	public static void main(String[] args) {
		isInt();
	}



	public static void isInt(){
		try (Scanner scanner = new Scanner(System.in)) {
		    System.out.println("Enter an integer : ");
		    if (scanner.hasNextInt()) {
		        System.out.println("You entered : " + scanner.nextInt());
		    } else {
		        System.out.println("The input is not an integer");
		    }
		}

	}
}