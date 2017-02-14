public class Snake
{
	//Instance Variables
	private double xPosition;
	private double yPosition;
	private double length;   //---->
	private double speed;    //---->
	private String colour;
	
	private Rectangle snakeHead = new Rectangle(xPosition, yPosition, 20, 20, colour);

	//Constructors
	public Snake(double x, double y)
	{
		xPosition = x;
		yPosition = y;
		colour = "GREEN";
	}
	
	public void addTo(GameArena arenaName)
	{
	
	}
}