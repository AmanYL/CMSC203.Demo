import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoDimRaggedArrayUtilityTestStudent {
	private double[][] dataS1 = {{12,  -3,  4,  5},
								 {472, -41, 54},  
								 {10,  -10, -14,-100, 12},
								 {1110}};
	TwoDimRaggedArrayUtility raggedArr2D = new TwoDimRaggedArrayUtility();
	@BeforeEach
	
	@AfterEach
	void tearDown() throws Exception {
		raggedArr2D = null;
	}
	@Test
	void testReadFile() throws IOException {
		File file1 = new File("dataSet15.txt");
		raggedArr2D.writeToFile(dataS1, file1);
		assertArrayEquals(dataS1, raggedArr2D.readFile(file1));
	}

	@Test
	void testGetTotal() {
		assertEquals(1511, raggedArr2D.getTotal(dataS1), 0.0001);
	}

	@Test
	void testGetAverage() {
		assertEquals(116.230769, raggedArr2D.getAverage(dataS1), 0.0001);
	}

	@Test
	void testGetRowTotal() {
		assertEquals(-102, raggedArr2D.getRowTotal(dataS1, 2), 0.0001);
	}

	@Test
	void testGetColumnTotal() {
		assertEquals(-95, raggedArr2D.getColumnTotal(dataS1, 3), 0.0001);
	}

	@Test
	void testGetHighestInRow() {
		assertEquals(472, raggedArr2D.getHighestInRow(dataS1,1), 0.0001);
	}

	@Test
	void testGetHighestInRowIndex() {
		assertEquals(0, raggedArr2D.getHighestInRowIndex(dataS1,1), 0.0001);
	}

	@Test
	void testGetLowestInRow() {
		assertEquals(-100, raggedArr2D.getLowestInRow(dataS1,2), 0.0001);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertEquals(3, raggedArr2D.getLowestInRowIndex(dataS1,2), 0.0001);
	}

	@Test
	void testGetHighestInColumn() {
		assertEquals(5, raggedArr2D.getHighestInColumn(dataS1,3), 0.0001);
	}

	@Test
	void testGetHighestInColumnIndex() {
		assertEquals(0, raggedArr2D.getHighestInColumnIndex(dataS1,3), 0.0001);
	}

	@Test
	void testGetLowestInColumn() {
		assertEquals(-100, raggedArr2D.getLowestInColumn(dataS1,3), 0.0001);
	}

	@Test
	void testGetLowestInColumnIndex() {
		assertEquals(2, raggedArr2D.getLowestInColumnIndex(dataS1,3), 0.0001);
	}

	@Test
	void testGetHighestInArray() {
		assertEquals(1110, raggedArr2D.getHighestInArray(dataS1), 0.0001);
	}

	@Test
	void testGetLowestInArray() {
		assertEquals(-100, raggedArr2D.getLowestInArray(dataS1), 0.0001);
	}

}
