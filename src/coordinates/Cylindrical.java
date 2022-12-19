package coordinates;

public class Cylindrical extends Cartesian {
	
	// Instance variables
	private double r;
	private double theta;
	
	// Default constructor
	Cylindrical() {
		this.r = 0;
		this.theta = 0;
		setZ(0);
	}
	
	/**
	 * Class constructor which takes user-defined r,theta,z parameters
	 */
	Cylindrical(double r, double theta, double z) {
		this.r = r;
		this.theta = theta;
		setZ(z);
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
	 * The calcTheta method takes user-defined x,y values to calculate
	 * azimuthal angle off the x-axis in the x-y plane, then sets and returns
	 * the value of theta for this object
	 */
	public double calcTheta(double x, double y) {
		setTheta(Math.atan2(y, x));
		return theta;
	}

}
