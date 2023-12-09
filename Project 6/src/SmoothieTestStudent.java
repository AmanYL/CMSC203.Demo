import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmoothieTestStudent {

	@Test
    public void testCalcPrice() {
        // Test with a small smoothie without protein and fruits
        Smoothie smallSmoothie = new Smoothie("Small Smoothie", Size.SMALL, 0, false);
        assertEquals(2.0, smallSmoothie.calcPrice(), 0.01);

        // Test with a medium smoothie with protein and 3 fruits
        Smoothie mediumSmoothie = new Smoothie("Medium Smoothie", Size.MEDIUM, 3, true);
        assertEquals(6.0, mediumSmoothie.calcPrice(), 0.01);

        // Test with a large smoothie without protein and 2 fruits
        Smoothie largeSmoothie = new Smoothie("Large Smoothie", Size.LARGE, 2, false);
        assertEquals(5.0, largeSmoothie.calcPrice(), 0.01);
    }

    @Test
    public void testGetNumOfFruits() {
        // Test for smoothie with 4 fruits
        Smoothie smoothieWithFruits = new Smoothie("Fruity Smoothie", Size.MEDIUM, 4, true);
        assertEquals(4, smoothieWithFruits.getNumOfFruits());

        // Test for smoothie with no fruits
        Smoothie smoothieWithoutFruits = new Smoothie("No Fruits Smoothie", Size.LARGE, 0, false);
        assertEquals(0, smoothieWithoutFruits.getNumOfFruits());
    }

    @Test
    public void testGetAddProtein() {
        // Test for smoothie with added protein
        Smoothie proteinSmoothie = new Smoothie("Protein Smoothie", Size.LARGE, 2, true);
        assertTrue(proteinSmoothie.getAddProtien());

        // Test for smoothie without added protein
        Smoothie noProteinSmoothie = new Smoothie("No Protein Smoothie", Size.SMALL, 1, false);
        assertFalse(noProteinSmoothie.getAddProtien());
    }

    @Test
    public void testToString() {
        // Test the string representation of the Smoothie object
        Smoothie smoothie = new Smoothie("Test Smoothie", Size.SMALL, 2, true);
        String expectedString = "Test Smoothie, SMOOTHIE\nPrortien is added: true\nNumber of Fruits: numofFruits\nPrice: " + smoothie.calcPrice();
        assertEquals(expectedString, smoothie.toString());
    }

    @Test
    public void testEquals() {
        // Test equals method for Smoothie objects
        Smoothie smoothie1 = new Smoothie("Berry Blend", Size.MEDIUM, 3, true);
        Smoothie smoothie2 = new Smoothie("Berry Blend", Size.MEDIUM, 3, true);
        Smoothie smoothie3 = new Smoothie("Tropical Twist", Size.LARGE, 2, false);

        assertTrue(smoothie1.equals(smoothie2)); // Same attributes
        assertFalse(smoothie1.equals(smoothie3)); // Different name and size
	}

}
