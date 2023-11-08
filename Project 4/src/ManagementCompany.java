/*
 * Class: CMSC203 
 * Instructor:
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __________
*/


public class ManagementCompany extends Property{
	public static final int MAX_PROPERTY = 5;
	public static final int MGMT_DEPTH = 10;
	public static final int MGMT_WIDTH = 10;
	private String name, taxID;
	private double mgmFee;
	private Property[] properties = new Property[MAX_PROPERTY];
	private Plot plot;
	private int numberOfProperties = 0;
	
	//Constructors
	public ManagementCompany()
	{
		name = "";
		taxID = "";
		mgmFee = 0.0;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		for(int i = 0; i < properties.length; i++)
			properties[i] = new Property();
	}
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		for(int i = 0; i < properties.length; i++)
			properties[i] = new Property();
	}
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		plot = new Plot(x, y, width, depth);
		for(int i = 0; i < properties.length; i++)
			properties[i] = new Property();
	}
	public ManagementCompany(ManagementCompany otherComp)
	{
		this.name = otherComp.name;
		this.taxID = otherComp.taxID;
		this.mgmFee = otherComp.mgmFee;
		plot = new Plot(otherComp.getPlot());
		for(int i = 0; i < otherComp.getPropertiesCount(); i++)
			this.properties[i] = new Property(otherComp.properties[i]);
	}
	
	//Getters
	public Property getHighestRentProperty()
	{
		Property highestRentPrpty = properties[0];
		for(int i = 1; i < properties.length; i++)
		{
			double itteratingRent = properties[i].getRentAmount();
			
			if(itteratingRent > highestRentPrpty.getRentAmount())
				highestRentPrpty = properties[i];
		}
		return highestRentPrpty;
	}
	public double getMgmFeePer()
	{
		return (mgmFee/100.0);
	}
	public String getName()
	{
		return name;
	}
	public Plot getPlot()
	{
		return new Plot(plot);
	}
	public Property[] getProperties()
	{
		return properties;
	}
	public int getPropertiesCount()
	{
		return numberOfProperties;
	}
	public String getTaxID()
	{
		return taxID;
	}
	public double getTotalRent()
	{
		double sum = 0.0;
		for(int i = 0; i < numberOfProperties; i++)
		{
			sum += properties[i].getRentAmount();
		}
		return sum;
	}
	//Methods
	public boolean isManagementFeeValid()
	{
		if(mgmFee > 0 && mgmFee < 100)
			return true;
		
		return false;
	}
	public boolean isPropertiesFull()
	{
		if(numberOfProperties == MAX_PROPERTY)
			return true;
		
		return false;
	}
	public void removeLastProperty()
	{
		properties[numberOfProperties-1] = null;
		numberOfProperties--;
	}
	
	//Additional method I included.
	public double getTotalmgmFee()
	{
		double totalmgmFee;
		totalmgmFee = this.getTotalRent() * getMgmFeePer();
			
		return totalmgmFee;
	}
	
	//addProperty methods
	public int addProperty(String name, String city, double rent, String owner)
	{
		if(isPropertiesFull())
			return -1;
		
		//Creating a new property
		Property newProperty = new Property(name, city, rent, owner);
		
		if(newProperty.getPlot() == null)
			return -2;
		if(!plot.encompasses(newProperty.getPlot()))
			return -3;
		for(int i = 0; i < numberOfProperties; i++)
		{
			Plot currentPlot = properties[i].getPlot();
			if(currentPlot.overlaps(newProperty.getPlot()))
				return -4;
		}
		
		properties[numberOfProperties] = newProperty;
		numberOfProperties++;
		return (numberOfProperties-1);
	}
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
	{
		if(isPropertiesFull())
			return -1;
		
		//Creating a new property
		Property newProperty = new Property(name, city, rent, owner, x, y, width, depth);
		
		if(newProperty.getPlot() == null)
			return -2;
		if(!plot.encompasses(newProperty.getPlot()))
			return -3;
		for(int i = 0; i < numberOfProperties; i++)
		{
			Plot currentPlot = properties[i].getPlot();
			if(currentPlot.overlaps(newProperty.getPlot()))
				return -4;
		}
		
		properties[numberOfProperties] = newProperty;
		numberOfProperties++;
		return (numberOfProperties-1);
	}
	public int addProperty(Property priorProperty)
	{
		if(isPropertiesFull())
			return -1;
		if(priorProperty == null)
			return -2;
	
		//Creating a new property
		Property newProperty = new Property(priorProperty);
		
		if(!plot.encompasses(newProperty.getPlot()))
			return -3;
		for(int i = 0; i < numberOfProperties; i++)
		{
			Plot currentPlot = properties[i].getPlot();
			if(currentPlot.overlaps(newProperty.getPlot()))
				return -4;
		}
		
		properties[numberOfProperties] = newProperty;
		numberOfProperties++;
		return (numberOfProperties-1);
	}
	
	//toString
	public String toString()
	{
		StringBuilder strBuild = new StringBuilder();
	    strBuild.append("List of the properties for "+getName()+", taxID: "+getTaxID()+'\n');
	    strBuild.append("______________________________________________________\n");
	    for(int i = 0; i < numberOfProperties; i++) 
	      {
	        strBuild.append(properties[i].toString()+'\n');
	      }
	    strBuild.append("______________________________________________________\n");
	    strBuild.append("\n");
	    strBuild.append(" total management Fee: "+getTotalmgmFee());
	    
	    return (strBuild.toString());
	}
	
}
