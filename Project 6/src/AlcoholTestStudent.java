import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {

	@Test
    public void testCalcPrice() {
        // Test with a small alcohol on a weekday
        Alcohol smallAlcoholWeekday = new Alcohol("Small Beer", Size.SMALL, false);
        assertEquals(2.0, smallAlcoholWeekday.calcPrice(), 0.01);

        // Test with a medium alcohol on a weekend
        Alcohol mediumAlcoholWeekend = new Alcohol("Medium Wine", Size.MEDIUM, true);
        assertEquals(3.60, mediumAlcoholWeekend.calcPrice(), 0.01);

        // Test with a large alcohol on a weekday
        Alcohol largeAlcoholWeekday = new Alcohol("Large Whiskey", Size.LARGE, false);
        assertEquals(4.00, largeAlcoholWeekday.calcPrice(), 0.01);
    }

    @Test
    public void testIsWeekend() {
        // Test for alcohol offered on a weekend
        Alcohol weekendAlcohol = new Alcohol("Weekend Drink", Size.MEDIUM, true);
        assertTrue(weekendAlcohol.isWeekend());

        // Test for alcohol offered on a weekday
        Alcohol weekdayAlcohol = new Alcohol("Weekday Drink", Size.LARGE, false);
        assertFalse(weekdayAlcohol.isWeekend());
    }

    @Test
    public void testToString() {
        // Test the string representation of the Alcohol object
        Alcohol alcohol = new Alcohol("Test Drink", Size.SMALL, true);
        String expectedString = "Test Drink, ALCOHOL\nOffered on weekends: true\nPrice: " + alcohol.calcPrice();
        assertEquals(expectedString, alcohol.toString());
    }

    @Test
    public void testEquals() {
        // Test equals method for Alcohol objects
        Alcohol alcohol1 = new Alcohol("Vodka", Size.LARGE, true);
        Alcohol alcohol2 = new Alcohol("Vodka", Size.LARGE, true);
        Alcohol alcohol3 = new Alcohol("Whiskey", Size.MEDIUM, false);

        assertTrue(alcohol1.equals(alcohol2)); // Same attributes
        assertFalse(alcohol1.equals(alcohol3)); // Different name and size
	}

}
