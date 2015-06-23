import org.testng.annotations.Test;


public class ExceptionTest {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 0;
	}
}
