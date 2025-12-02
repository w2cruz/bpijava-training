/**
 * 
 */
package ph.com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class AskAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creste Scanner object
		Scanner input = new Scanner(System.in);
		
		// read user input
		System.out.println("What is your age as int? ");
		int iInput = Integer.parseInt(input.nextLine());	
		System.out.println("Hello, " + iInput);
		
		System.out.println("What is your age as double? ");
		double dInput = Double.parseDouble(input.nextLine());	
		System.out.println("Hello, " + dInput);
		
		input.close();

	}

}
