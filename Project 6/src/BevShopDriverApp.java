import java.util.Scanner;
public class BevShopDriverApp {

	public static void main(String[] args) {
		Scanner keyB = new Scanner(System.in);
		BevShop shop = new BevShop();
		
		System.out.println("The current order in process can have at most 3 alcholic beverages.");
		System.out.println("The minimum age to order alcohol is 21");
		
		System.out.println("Start a new order please: ");
		shop.startNewOrder(12, Day.MONDAY, "Abebe", 18);
		System.out.println("Your Total order for now is "+shop.totalMonthlySale());
		
		System.out.print("Please enter your name: ");
		String usrName = keyB.nextLine();
		System.out.print("Please enter your age: ");
		int usrAge = keyB.nextInt();
		shop.startNewOrder(12, Day.SUNDAY, usrName, usrAge);
		
		if(shop.isValidAge(usrAge))
			System.out.println("Your age is above 20 and you are eligible to order alcohol");
		char done;
		do 
		{
			System.out.print("What type of drink would you like:\n A.Alcohol   B.Coffee  C.Smoothie\n");
			char choice = keyB.next().charAt(0);
			while(choice != 'A' && choice != 'B' && choice != 'C' && choice != 'a' && choice != 'b' && choice != 'c')
			{
				System.out.print("Please choose a valid letter!");
				choice = keyB.next().charAt(0);
			}
			
			switch(choice) {
			case 'a':
			case 'A':
				if(shop.isValidAge(usrAge))
					if(shop.isEligibleForMore() == false)
						shop.processAlcoholOrder("Martini", Size.LARGE);
					else
						System.out.println("You have reached the maximum number of alcohols allowed per order");
				else
					System.out.println("You are under-age!");
				break;
			case 'b':
			case 'B':
				shop.processCoffeeOrder("Mocha", Size.MEDIUM, true, true);
				break;
			case 'c':
			case 'C':
				System.out.println("How many fruits do you want in this smoothie");
				int fruitNum = keyB.nextInt();
				shop.processSmoothieOrder("Fruit-Tropica", Size.SMALL, fruitNum, true);
				break;
			}
			System.out.println("The current order of drinks is "+shop.getCurrentOrder().getTotalItems());
			System.out.println("The Total price on the Order is: "+shop.getCurrentOrder().calcOrderTotal());
			System.out.println("Would you like more drinks(Y/N)?");
			done = keyB.next().charAt(0);
		}while(done == 'y' || done == 'Y');
		
		System.out.println(shop.toString());
		System.out.println("GoodBye!");
		
		
		
			
			
		
		
		

	}

}
