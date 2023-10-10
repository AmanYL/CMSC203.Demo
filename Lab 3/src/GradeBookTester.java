import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook grdBook1, grdBook2; 
	
	@BeforeEach
	void setUp() throws Exception {
		grdBook1 = new GradeBook(5);
		grdBook2 = new GradeBook(5);
		
		grdBook1.addScore(1.75);
	    grdBook1.addScore(68.24);
	    grdBook2.addScore(43.23);
	    grdBook2.addScore(58.94);
	    grdBook2.addScore(12.87);
	}

	@AfterEach
	void tearDown() throws Exception {
		grdBook1 = grdBook2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(grdBook1.toString().equals("1.75 68.24 0.0 0.0 0.0 "));
		assertTrue(grdBook2.toString().equals("43.23 58.94 12.87 0.0 0.0 "));
	}

	@Test
	void testGetScoreSize() {
		assertEquals(grdBook1.getScoreSize(), 2);
		assertEquals(grdBook2.getScoreSize(), 3);
	}

	@Test
	void testSum() {
		assertEquals(69.99, grdBook1.sum(), 0.01);
		assertEquals(115.04, grdBook2.sum(), 0.01);
	}

	@Test
	void testMinimum() {
		assertEquals(1.75, grdBook1.minimum());
		assertEquals(12.87, grdBook2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(68.24, grdBook1.finalScore(), 0.01);
		assertEquals(102.17, grdBook2.finalScore(), 0.01);
	}

	
}
