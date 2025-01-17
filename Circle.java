

package task6;

public class Circle {
	private double radius;
	
	public Circle()
	{
		double r=5;
		this.radius=r;
	}
	public Circle(double r)
	{
		this.radius=r;
	}
		public double getCircumference()
		{
	        // Calculate the circumference using the formula 2 * π * radius and return the result
	        return 2 * Math.PI * radius;
	    }
	

}
