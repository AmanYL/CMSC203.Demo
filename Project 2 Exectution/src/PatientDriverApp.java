/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (The PatientDriverApp class is a driver program that creates instances of the Patient and Procedure classes,
 * 				initializes them with sample data, and displays patient information, procedure information, and total charges.
 * 				It includes the following methods:
 * 					- displayPatient: Given a patient object, it displays patient information.
 * 					- displayProcedure: Given a procedure object, it displays procedure information.
 * 					- calculateTotalCharges: Takes three procedure objects as parameters and returns the total charges of these procedures.)
 * Due: 09/25/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Amanuel Yilma
*/

public class PatientDriverApp {
	public static void main(String[] args) {
		//Creating an instance of the Patient class.  
		Patient patient1 = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234","301-123-4567", "Ted", "777-555-1212");
		
		//Creating three instances of the Procedure class using the classes different constructors.
		Procedure procedure1 = new Procedure();
		procedure1.setProcedure("Phsical Exam");
		procedure1.setProcedureDate("7/20/2019");
		procedure1.setPractitionerName("Dr. Irvine");
		procedure1.setCharge(3250.0);
		
		Procedure procedure2 = new Procedure("X-ray", "7/20/2019");
		procedure2.setPractitionerName("Dr. Jamison");
		procedure2.setCharge(5500.43);
		
		Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);
		
		//Printing output to the console
		System.out.println("Patient info:");
		displayPatient(patient1);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
		double totalCharge = calculateTotalCharges(procedure1, procedure2, procedure3);
		System.out.printf("Total Charges: $%,.2f \n\n" ,totalCharge);
		System.out.println("Student Name: Amanuel Yilma");
		System.out.println("MC#: M21177339");
		System.out.println("Due Date: 09/25/2023");
		
	}

	/**
	 * This method takes a Patient object as a parameter then displays 
	 * the name, address, and emergency-contact of the Patient object.
	 * @param p a Patient object
	 */
	public static void displayPatient(Patient p)
	{
		System.out.println(" Name: "+p.buildFullName());
		System.out.println(" Address: "+p.buildAddress());
		System.out.println(" EmergencyContact: "+p.buildEmergencyContact());
		System.out.println();
	}
	/**
	 * This method takes a Procedure object as a parameter then displays the name of the procedure, 
	 * date of the procedure, name of the practitioner and the charge of the Procedure object.
	 * @param procd a Procedure object
	 */
	public static void displayProcedure(Procedure procd)
	{
		System.out.println("\tProcedure: "+procd.getProcedure());
		System.out.println("\tProcedureDate="+procd.getProcedureDate());
		System.out.println("\tPractitioner="+procd.getPractitionerName());
		System.out.println("\tCharge="+procd.getCharge());
		System.out.println();
	}
	/**
	 * This method takes 3 Procedure objects as parameters and returns the sum of the charge of the
	 * 3 objects as a double.
	 * @param p1 a Procedure object
	 * @param p2 a Procedure object
	 * @param p3 a Procedure object
	 * @return the total charge of the 3 procedures
	 */
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3)
	{
		double total = p1.getCharge() + p2.getCharge() + p3.getCharge();
		return total;
	}
} 
