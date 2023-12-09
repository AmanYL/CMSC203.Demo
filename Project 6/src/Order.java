import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable{
	private int orderNum, orderTime;
	private Day orderDay;
	private Customer customer;
	private ArrayList<Beverage> beverages = new ArrayList<>();
	
	//Constructor
	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = cust;
	}
	public Order(Order otherOrder)
	{
		this.orderTime = otherOrder.orderTime;
		this.orderDay = otherOrder.orderDay;
		this.customer = otherOrder.customer;
		this.orderNum = otherOrder.orderNum;
		this.beverages = otherOrder.beverages;
	}
	//Accessors
	public int generateOrder()
	{
		Random random = new Random();
		int randomNum = random.nextInt(80000) + 10000;
		orderNum = randomNum;
		return randomNum;	 
	}
	public int getOrderNo() {
		return orderNum;
	}
	public int getOrderTime() {
		return orderTime;
	}
	public Day getOrderDay() {
		return orderDay;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Day getDay() {
		return orderDay;
	}
	//Methods
	public void setOrderNum(int num) {
		this.orderNum = num;
	}
	public boolean isWeekend()
	{
		if(orderDay == Day.SATURDAY || orderDay == Day.SUNDAY) {
			return true;
		}
		return false;
	}
	public Beverage getBeverage(int itemNo)
	{
		if(itemNo >= 0 && itemNo < beverages.size())
			return beverages.get(itemNo);
		
		return null;
	}
	public int getTotalItems()
	{
		int totalItem = beverages.size();
		return totalItem;
		
	}
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	public void addNewBeverage(String bevName, Size size)
	{
		beverages.add(new Alcohol(bevName, size, isWeekend()));
	}
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtien)
	{
		beverages.add(new Smoothie(bevName, size, numOfFruits, addProtien));
	}
	public double calcOrderTotal()
	{
		double subTotalOrder = 0;
		for(Beverage bever : beverages)
			subTotalOrder += bever.calcPrice();
		
		return subTotalOrder;
	}
	public int findNumOfBeveType(Type type)
	{
		int count = 0;
		for(Beverage bever : beverages)
		{
			if(bever.getType() == type)
				count++;
		}
		return count;	
	}
	public String toString()
	{
		StringBuilder strBuild = new StringBuilder
			  ("Order number: "+this.orderNum+'\n'+
			   "Order time: "+this.orderTime+'\n'+
			   "Order day: "+this.getOrderDay()+'\n'+
			   "Customer name: "+this.customer.getName()+'\n'+
			   "Customer age: "+this.customer.getAge()+'\n');
		for(Beverage bevr : beverages)
			strBuild.append(bevr.toString()+"\n");
		
		return strBuild.toString();
	}
	@Override
	public int compareTo(Object obj)
	{
		Order otherOrder = (Order)obj;
		if(this.orderNum == otherOrder.orderNum)
			return 0;
		else if(this.orderNum > otherOrder.orderNum)
			return 1;
		else
			return -1;
	}

}
