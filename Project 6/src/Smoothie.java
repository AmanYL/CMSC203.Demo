public class Smoothie extends Beverage {
	int numOfFruits;
	boolean addProtien;
	
	//Constructor
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtien)
	{
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtien = addProtien;
	}
	//Accessors
	public int getNumOfFruits() {
		return numOfFruits;
	}
	public boolean getAddProtien() {
		return addProtien;
	}
	//Methods
	public String toString()
	{
		return super.toString()+'\n'+
				"Prortien is added: "+addProtien+'\n'+
				"Number of Fruits: "+"numofFruits"+'\n'+
				"Price: "+calcPrice();
	}
	public double calcPrice()
	{
		double subTotal = 0.0;
		if(numOfFruits > 0)
			subTotal += (numOfFruits * 0.5);
		if(addProtien)
			subTotal += 1.50;

		subTotal += this.addSizePrice();
		return subTotal;
	}
	@Override
	public boolean equals(Object anotherBev)
	{
		Smoothie otherBev = (Smoothie) anotherBev;
		if(super.equals(otherBev) &&
		   this.numOfFruits == otherBev.numOfFruits &&
		   this.getBasePrice() == otherBev.getBasePrice() &&
		   this.addProtien == otherBev.addProtien) {
			return true;
		}
		return false;
	}

}
