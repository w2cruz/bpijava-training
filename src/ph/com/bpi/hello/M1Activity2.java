/**
 * 
 */
package ph.com.bpi.hello;

/**
 * 
 */
public class M1Activity2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car oldcar = new Car();
		Car newcar = new Car("White","BYD1234",600);
		oldcar.setColor("Red");
		oldcar.setPlateno("OLD1234");
		oldcar.setCylinder(400);
		
		System.out.println("\noldcar");
		oldcar.showCarDetails();
		System.out.println("\nnewcar");
		newcar.showCarDetails();		

	}

}
