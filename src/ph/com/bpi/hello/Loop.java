/**
 * 
 */
package ph.com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creste Scanner object
		//Scanner input = new Scanner(System.in);
		
		int num = 1;
		int sum = 0;
		// loop until num = 50
		while (num <= 49) {
			num += 1; 
			sum = sum + num;
		}		
		
		System.out.println("Sum = " + sum);
				
		//input.close();

	}

}