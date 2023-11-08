import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	private Plot plot1, plot2, plot3, plot4;
	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot();
		plot2 = new Plot(4,2,8,5);
		plot3 = new Plot(0,0,10,10); 
		plot4 = new Plot(plot2);
	}

	@AfterEach
	void tearDown() throws Exception {
		plot1 = plot2 = plot3 = plot4 = null;  
	}

	@Test
	void testGetX() {
		assertEquals(4, plot2.getX());
	}

	@Test
	void testGetY() {
		assertEquals(0, plot1.getY());
	}

	@Test
	void testGetWidth() {
		assertEquals(8, plot2.getWidth());
	}

	@Test
	void testGetDepth() {
		assertEquals(10, plot3.getDepth());
	}

	@Test
	void testEncompasses() {
		assertTrue(plot3.encompasses(plot1));
	}

	@Test
	void testOverlaps() {
		assertTrue(plot3.overlaps(plot4));
	}

	@Test
	void testToString() {
		assertEquals("0,0,1,1",plot1.toString());
	}

}
