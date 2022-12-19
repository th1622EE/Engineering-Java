package coordinates;

public class Polar extends Cartesian {
	
	// Instance variables
	private double r;
	private double theta;
	
	// Default constructor
	Polar() {
		this.r = 0;
		this.theta = 0;
	}
	
	/**
	 * Class constructor with user-defined r,theta parameters
	 */
	Polar(double r, double theta) {
		this.r = r;
		this.theta = theta;
	}
	
	// Getters and setters
	public void setR(double r) {
		this.r = r;
	}
	public void setTheta(double theta) {
		this.theta = theta;
	}
	public double getR() {
		return this.r;
	}
	public double getTheta() {
		return this.theta;
	}
	
	/**
	 * The calcTheta method takes user-defined values of x,y components and
	 * calculates the angle off the x-axis in the x-y plane having a range
	 * between 0 and 2*pi (360 degrees)
	 */
	public double calcTheta(double x, double y) {
		setTheta(Math.atan2(y, x));
		return theta;
	}
	
	/**
	 * The cart2polar method takes in user-defined x,y values and sets the x,y
	 * values using the accessor methods, and then uses the inherited calcMag
	 * method to calculate r, and the atan2 method to calculate theta
	 */
	public void cart2polar(double x, double y) {
		setX(x);
		setY(y);
		this.r = calcMag(x, y);
		this.theta = Math.atan2(y, x);
	}
	
	/**
	 * The polar2cart methods uses existing r,theta values to set the values
	 * of x and y
	 */
	public void polar2cart() {
		setX(this.r * Math.cos(this.theta));
		setY(this.r * Math.sin(this.theta));
	}

}
