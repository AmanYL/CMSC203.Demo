/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (The Procedure class represents a medical procedure performed on a patient. It includes fields for the procedure's:
 * 					- Name
 * 					- Date
 * 					- Name of the practitioner who performed the procedure
 * 					- Charges for the procedure
 * 				The class provides constructors, accessors, mutators, and a toString method to display all procedure information.)
 * Due: 09/25/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Amanuel Yilma
*/
public class Procedure {
	
	private String procedure, procedureDate, practitionerName;
	private double charge;
	
	//Constructors 
	public Procedure()
	{
		
	}
	public Procedure(String procedure, String date)
	{
		this.procedure = procedure;
		this.procedureDate = date;
	}
	public Procedure(String procedure, String date, String name, double charge)
	{
		this.procedure = procedure;
		this.procedureDate = date;
		this.practitionerName = name;
		this.charge = charge;
	}
	
	//Accessors
	public String getProcedure()
	{
		return procedure;
	}
	public String getProcedureDate()
	{
		return procedureDate;
	}
	public String getPractitionerName()
	{
		return practitionerName;
	}
	public double getCharge()
	{
		return charge;
	}
	
	//Mutators 
	public void setProcedure(String n)
	{
		procedure = n;
	}
	public void setProcedureDate(String n)
	{
		procedureDate = n;
	}
	public void setPractitionerName(String n)
	{
		practitionerName = n;
	}
	public void setCharge(double num)
	{
		charge = num;
	}
	
	/**
	 * This method over rides the original toString method and displays all information of
	 * an object of this class.
	 * @return all information about the Procedure instance.
	 */
	public String toString()
	{
		return (procedure+"\n"+procedureDate+"\n"+practitionerName+"\n"+charge);
	}
	
	
	 
	
	
	
	

}
