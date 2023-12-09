import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

	@Test
    public void testCalcPrice() {
        // Test with a small coffee without extra shot or syrup
        Coffee smallCoffee = new Coffee("Small Coffee", Size.SMALL, false, false);
        assertEquals(2.0, smallCoffee.calcPrice(), 0.01);

        // Test with a medium coffee with extra shot and syrup
        Coffee mediumCoffee = new Coffee("Medium Coffee", Size.MEDIUM, false, true);
        assertEquals(3.5, mediumCoffee.calcPrice(), 0.01);

        // Test with a large coffee with extra shot
        Coffee largeCoffee = new Coffee("Large Coffee", Size.LARGE, true, false);
        assertEquals(4.5, largeCoffee.calcPrice(), 0.01);
    }

    @Test
    public void testGetExtraShot() {
        // Test for coffee with extra shot
        Coffee coffeeWithExtraShot = new Coffee("Extra Shot Coffee", Size.MEDIUM, true, false);
        assertTrue(coffeeWithExtraShot.getExtraShot());

        // Test for coffee without extra shot
        Coffee coffeeWithoutExtraShot = new Coffee("No Extra Shot Coffee", Size.LARGE, false, true);
        assertFalse(coffeeWithoutExtraShot.getExtraShot());
    }

    @Test
    public void testGetExtraSyrup() {
        // Test for coffee with extra syrup
        Coffee coffeeWithExtraSyrup = new Coffee("Extra Syrup Coffee", Size.LARGE, true, true);
        assertTrue(coffeeWithExtraSyrup.getExtraSyrup());

        // Test for coffee without extra syrup
        Coffee coffeeWithoutExtraSyrup = new Coffee("No Extra Syrup Coffee", Size.SMALL, false, false);
        assertFalse(coffeeWithoutExtraSyrup.getExtraSyrup());
    }

    @Test
    public void testToString() {
        // Test the string representation of the Coffee object
        Coffee coffee = new Coffee("Test Coffee", Size.SMALL, true, false);
        String expectedString = "Test Coffee, COFFEE\nContains ExtraShot: true\nContains ExtraSyrup: false\nPrice: " + coffee.calcPrice();
        assertEquals(expectedString, coffee.toString());
    }

    @Test
    public void testEquals() {
        // Test equals method for Coffee objects
        Coffee coffee1 = new Coffee("Latte", Size.LARGE, true, false);
        Coffee coffee2 = new Coffee("Latte", Size.LARGE, true, false);
        Coffee coffee3 = new Coffee("Mocha", Size.MEDIUM, false, true);

        assertTrue(coffee1.equals(coffee2)); // Same attributes
        assertFalse(coffee1.equals(coffee3)); // Different name and size
	}

}
