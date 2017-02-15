public class Snake
{
	//Instance Variables
	private double xPosition;
	private double yPosition;
	private xDrirection;
	private yDirection;
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
		xDrirection = 1;
		yDirection = 0;
	}
	
	public void addTo(GameArena arenaName)
	{
		
	}

	
	public moveUp()
	{
		xDrirection = 0;
		yDirection = 1;
		xPosition = xPosition + xDrirection;
		yPosition = yPosition + yDirection;
	}
	
	public moveDown()
	{
		xDrirection = 0;
		yDirection = -1;
		xPosition = xPosition + xDrirection;
		yPosition = yPosition + yDirection;	
	}
	
	public moveLeft()
	{
		xDrirection = -1;
		yDirection = 0;
		xPosition = xPosition + xDrirection;
		yPosition = yPosition + yDirection;		
	}	

	public moveRight()
	{
		xDrirection = 1;
		yDirection = 0;
		xPosition = xPosition + xDrirection;
		yPosition = yPosition + yDirection;		
	}	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}