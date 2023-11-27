import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {
	private double[][] newArr = {{-2.5, -5.3, 6.1},
								 {-4.4, 8.2},
								 {2.3, -7.5},
								 {-4.2, 7.3, -5.9, 2.6}};
	
	@BeforeEach
	void setUp() throws Exception {	
	}
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testCalculateHolidayBonus() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(newArr);
			assertEquals(5000.0,  result[0], .001);
			assertEquals(5000.0,  result[1], .001);
			assertEquals(5000.0,  result[2], .001);
			assertEquals(7000.0,  result[3], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}
	@Test
	void testCalculateTotalHolidayBonus() {
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(newArr), .001);
	}

}
