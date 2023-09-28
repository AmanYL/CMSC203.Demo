public class Person {	
	private String name;
	private int age;

	//Constructor 
	public Person()
	{
		name = "No name";
		age = 18;
	}
	
	//We are writing a constructor that takes a parameter for name and it sets name to a past parameter and the age to a default value of 18.
	public Person(String name)
	{
		this.name = name; /*Using the keyword "this" lets the compiler distinguish between the 
							local variable that was passed as a parameter and the attribute when they both have the same name.
							The variable with the keyword this is thought of as the attribute instead of the local variable
							"this.name" in this case is considered as a the attribute not the local variable.*/
		age = 18;
		
	}
	
	/*
	 * We are writing a third constructor that takes a parameter of age,
	 * sets the age to the past value of the parameter and sets the name to "No name"
	 */
	public Person(int age)
	{
		age = 18;
		name = "No name";
	}
	
	/*
	 * This constructor takes has a parameter for both name and age
	 */
	public Person(String n, int a)
	{
		name = n;
		age = a;
	}
	/*
	 * This constructor takes a Person object as parameter and copies all the 
	 * attributes of the parameter (Person object) to the new Person object being created.
	 * This can be called a copy constructor. 
	 */
	public Person(Person p1)
	{
		name = p1.name;
		age = p1.age;
	}
	
	
	//Method
	public void sayName()
	{
		System.out.println("Hi my name is "+ name + " an I am "+ age + " Years old");
		
	}

	public void haveBirthday()
	{
		age++;

	}
	
	/*
	 * This "toString" method allows us to print the contents of the objects created by the Person class 
	 * whenever an just the name of the object of this class is passed as a parameter instead of returning 
	 * the address of the object. 
	 */
	
	
	//toString
	public String toString()
	{
		return name + " " + age;
	}

	
	//Mutator (Setter)
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	//Getter (Access Modifiers)
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
}
