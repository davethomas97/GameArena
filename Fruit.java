public class Fruit
{
	private double xPosition;
	private double yPosition;
	private double size;
	private String colour = "RED";
	
	public double getXPosition()
	{
		return xPosition;
	}
	public double getYPosition()
	{
		return yPosition;
	}
	public void setXPosition(double x)
	{
		xPosition = x;
	}
	public void setYPosition(double y)
	{
		yPosition = y;
	}
	public double randomPosition()
	{
		return Math.random()*500;
	}
	public Fruit(double x, double y, double diameter, String col)
	{
		xPosition = x;
		yPosition = y;

		size = diameter;
		colour = col;
	}
}