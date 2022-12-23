package coordinates;

public class Polar extends Cartesian {
	
	/**
	 * Instance variables representing the r,theta Polar components
	 */
	private double r;
	private double theta;
	
	/**
	 * Default constructor initializes the r,theta components to zero
	 */
	Polar() {
		this.r = 0;
		this.theta = 0;
	}
	
	/**
	 * Constructor with user-defined r,theta parameters for initialization
	 */
	Polar(double r, double theta) {
		this.r = r;
		this.theta = theta;
	}
	
	/**
	 * Mutator method for r-component
	 * @param r
	 */
	public void setR(double r) {
		this.r = r;
	}

	/**
	 * Mutator method for theta-component
	 * @param theta
	 */
	public void setTheta(double theta) {
		this.theta = theta;
	}

	/**
	 * Accessor method for r-component
	 * @return
	 */
	public double getR() {
		return this.r;
	}

	/**
	 * Accessor method for theta-component
	 * @return
	 */
	public double getTheta() {
		return this.theta;
	}
	
	/**
	 * The calcTheta method takes user-defined values of x,y components, calculates the angle off
	 * the x-axis in the x-y plane (between 0 and 360 degrees), then sets and returns the value of
	 * the instance
	 */
	public double calcTheta(double x, double y) {
		setTheta(Math.atan2(y, x));
		return theta;
	}

	/**
	 * This cart2polar method uses existing values of x,y Cartesian components to calculate and
	 * set the values of r,theta polar for this instance.
	 */
	public void cart2polar() {
		this.r = calcMag(getX(), getY());
		this.theta = Math.atan2(getY(), getX());
	}
	
	/**
	 * This cart2polar method is an overloaded method which takes user-defined values of x,y
	 * Cartesian components, and sets the values of r,theta for this instance.
	 */
	public void cart2polar(double x, double y) {
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
