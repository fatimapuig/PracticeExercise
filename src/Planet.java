public class Planet {
	
	private String name;
	private double distance; // in light-years from Earth
	private double radius; // in kilometers
	private int population;
	
	
	/*
	 *  Create a constructor that uses the given parameters. 
	 *  A planet has a 50% chance of having alien life. 
	 *  In case of alien life, population is random.
	 *  Hint! Make use of Math.random().
	 *  https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#random--
	 */
	public Planet(String name, double distance, double radius) {
		// Your code here
	}
	
	/*
	 * Creates an identical planet to the one given.
	 */
	public Planet(Planet planet) {
		// Your code here
	}
	
	// Equals
	public boolean equals(Object e) {
		if(e instanceof Planet && ((Planet) e).name.equals(this.name))
			return true;
		return false;
	}
	// Getters
	public String getName() {
		return this.name;
	}
	
	public double getDistance() {
		return this.distance;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public int getPopulation() {
		return this.population;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void getDistance(double distance) {
		this.distance = distance;
	}
	
	public void getRadius(double radius) {
		this.radius = radius;
	}
	
	public void getPopulation(int population) {
		this.population = population;
	}
	
	/*
	 * Write a method that indicates if there is alien life or not.
	 */
	public boolean alienLife() {
		// Your code here
		return false;
	}
	
	/*
	 * Write a method that returns the distance in miles:
	 * 1 light year is approximately 5.88e12 miles
	 */
	public double getDistanceMiles() {
		// Your code here
		return 0.0;
	}
	
	/*
	 * Assuming the planets are perfect spheres, return the volume 
	 * of the planet.
	 * V = 4/3 * pi * r^3
	 */
	public double getVolume() {
		// Your code here
		return 0.0;
	}
	
	/*
	 * Create a method that returns true if the calling Planet is
	 * bigger and false otherwise
	 */
	public boolean isBigger(Planet planet) {
		// Your code here
		return false;
	}
	
	/*
	 * A civilization has come to colonize the planet! If the planet 
	 * already has alien life, a war will break out. The planet
	 * with the bigger population will win, but their population will
	 * be reduced by 50%. In the case the populations are equal,
	 * no one will survive. If the planet is vacant, all of the 
	 * incoming population will move in. 
	 */
	public void colonize(int incomingPopulation) {
		// Your code here
	}
	
	/*
	 * Create a method where there's a 50/50 chance of a population
	 * boom or decrease. Either double or cut the population by half
	 */
	public void populationEvent() {
		// Your code here
	}
	
	/*
	 * Return the planet as a string
	 * The format should ble "Planet " + name
	 * Ex: Planet Jupiter
	 */
	public String toString() {
		// Your code here
		return null;
	}
	
	/* Create a method where two planets collide and the surviving one
	* (aka the bigger one) is returned. If they are the same, return null.
	 */
	public static Planet collision(Planet p1, Planet p2) {
		// Your code here
		return null;
	}
	    

	public static void main(String[] args) {
		
	}
}
