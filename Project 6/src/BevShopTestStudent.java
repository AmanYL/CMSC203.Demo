import static org.junit.Assert.*;
import org.junit.Test;

public class BevShopTestStudent {

    @Test
    public void testIsValidTime() {
        // Test valid time range
        BevShop bevShop = new BevShop();
        assertTrue(bevShop.isValidTime(8));
        assertTrue(bevShop.isValidTime(15));
        assertTrue(bevShop.isValidTime(23));

        // Test invalid time range
        assertFalse(bevShop.isValidTime(7));
        assertFalse(bevShop.isValidTime(24));
    }

    @Test
    public void testGetMaxNumOfFruits() {
        // Test getting the maximum number of fruits
        BevShop bevShop = new BevShop();
        assertEquals(5, bevShop.getMaxNumOfFruits());
    }

    @Test
    public void testGetMinAgeForAlcohol() {
        // Test getting the minimum age for alcohol
        BevShop bevShop = new BevShop();
        assertEquals(21, bevShop.getMinAgeForAlcohol());
    }

    @Test
    public void testIsMaxFruit() {
        // Test checking if the number of fruits exceeds the maximum
        BevShop bevShop = new BevShop();
        assertFalse(bevShop.isMaxFruit(3));
        assertFalse(bevShop.isMaxFruit(5));
        assertTrue(bevShop.isMaxFruit(6));
    }

    @Test
    public void testGetMaxOrderForAlcohol() {
        // Test getting the maximum number of orders for alcohol
        BevShop bevShop = new BevShop();
        assertEquals(3, bevShop.getMaxOrderForAlcohol());
    }

    @Test
    public void testIsEligibleForMore() {
        // Test checking if eligible for more alcohol orders
        BevShop bevShop = new BevShop();
        bevShop.startNewOrder(10, Day.MONDAY, "John Doe", 25);
        assertFalse(bevShop.isEligibleForMore());

        // Add 3 alcohol orders
        bevShop.processAlcoholOrder("Wine", Size.MEDIUM);
        bevShop.processAlcoholOrder("Beer", Size.LARGE);
        bevShop.processAlcoholOrder("Whiskey", Size.SMALL);

        // Now should be eligible for more
        assertTrue(bevShop.isEligibleForMore());
    }

    @Test
    public void testGetNumOfAlcoholDrink() {
        // Test getting the number of alcohol drinks
        BevShop bevShop = new BevShop();
        bevShop.startNewOrder(10, Day.MONDAY, "John Doe", 25);
        assertEquals(0, bevShop.getNumOfAlcoholDrink());

        // Add 2 alcohol orders
        bevShop.processAlcoholOrder("Wine", Size.MEDIUM);
        bevShop.processAlcoholOrder("Beer", Size.LARGE);

        assertEquals(2, bevShop.getNumOfAlcoholDrink());
    }

    @Test
    public void testIsValidAge() {
        // Test valid age for alcohol
        BevShop bevShop = new BevShop();
        assertTrue(bevShop.isValidAge(21));
        assertTrue(bevShop.isValidAge(25));

        // Test invalid age for alcohol
        assertFalse(bevShop.isValidAge(20));
    }

    @Test
    public void testStartNewOrder() {
        // Test starting a new order
        BevShop bevShop = new BevShop();
        bevShop.startNewOrder(10, Day.MONDAY, "John Doe", 25);

        // Ensure the order is created and assigned a random number
        assertEquals(1, bevShop.totalNumOfMonthlyOrders());
        assertNotNull(bevShop.getCurrentOrder());
        assertNotEquals(0, bevShop.getCurrentOrder().getOrderNo());
    }

    // Add more test methods for other functionalities in BevShop class

    // ...

    @Test
    public void testSortOrders() {
        // Test sorting orders
        BevShop bevShop = new BevShop();
        bevShop.startNewOrder(10, Day.MONDAY, "John Doe", 25);
        bevShop.startNewOrder(12, Day.TUESDAY, "Jane Doe", 30);
        bevShop.sortOrders();

        // Ensure orders are sorted based on order number
        Order firstOrder = bevShop.getOrderAtIndex(0);
        Order secondOrder = bevShop.getOrderAtIndex(1);
        assertTrue(firstOrder.getOrderNo() < secondOrder.getOrderNo());
    }
}

