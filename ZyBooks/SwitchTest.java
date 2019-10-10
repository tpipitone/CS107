public class SwitchTest{ // how to use do while and swicth, basically an inefficient for loop
	public static void main(String[] args) {
		int i = 0;
		do{ 											// do this 
			i++;
			switch(i){
				case 1:
					System.out.println(i + "st iteration");
					break;

				case 2:
					System.out.println(i + "nd iteration");
					break;

				case 3:
					System.out.println(i + "rd iteration");
					break;

				default:
					System.out.println(i + "th iteration");
			}

		} while (i <= 15); 							// while this 
		System.out.println("End of loop");
	}
}