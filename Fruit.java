public class Fruit
{
	private double xPosition;				// The x co-ordinate of the fruit
	private double yPosition;				// The y co-ordinate of the fruit
	private double size;					// Size of the fruit
	private String colour = "RED";			// Fruit colour
	
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

	public void move()
	{
		xPosition = (double)Math.random()*500;
		yPosition = (double)Math.random()*500;
	}
	public boolean fruitEaten()
	{
		return (Math.abs(xPosition - Snake.getXPosition()) < 20 && Math.abs(yPosition - Snake.getYPosition()) < 20);
	}
	public void addTo(GameArena arenaName)
	{
		
	}
	
	public Fruit(double x, double y, double diameter, String col)
	{
		xPosition = x;
		yPosition = y;

		size = diameter;
		colour = col;
	}
}