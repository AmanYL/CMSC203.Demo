import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char choice;
		
		do
		{
		Movie movie1 = new Movie();
		System.out.println("Enter the name of the movie");
		movie1.setTitle(keyboard.nextLine());
		
		System.out.println("Enter the rating of the movie");
		movie1.setRating(keyboard.nextLine());
		
		System.out.println("Enter the number of tickets sold for this movie");
		movie1.setSoldTickets(keyboard.nextInt());
		
		System.out.println(movie1);
		System.out.println("Do you want to enter another movie? (y or n)");
		choice = keyboard.next().charAt(0);
		
		keyboard.nextLine();
		}while(choice == 'y' || choice == 'Y');
		System.out.println("Goodbye");
		keyboard.close();
	}
}
