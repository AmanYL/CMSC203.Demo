public class Plot {
	private int x, y, width, depth;
	
	//Constructors
	public Plot() 
	{
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	public Plot(Plot otherPlot)
	{
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	
	//Mutators(Setters)
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	//Getters
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getWidth()
	{
		return width;
	}
	public int getDepth()
	{
		return depth;
	}
	
	//Methods
	private int endPointX()
	{
		return (this.x + this.width);
	}
	private int endPointY()
	{
		return(this.y + this.depth);
	}
	public boolean encompasses(Plot smallPlot)
	{
		boolean xEncomp = false;
		boolean yEncomp = false;
		
		if(smallPlot.x >= this.x && smallPlot.endPointX() <= this.endPointX())
			xEncomp = true;
		if(smallPlot.x >= this.x && smallPlot.endPointX() <= this.endPointX())
			yEncomp = true;
		
		return(xEncomp && yEncomp);
	}
	public boolean overlaps(Plot otherPlot)
	{
		boolean xOverlaps = false;
		boolean yOverlaps = false;
		
		if(otherPlot.endPointX() > this.x && this.endPointX() > otherPlot.x)
			xOverlaps = true;
		if(otherPlot.endPointY() > this.y && this.endPointY() > otherPlot.y)
			yOverlaps = true;
		
		return(xOverlaps && yOverlaps);

	}
	
	//toString
	public String toString()
	{
		return String.format("%d,%d,%d,%d", x,y,width,depth);
	}

}
