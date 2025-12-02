/**
 * 
 */
package ph.com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class MathTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creste Scanner object
		Scanner input = new Scanner(System.in);
		
		// read user input1
		System.out.println("Enter first integer ");
		int aInput = Integer.parseInt(input.nextLine());	
		System.out.println("Enter second integer ");
		int bInput = Integer.parseInt(input.nextLine());
		
		int sumInput = aInput + bInput;
		int difInput = aInput - bInput;
		int productInput = aInput * bInput;
		
		System.out.println("The sum is        = " + sumInput);
		System.out.println("The difference is = " + difInput);
		System.out.println("The product    is = " + productInput);
		
		input.close();

	}

}
