import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	private Property property1, property2, property3, property4, property5;
	
	@BeforeEach
	void setUp() throws Exception {
		property1 = new Property();
		property2 = new Property("Nanado Enrico","Cape Town", 582.4,"Abebe");
		property3 = new Property("Totot","Addis Ababa", 582.4,"Fekadu",3,4,5,7);
		property4 = new Property("Kaldis","Hawassa", 3647.47, "Hana");
		property5 = new Property(property2);
	}

	@AfterEach
	void tearDown() throws Exception {
		property1 = property2 = property3 = property4 = property5 = null;
	}

	@Test
	void testGetCity() {
		assertEquals("Addis Ababa", property3.getCity());
	}

	@Test
	void testGetOwner() {
		assertEquals("Hana", property4.getOwner());
	}

	@Test
	void testGetPlot() {
		/*
		 * I used assertFalse instead of asserTure because even if property5
		 * is a copy of property1 we expect them to reference different plot objects.
		 * This is caused as result of the copy constructor for the property class creating 
		 * a new plot when creating an instance of the property class.
		 */
		assertFalse(property2.getPlot().equals(property5.getPlot()));
	}

	@Test
	void testGetPropertyName() {
		assertEquals("Cape Town", property5.getCity());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(582.4, property2.getRentAmount ());
		assertEquals(0, property1.getRentAmount());
	}

	@Test
	void testToString() {
		assertEquals("Kaldis,Hawassa,Hana,3647.5", property4.toString());
	}

}
