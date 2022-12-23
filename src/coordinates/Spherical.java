package coordinates;

public class Spherical extends Cartesian {
	
	/**
	 * Instance variables rho,theta,phi where rho is the magnitude, theta is the azimuthal angle, 
	 * and phi is the polar angle
	 */
	private double rho;
	private double theta;
	private double phi;
	
	/**
	 * Default constructor initializing the values of rho,theta,phi to zero for this instance
	 */
	Spherical() {
		this.rho = 0;
		this.theta = 0;
		this.phi = 0;
	}
	
	/**
	 * Constructor taking user-defined values of rho,theta,phi for initialization of instance
	 * variables
	 */
	Spherical(double rho, double theta, double phi) {
		this.rho = rho;
		this.theta = theta;
		this.phi = phi;
	}
	
	/**
	 * Mutator method for value of rho
	 * @param rho
	 */
	public void setRho(double rho) {
		this.rho = rho;
	}

	/**
	 * Mutator method for value of theta
	 * @param theta
	 */
	public void setTheta(double theta) {
		this.theta = theta;
	}

	/**
	 * Mutator method for value of phi
	 * @param phi
	 */
	public void setPhi(double phi) {
		this.phi = phi;
	}

	/**
	 * Accessor method for value of rho
	 * @return
	 */
	public double getRho() {
		return this.rho;
	}

	/**
	 * Accessor method for value of theta
	 * @return
	 */
	public double getTheta() {
		return this.theta;
	}

	/**
	 * Accessor method for value of phi
	 * @return
	 */
	public double getPhi() {
		return this.phi;
	}

	/**
	 * The cart2sph method uses existing x,y,z Cartesian values to calculate and set the
	 * Spherical rho,theta,phi components
	 */
	public void cart2sph() {
		this.rho = calcMag(getX(),getY(),getZ());
		this.theta = Math.atan2(getY(), getX());
		this.phi = Math.acos(getZ()/this.rho);
	}
	
	/**
	 * This cart2sph method is an overloaded variant which takes user-defined values of the 
	 * Cartesian x,y,z components, then calculates and sets the Spherical components of
	 * rho,theta,phi for this instance
	 * @param x
	 * @param y
	 * @param z
	 */
	public void cart2sph(double x, double y, double z) {
		this.rho = calcMag(x,y,z);
		this.theta = Math.atan2(y, x);
		this.phi = Math.acos(z/rho);
	}
	
	/**
	 * The sph2cart method uses existing values or rho,theta,phi and calculates and sets the
	 * Cartesian values of x,y,z for this instance
	 */
	public void sph2cart() {
		setX(rho * Math.sin(theta) * Math.cos(phi));
		setY(rho * Math.sin(theta) * Math.sin(phi));
		setZ(rho * Math.cos(phi));
	}

	/**
	 * This calcTheta method uses existing Cartesian x,y component values to calculate, set, and
	 * return the value of theta for this instance.
	 * @return
	 */
	public double calcTheta() {
		setTheta(Math.atan2(getY(), getX()));
		return theta;
	}
	
	/**
	 * This calcTheta method is an overloaded variant which takes user-defined input values of
	 * Cartesian x,y components to calculate and set the value of theta for this instance
	 */
	public double calcTheta(double x, double y) {
		setTheta(Math.atan2(y, x));
		return theta;
	}

	/**
	 * This calcPhi method uses existing Cartesian x,y,z component values to calculate, and
	 * return the value of phi for this instance
	 * @return
	 */
	public double calcPhi() {
		setPhi(Math.acos(getZ()/calcMag()));
		return phi;
	}
	
	/**
	 * The calcPhi method is an overloaded variant which takes user-defined input values of
	 * Cartesian x,y,z comopnents, sets the x,y,z Cartesian component values, the calculates, 
	 * sets, and returns the value of phi for this instance
	 */
	public double calcPhi(double x, double y, double z) {
		setX(x);
		setY(y);
		setZ(z);
		double mag = calcMag();
		setPhi(Math.acos(z/mag));
		return phi;
	}
	
}
