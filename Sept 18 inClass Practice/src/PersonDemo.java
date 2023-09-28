
public class PersonDemo {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		Person p2 = new Person("Kate");
//		Person p3 = new Person("John", 25);
//		
//		p1.name = "Kate";
//		p2.name = "John";
//		
//		p3.setName("Aberu");
//		p1.age = 20;
//		p2.age = 21;
//		
//		System.out.println(p1.name);
//		System.out.println(p2.name);
//	
//		p1.sayName();
//		p2.sayName();		
//		System.out.println(p3.toString());
		
//		Person p241 = new Person();
//		setValues("Nega", 23, p241);
//		System.out.println(p241);
		
		Person p82 = createPerson("ተዘራ",32);
		System.out.println(p82);
		
	}
	
	/*
	 * Implement a method named setValues that takes 3 parameters :
	 * a name, an age, and a Person and sets the name and age of the
	 * passed Person to those parameters.
	 */
	public static void setValues(String name, int age, Person p)
	{
		p.setName(name);
		p.setAge(age);
	}
	
	/*
	 * Implement a method named createPerson that takes 2 parameters:
	 * a name and an age and returns a Person object using the passed
	 * parameters. Make sure to test your method in the main to verify
	 * if the object has been created.
	 */
	public static Person createPerson(String name, int age)
	{
		Person p23 = new Person(name,age);
		return p23;
	}

}

