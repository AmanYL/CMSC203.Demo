public abstract class Beverage implements Cloneable {
	protected String bevName;
	protected Type type;
	protected Size size;
	protected final double BASE_PRICE = 2.0, SIZE_PRICE = 1;
	
	//Constructors
	public Beverage(String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	//Accessors
	public double getBasePrice() {
		return BASE_PRICE;
	}
	public Type getType() {
		return type;
	}
	public String getBevName() {
		return bevName;
	}
	public Size getSize() {
		return size;
	}
	//Other methods
	public double addSizePrice() {
		if(this.size == Size.SMALL)
			return BASE_PRICE;
		else if(this.size == Size.MEDIUM)
			return BASE_PRICE + SIZE_PRICE;
		else
			return BASE_PRICE + (2 * SIZE_PRICE);
	}
	@Override
	public String toString(){
		String str = bevName+", "+type;
		return str;
	}
	@Override
	public boolean equals(Object anotherBev)
	{
		Beverage otherBev = (Beverage)anotherBev;
		if(this.bevName.equals(otherBev.bevName) &&
		   this.size == otherBev.size && 
		   this.type == otherBev.type) {
			return true;
		}
		return false;
	}
	public abstract double calcPrice();
	
}
