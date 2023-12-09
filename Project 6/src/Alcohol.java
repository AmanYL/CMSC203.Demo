public class Alcohol extends Beverage {
	private boolean isWeekend;

	//Constructor
	public Alcohol(String bevName, Size size, boolean isWeekend) {
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	//Methods
	public double calcPrice() {
		double subTotal = 0;
		if(isWeekend)
			subTotal += 0.60;
		
		subTotal += this.addSizePrice();
		return subTotal;
	}
	public boolean isWeekend() {
		return isWeekend;
	}
	public String toString() {
		return super.toString()+
				"\nOffered on weekends: "+isWeekend+
				"\nPrice: "+this.calcPrice();
	}
	@Override
	public boolean equals(Object anotherBev)
	{
		Alcohol otherBev = (Alcohol) anotherBev;
		if(super.equals(otherBev) &&
		   this.isWeekend == otherBev.isWeekend &&
		   this.getBasePrice() == otherBev.getBasePrice()){
			   return true;	   
		}
		return false;
	}
}
