import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {
	Property sampleProperty;
	Property anotherProperty;
	ManagementCompany managementC1;
	ManagementCompany managementC2;
	ManagementCompany managementC3;
	ManagementCompany managementC4;
	
	@BeforeEach
	void setUp() throws Exception {
		managementC1 = new ManagementCompany();		
		managementC2 = new ManagementCompany("Berket","3930213",14);
		managementC3 = new ManagementCompany("Walid","4629451",12,0,0,7,5);
		managementC4 = new ManagementCompany(managementC2);	
		sampleProperty = new Property("Wakanda","Talokan", 5412.0, "T'Challa",4,5,3,2);
		anotherProperty = new Property("Bueno","Bahir Dar", 1285.0, "Zemede",1,4,2,3);
	}

	@AfterEach
	void tearDown() throws Exception {
		managementC1 = managementC2 = managementC3 = managementC4 = null;
	}

	@Test
	void testGetHighestRentProperty() {
		managementC1.addProperty(sampleProperty);
		managementC1.addProperty(anotherProperty);
		assertEquals(sampleProperty.toString(),managementC1.getHighestRentProperty().toString());
	}

	@Test
	void testGetMgmFeePer() {
		
		assertEquals(0.14,managementC2.getMgmFeePer());
	}

	@Test
	void testGetName() {
		assertEquals("Walid",managementC3.getName());
	}

	@Test
	void testGetPlot() {
		assertEquals(managementC2.getPlot().toString(),managementC4.getPlot().toString());
	}

	@Test
	void testGetPropertiesCount() {
		managementC2.addProperty(sampleProperty);
		managementC2.addProperty(anotherProperty);
		assertEquals(2, managementC2.getPropertiesCount());
		
		//Adding another property after the previous test, to test again.
		managementC2.addProperty("Demeke", "Wollo", 2340, "Gech");
		assertEquals(3, managementC2.getPropertiesCount());
	}

	@Test
	void testGetTaxID() {
		assertEquals("4629451", managementC3.getTaxID());
	}

	@Test
	void testGetTotalRent() {
		managementC4.addProperty(sampleProperty);
		managementC4.addProperty(anotherProperty);
		assertEquals(6697,managementC4.getTotalRent());
	}

	@Test
	void testIsManagementFeeValid() {
		assertTrue(managementC4.isManagementFeeValid());
	}

	@Test
	void testIsPropertiesFull() {
		Property sampleProperty1 = new Property ("Sunsational", "Beckman", 2613.0, "BillyBob Wilson",2,5,2,2);
		Property sampleProperty2 = new Property ("TezeraDynamics", "Wuchale", 4844.0, "Menlik and Tayitu",6,8,2,2);
		Property sampleProperty3 = new Property ("Basha.Tela.Ebate", "Shiro Meda", 4114.0, "Costa",0,0,2,2);
		Property sampleProperty4 = new Property ("CakeFromJimma", "Sodo", 34905.0, "Anwar",9,8,1,2);
		Property sampleProperty5 = new Property ("Burger", "Wollo", 5327.0, "No_owner",9,2,1,4);
		
		managementC2.addProperty(sampleProperty1);
		managementC2.addProperty(sampleProperty2);
		managementC2.addProperty(sampleProperty3);
		managementC2.addProperty(sampleProperty4);
		managementC2.addProperty(sampleProperty5);
		
		assertTrue(managementC2.isPropertiesFull());
	}

	@Test
	void testRemoveLastProperty() {
		managementC3.addProperty(sampleProperty);
		managementC3.addProperty(anotherProperty);
		managementC3.removeLastProperty();//Removing the last property.
//		
		assertEquals(null, managementC3.getProperties()[managementC3.getPropertiesCount()]);
	}

	@Test
	void testAddProperty() {
		assertEquals(0, managementC1.addProperty(sampleProperty));
		assertEquals(1, managementC1.addProperty(anotherProperty));
		assertEquals(-4, managementC1.addProperty(sampleProperty));
		assertEquals(2, managementC1.addProperty("Demeke", "Wollo", 2340, "Gech"));
		assertEquals(3, managementC1.addProperty("CakeFromJimma", "Sodo", 34905.0, "Anwar",9,8,1,2));
		assertEquals(4, managementC1.addProperty("TezeraDynamics", "Wuchale", 4844.0, "Menlik and Tayitu",6,8,2,2));
		assertEquals(-1, managementC1.addProperty(sampleProperty));
		
	}


	@Test
	void testToString() {
		managementC2.addProperty(sampleProperty);
		managementC2.addProperty(anotherProperty);
		
		String expectedStr = ("List of the properties for Berket, taxID: 3930213\n"
				+ "______________________________________________________\n"
				+ "Wakanda,Talokan,T'Challa,5412.0\n"
				+ "Bueno,Bahir Dar,Zemede,1285.0\n"
				+ "______________________________________________________\n"
				+ "\n"
				+ " total management Fee: 937.58");
		
		assertEquals(expectedStr,managementC2.toString());
	}

}
