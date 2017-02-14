public class Fruit
{
	private double xPosition;
	private double yPosition;
	private double size;
	private String colour = "RED";
	private double randomXPos;
	private double randomYPos;
	
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
	public void randomXPosition()
	{
		randomXPos = (double)Math.random()*500;
	}
	public void randomYPosition()
	{
		randomYPos = (double)Math.random()*500;
	}
	public void move()
	{
		xPosition = randomXPos;
		yPosition = randomYPos;
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