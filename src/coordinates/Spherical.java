package coordinates;

public class Spherical extends Cartesian {
	
	/**
	 * The value of rho represents the magnitude of the x,y,z components
	 */
	private double rho;
	/**
	 * The value of theta represents the azimuthal angle having a range between
	 * 0 and 2*pi (360 degrees)
	 */
	private double theta;
	/**
	 * The value of phi represents the polar angle having a range bewteen 0 
	 * and pi (180 degrees)
	 */
	private double phi;
	
	// Default constructor
	Spherical() {
		this.rho = 0;
		this.theta = 0;
		this.phi = 0;
	}
	
	/**
	 * Class constructor with user-defined rho, theta, phi parameters
	 */
	Spherical(double rho, double theta, double phi) {
		this.rho = rho;
		this.theta = theta;
		this.phi = phi;
	}
	
	// Getters and setters
	public void setRho(double rho) {
		this.rho = rho;
	}
	public void setTheta(double theta) {
		this.theta = theta;
	}
	public void setPhi(double phi) {
		this.phi = phi;
	}
	public double getRho() {
		return this.rho;
	}
	public double getTheta() {
		return this.theta;
	}
	public double getPhi() {
		return this.phi;
	}
	
	/**
	 * The cart2sph method takes user-defined values of x,y,z and converts
	 * those values to spherical rho, theta, phi values and sets them.
	 * @param x
	 * @param y
	 * @param z
	 */
	public void cart2sph(double x, double y, double z) {
		setX(x);
		setY(y);
		setZ(z);
		this.rho = calcMag();
		this.theta = Math.atan2(y, x);
		this.phi = Math.acos(z/rho);
	}
	
	/**
	 * The sph2cart method uses existing values or rho,theta,phi and converts
	 * them into cartesian x,y,z components and sets their values.
	 */
	public void sph2cart() {
		setX(rho * Math.sin(theta) * Math.cos(phi));
		setY(rho * Math.sin(theta) * Math.sin(phi));
		setZ(rho * Math.cos(phi));
	}
	
	/**
	 * The calcTheta method takes user-defined x,y values and calculates the
	 * azimuthal angle off the x-axis in the x-y plane having a range between
	 * 0 and 2*pi (360 degrees), then sets and returns the value of theta
	 */
	public double calcTheta(double x, double y) {
		setTheta(Math.atan2(y, x));
		return theta;
	}
	
	/**
	 * The calcPhi method takes user defined x,y,z values and calculates the
	 * polar anlge off the z-axis having a range between 0 and pi (180 degrees)
	 * , then sets and returns the value of phi
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

