public class Coffee extends Beverage{
	private boolean extraShot, extraSyrup;
	
	//Constructor
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	//Accessors
	public boolean getExtraShot() {
		return extraShot;
	}
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	//Methods
	public double calcPrice() {
		double subTotal = 0.0;
		if(extraShot == true)
			subTotal += 0.5;
		if(extraSyrup == true)
			subTotal += 0.5;
		
		subTotal += this.addSizePrice();
		return subTotal;
	}
	@Override
	public String toString()
	{
		return super.toString()+'\n'+
				"Contains ExtraShot: "+extraShot+'\n'+
				"Contains ExtraSyrup: "+extraSyrup+'\n'+
				"Price: "+calcPrice();
	}
	@Override
	public boolean equals(Object anotherBev)
	{
		Coffee otherBev = (Coffee) anotherBev;
		if(super.equals(otherBev) &&
		   this.extraShot == otherBev.extraShot && 
		   this.getBasePrice() == otherBev.getBasePrice() &&
		   this.extraSyrup == otherBev.extraSyrup) {
			return true;
		}
		return false;
	}
}
