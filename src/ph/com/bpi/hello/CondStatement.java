/**
 * 
 */
package ph.com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class CondStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creste Scanner object
		Scanner input = new Scanner(System.in);
		String result = "NA";
		// read user input
		System.out.println("What is your age as int? ");
		int iInput = Integer.parseInt(input.nextLine());
		
		
		if (iInput >= 60) 
				result = "Senior";

		if (iInput < 18 )
				result = "Minor";
		
		if ( (iInput >= 18) && (iInput < 60) )
				result = "Adult";
		
		
		// String result = (iInput >= 18) ? "Adult" : "Minor";
		System.out.println("You are now " + result);

		
		input.close();

	}

}

