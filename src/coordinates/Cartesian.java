package coordinates;

public class Cartesian {
	
	// Instance variables
	private double x;
	private double y;
	private double z;
	
	// Default constructor
	Cartesian() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	/**
	 * 2D constructor with user-defined x,y parameters and z defaults to zero
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
	
	// Getters and setters
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getZ() {
		return this.z;
	}
	
	/**
	 * This calcMag method takes no parameters and uses existing values of the
	 * x,y,z cartesian componenets to calculate and return the magnitude. 
	 */
	public double calcMag() {
		double mag = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z,  2));
		return mag;
	}
	
	/**
	 * This is an overloaded method for calcMag which takes user-defined x,y
	 * values to calculate, set and return the magnitude.
	 */
	public double calcMag(double x, double y) {
		setX(x);
		setY(y);
		double mag = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return mag;
	}
	
	/**
	 * This is an overloaded method for calcMag which takes user-defined x,y,z
	 * values to calculate, set and return the magnitude.
	 */
	public double calcMag(double x, double y, double z) {
		setX(x);
		setY(y);
		setZ(z);
		double mag = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		return mag;
	}
	
	
}
