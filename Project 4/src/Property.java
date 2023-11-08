public class Property{
	private String propertyName, city, owner;
	private double rentAmount = 0.0;
	private Plot plotField; 
	
	//Constructors
	public Property()
	{
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0;
		plotField = new Plot();
	}
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		plotField = new Plot();
	}
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		plotField = new Plot(x, y, width, depth);
	}
	public Property(Property otherProp)
	{
		this.propertyName = otherProp.propertyName;
		this.city = otherProp.city;
		this.owner = otherProp.owner;
		this.rentAmount = otherProp.rentAmount; 
		plotField = new Plot(otherProp.getPlot());
	}
	
	//Getters
	public String getCity()
	{
		return city;
	}
	public String getOwner()
	{
		return owner;
	}
	public Plot getPlot()
	{
		return plotField;
	}
	public String getPropertyName()
	{
		return propertyName;
	}
	public double getRentAmount()
	{
		return rentAmount;
	}
	
	//toString
	public String toString()
	{
		return String.format("%s,%s,%s,%.1f",propertyName, city, owner, rentAmount);
	}
	
	
}
