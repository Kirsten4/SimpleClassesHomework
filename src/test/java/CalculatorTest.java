import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addCalculationTest(){
        assertEquals(11, calculator.add(4,7));
    }

    @Test
    public void subtractCalculationTest(){
        assertEquals(3, calculator.subtract(9,6));
    }

    @Test
    public void multiplyCalculationTest(){
        assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    public void divideCalculationTest(){
        assertEquals(2.5, calculator.divide(5,2),0.0);
    }


}
