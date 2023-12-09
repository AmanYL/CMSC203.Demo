import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTestStudent {

    @Test
    public void testGetAge() {
        // Test getting age for a customer
        Customer customer = new Customer("John Doe", 25);
        assertEquals(25, customer.getAge());
    }

    @Test
    public void testSetAge() {
        // Test setting age for a customer
        Customer customer = new Customer("Jane Doe", 30);
        customer.setAge(35);
        assertEquals(35, customer.getAge());
    }

    @Test
    public void testGetName() {
        // Test getting name for a customer
        Customer customer = new Customer("Alice Smith", 28);
        assertEquals("Alice Smith", customer.getName());
    }

    @Test
    public void testSetName() {
        // Test setting name for a customer
        Customer customer = new Customer("Bob Johnson", 40);
        customer.setName("Robert Johnson");
        assertEquals("Robert Johnson", customer.getName());
    }

    @Test
    public void testToString() {
        // Test the string representation of the Customer object
        Customer customer = new Customer("Test Customer", 22);
        String expectedString = "Test Customer 22";
        assertEquals(expectedString, customer.toString());
    }

    @Test
    public void testCopyConstructor() {
        // Test the copy constructor for Customer
        Customer originalCustomer = new Customer("Original", 30);
        Customer copiedCustomer = new Customer(originalCustomer);

        // Ensure that the copied customer has the same attributes as the original
        assertEquals(originalCustomer.getName(), copiedCustomer.getName());
        assertEquals(originalCustomer.getAge(), copiedCustomer.getAge());
    }
}

