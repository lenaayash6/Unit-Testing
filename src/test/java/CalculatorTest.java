import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
     void setUp() {
        calculator = new Calculator();
    }
    @Test
     void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }
    @Test
    void testDivideByOne() {
        assertEquals(2, calculator.divide(2, 1));
    }
    @Test
     void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }
    @Test
     void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
       // assertEquals("Divide by zero", exception.getMessage());
        /** to test the message if it is the same  **/
        assertEquals("Divide by zero, division", exception.getMessage());

    }
    @AfterEach
    void tearDown() {
        System.out.println("test finished");
    }

}
