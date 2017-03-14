import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {
	
	public Prime prime = new Prime();
	@Test
	public void test() {
		String reString = "2 3 5 ";
		assertEquals(reString, prime.printPrimes(3));
	}

}
