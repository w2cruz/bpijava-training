
/* package ph.com.bpi.hello; */
package ph.com.bpi.hello;
/**
 * This is a sample program to greet self
 */
import java.util.Scanner;
public class Greet {

	public static void main(String[] args) {
		
		// Creste Scanner object
		Scanner input = new Scanner(System.in);
		
		// read user input
		System.out.println("What is your name? ");
		String aInput = input.nextLine();
		
		System.out.println("Hello, " + aInput);
		
		input.close();
	}

}

