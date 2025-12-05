/**
 * 
 */
package ph.com.bpi.hello;

/**
 * 
 */
public class Car {
	private String color = "black";
	private String plateno = "ABC 7111";
	private int cylinder = 300;
	
	public Car() {
	}
	
	public Car(String carColor, String carPlateno, int carCylinder) {
		this.color = carColor;
		this.plateno = carPlateno;
		this.cylinder = carCylinder;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setPlateno(String plateno) {
		this.plateno = plateno;
		}
	public String getPlateno() {
		return this.plateno;
	}
		
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	public int getCyclinder() {
		return this.cylinder;
	}
	
	/**
	 * @param args
	 */
	public void showCarDetails () {
		// TODO Auto-generated method stub
		System.out.println("===Car Details===");
		System.out.println("Color:           " + color);
		System.out.println("Plate no:        " + plateno);
		System.out.println("Cynlinder:       " + cylinder);
		System.out.println("+++++++++++++++++");

	}

}
