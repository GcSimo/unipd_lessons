import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void evaluatesExpression() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
	}

	@Test
	public void evaluatesExpression2() {
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3+4");
		assertEquals(9, sum);
	}
}
