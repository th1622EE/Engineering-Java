package coordinates;

public class Cylindrical extends Cartesian {
	
	/**
	 * Instance variables representing the r,theta class components
	 */
	private double r;
	private double theta;
	
	/**
	 * Default constructor initializing r,theta,z components to zero
	 */
	Cylindrical() {
		this.r = 0;
		this.theta = 0;
		setZ(0);
	}
	
	/**
	 * Constructor with user-defined r,theta,z parameters for initialization
	 */
	Cylindrical(double r, double theta, double z) {
		this.r = r;
		this.theta = theta;
		setZ(z);
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
	 * The calcTheta method takes user-defined values of x,y components, then sets and returns the value of theta for the instance
	 * @param x
	 * @param y
	 * @return
	 */
	public double calcTheta(double x, double y) {
		setTheta(Math.atan2(y, x));
		return theta;
	}

}
