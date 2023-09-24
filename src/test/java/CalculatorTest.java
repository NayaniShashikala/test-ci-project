import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        Assertions.assertEquals(6, calculator.addTwoNumbers(4,2));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(2, calculator.subtractTwoNumbers(4,2));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(8, calculator.multiplyTwoNumbers(4,2));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2, calculator.divideTwoNumbers(4,2));
    }

    //this is a test comment
}
