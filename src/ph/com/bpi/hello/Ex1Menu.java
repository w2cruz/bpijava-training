/**
 * 
 */
package ph.com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class Ex1Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creste Scanner object
		Scanner input = new Scanner(System.in);
		
		// read user input1
		System.out.println("===== STUDENT GRADING SYSTEM =====");
		System.out.println("A - Add Student Information       ");
		System.out.println("B - Compute Student Average       ");
		System.out.println("C - Display Student Information   ");
		System.out.println("D - Exit                          ");
		System.out.println("Enter Option ");
		String aOption = input.nextLine();	
		
		if aOption = "A" {
				
		}
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
