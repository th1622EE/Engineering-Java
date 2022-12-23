package coordinates;

public class Cartesian {
	
	/**
	 * Instance variables representing the x,y,z components.
	 */
	private double x;
	private double y;
	private double z;
	
	/**
	 * The default constructor initializes x,y,z components to zero.
	 */
	Cartesian() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	/**
	 * 2D constructor with user-defined x,y parameters with z-component set to zero
	 */
	Cartesian(double x, double y) {
		this.x = x;
		this.y = y;
		this.z = 0;
	}
	
	/**
	 * 3D constructor with user-defined x,y,z parameters
	 */
	Cartesian(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Mutator method for Cartesian x-component
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * Mutator method for Cartesian y-component
	 */
	public void setY(double y) {
		this.y = y;
	}
	/**
	 * Mutator method for Cartesian z-component
	 */
	public void setZ(double z) {
		this.z = z;
	}
	/**
	 * Accessor method for Cartesian x-component
	 */
	public double getX() {
		return this.x;
	}
	/**
	 * Accessor method for Cartesian y-component
	 */
	public double getY() {
		return this.y;
	}
	/**
	 * Accessor method for Cartesian z-component
	 */
	public double getZ() {
		return this.z;
	}
	
	/**
	 * The calcMag method takes no parameters and uses existing values of the
	 * x,y,z cartesian componenets to calculate and return the magnitude. 
	 */
	public double calcMag() {
		double mag = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z,  2));
		return mag;
	}
	
	/**
	 * This calcMag is an overloaded variant which takes user-defined values of x,y components, 
	 * sets the x,y Cartesian component values, and then calculates and returns the magnitude
	 * of this 2D instance
	 */
	public double calcMag(double x, double y) {
		setX(x);
		setY(y);
		double mag = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return mag;
	}
	
	/**
	 * This is an overloaded method for calcMag which takes user-defined values of Cartesian
	 * x,y,z components, sets the x,y,z Cartesian component values, and then calculates and
	 * returns the magnitude of this 3D instance
	 */
	public double calcMag(double x, double y, double z) {
		setX(x);
		setY(y);
		setZ(z);
		double mag = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		return mag;
	}
	
}
