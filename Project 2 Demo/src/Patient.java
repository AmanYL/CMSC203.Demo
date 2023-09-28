/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (The Patient class represents information about a medical patient. It includes fields for the patient's:
 * 					- First name, middle name, and last name
 * 					- Street address, city, state, and ZIP code
 * 					- Phone number
 * 					- Name and phone number of emergency contact
 * 				The class provides constructors, accessors, mutators, and methods to build the full name, address, and emergency contact details.
 * 				It also includes a toString method to display all patient information.)
 * Due: 09/25/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Amanuel Yilma
*/
public class Patient {

	private String firstName, middleName, lastName;
	private String streetAddress, city, state, zipCode, emergencyContactName, phoneNum, emergencyContactPhone; 
	
	//Constructors
	public Patient()
	{
		
	}
	public Patient(String firstName, String middleName,String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNum, String emContactName, String emPhone)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.emergencyContactName = emContactName;
		this.zipCode = zipCode;
		this.phoneNum = phoneNum;
		this.emergencyContactPhone = emPhone;	
	}
	
	//Accessors
	public String getFirstName()
	{
		return firstName;
	}
	public String getMiddleName()
	{
		return middleName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getStreetAddress()
	{
		return streetAddress;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getEmergencyContactName()
	{
		return emergencyContactName;
	}
	public String getZipCode()
	{
		return zipCode;
	}
	public String getPhoneNumber()
	{
		return phoneNum;
	}
	public String getEmergencyContactPhone()
	{
		return emergencyContactPhone;
	}
	
	//Mutators 
	public void setFirstName(String n)
	{
		firstName = n;
	}
	public void setMiddleName(String n)
	{
		middleName = n;
	}
	public void setLastName(String n)
	{
		lastName = n;
	}
	public void setStreetAddress(String n)
	{
		streetAddress = n;
	}
	public void setCity(String n)
	{
		city = n;
	}
	public void setState(String n)
	{
		state = n;
	}
	public void setEmergencyContactName(String n)
	{
		emergencyContactName = n;
	}
	public void setZipCode(String n)
	{
		zipCode = n;
	}
	public void setPhoneNumber(String n)
	{
		phoneNum = n;
	}
	public void setEmergencyContactPhone(String n)
	{
		emergencyContactPhone = n;
	}
	
	//Methods
	/**
	 * This method returns the full name of an instance of this class
	 * by concatenating the instance's first, second, and last name.
	 * @return the concatenation of the the first, second, and last name separated by space.
	 */
	public String buildFullName()
	{
		String builtName = (firstName+" "+middleName+" "+lastName);
		return builtName;
	}
	/**
	 * This method returns the full address of an instance of this class
	 * by concatenating the instance's street address, city, state, and 
	 * zip code.
	 * @return the concatenation of the street address, city, state, and zipcode separated by space.
	 */
	public String buildAddress()
	{
		String builtAddress = (streetAddress+" "+city+" "+state+" "+zipCode);
		return builtAddress;
	}
	/**
	 * This method returns the name of the emergency contact of the instance
	 * and the emergency contact's phone number.
	 * @return the concatenation of the emergency contact's name and phone number.
	 */
	public String buildEmergencyContact()
	{
		return (emergencyContactName+" "+emergencyContactPhone);
	}
	
	/**
	 * This method over rides the original toString method and displays all information of
	 * an object of this class.
	 * @return all information about the Patient instance.
	 */
	public String toString()
	{
		return (buildFullName()+"\n"+buildAddress()+"\n"+buildEmergencyContact());
	}
	
	
	
	
}
