import static org.junit.Assert.*;
import org.junit.Test;

public class OrderTestStudent {

    @Test
    public void testGenerateOrder() {
        // Test generating an order number
        Order order = new Order(1234, Day.MONDAY, new Customer("John Doe", 25));
        int generatedOrderNum = order.generateOrder();
        assertTrue(generatedOrderNum >= 10000 && generatedOrderNum <= 90000);
    }

    @Test
    public void testGetOrderNo() {
        // Test getting the order number
        Order order = new Order(1234, Day.TUESDAY, new Customer("Jane Doe", 30));
        order.setOrderNum(5678);
        assertEquals(5678, order.getOrderNo());
    }

    @Test
    public void testGetOrderTime() {
        // Test getting the order time
        Order order = new Order(1234, Day.WEDNESDAY, new Customer("Alice Smith", 28));
        assertEquals(1234, order.getOrderTime());
    }

    @Test
    public void testGetOrderDay() {
        // Test getting the order day
        Order order = new Order(1234, Day.THURSDAY, new Customer("Bob Johnson", 40));
        assertEquals(Day.THURSDAY, order.getOrderDay());
    }

    @Test
    public void testGetCustomer() {
        // Test getting the customer
        Customer customer = new Customer("Test Customer", 22);
        Order order = new Order(1234, Day.FRIDAY, customer);
        assertEquals(customer, order.getCustomer());
    }

    @Test
    public void testIsWeekend() {
        // Test checking if the order is on a weekend
        Order weekendOrder = new Order(1234, Day.SATURDAY, new Customer("Weekend Customer", 30));
        assertTrue(weekendOrder.isWeekend());

        // Test checking if the order is on a weekday
        Order weekdayOrder = new Order(5678, Day.MONDAY, new Customer("Weekday Customer", 25));
        assertFalse(weekdayOrder.isWeekend());
    }

    @Test
    public void testAddNewBeverage() {
        // Test adding different types of beverages to the order
        Order order = new Order(1234, Day.SUNDAY, new Customer("Test Customer", 22));
        order.addNewBeverage("Coffee", Size.MEDIUM, true, false);
        order.addNewBeverage("Wine", Size.LARGE);
        order.addNewBeverage("Fruit Smoothie", Size.SMALL, 3, true);

        // Ensure that the order contains the correct number of beverages
        assertEquals(3, order.getTotalItems());
    }

    @Test
    public void testCalcOrderTotal() {
        // Test calculating the order total for an order with different beverages
        Order order = new Order(1234, Day.MONDAY, new Customer("Test Customer", 22));
        order.addNewBeverage("Coffee", Size.MEDIUM, true, false);
        order.addNewBeverage("Wine", Size.LARGE);
        order.addNewBeverage("Fruit Smoothie", Size.SMALL, 3, true);

        // Ensure that the order total is calculated correctly
        assertEquals(12.5, order.calcOrderTotal(), 0.01);
    }

    @Test
    public void testFindNumOfBeveType() {
        // Test finding the number of beverages of a specific type in an order
        Order order = new Order(1234, Day.MONDAY, new Customer("Test Customer", 22));
        order.addNewBeverage("Coffee", Size.MEDIUM, true, false);
        order.addNewBeverage("Wine", Size.LARGE);
        order.addNewBeverage("Fruit Smoothie", Size.SMALL, 3, true);

        // Ensure that the correct number of each type is found
        assertEquals(1, order.findNumOfBeveType(Type.COFFEE));
        assertEquals(1, order.findNumOfBeveType(Type.ALCOHOL));
        assertEquals(1, order.findNumOfBeveType(Type.SMOOTHIE));
    }

}
