import java.util.ArrayList;
import java.util.Collections;

public class BevShop implements BevShopInterface {
	public static final int MAX_FRUIT = 5;
	public static final int MAX_ORDER_FOR_ALCOHOL = 3;
	public static final int MAX_TIME = 23;
	public static final int MIN_AGE_FOR_ALCOHOL = 21;
	public static final int MIN_TIME = 8;
	
	private int numOfAlcohol = 0, currentOrderNum;
	private ArrayList<Order> orders = new ArrayList<>();
	
	public boolean isValidTime(int time){
		if(time >= 8 && time <= 23)  
			return true;
		return false;
	}
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
	public boolean isMaxFruit(int numOfFruits) {
		if(numOfFruits > MAX_FRUIT)
			return true;
		return false;
	}
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	public boolean isEligibleForMore() {
		if(numOfAlcohol >= MAX_ORDER_FOR_ALCOHOL)
			return true;
		return false;
	}
	public int getNumOfAlcoholDrink() {
		return numOfAlcohol;
	}
	public boolean isValidAge(int age) {
		if(age >= MIN_AGE_FOR_ALCOHOL)
			return true;
		return false;
	}
	public void startNewOrder(int time, Day day, String customerName, int customerAge)
	{
		Customer cust = new Customer(customerName, customerAge);
		Order currentOrder = new Order(time,day,cust);
		orders.add(currentOrder);
		currentOrder.setOrderNum(currentOrder.generateOrder());
		currentOrderNum = orders.size()-1;
	}
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup){
		orders.get(currentOrderNum).addNewBeverage(bevName,size, extraShot, extraSyrup);
	}
	public void processAlcoholOrder(String bevName, Size size){
		orders.get(currentOrderNum).addNewBeverage(bevName, size); 
		numOfAlcohol++;
	}
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		orders.get(currentOrderNum).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	public int findOrder(int orderNo) {
		for(int i=0; i < orders.size(); i++)
		{
			if(orders.get(i).getOrderNo() == orderNo)
				return i;
		}
		return -1;
	}
	public double totalOrderPrice(int orderNo) {
		int orderIndx = this.findOrder(orderNo);
		return orders.get(orderIndx).calcOrderTotal();
	}
	public double totalMonthlySale() {
		 double monthlyRevenue = 0;
		 for(Order currOrder : orders) {
			 monthlyRevenue += currOrder.calcOrderTotal();
			 }
		 return monthlyRevenue;
	}
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}
	public Order getCurrentOrder() {
		return orders.get(currentOrderNum);
	}
	public Order getOrderAtIndex(int index) {
		return new Order(orders.get(index));
	}
	public void sortOrders() {
		Collections.sort(orders);
	}
	public String toString() {
		StringBuilder strBuild = new StringBuilder();
		for(Order order : orders)
			strBuild.append(order.toString()+'\n');
		strBuild.append("Total Monthly sale: "+totalMonthlySale());
		
		return strBuild.toString();
	}
	
}
