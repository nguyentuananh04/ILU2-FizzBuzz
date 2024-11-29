package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class fizzBuzzTest {
	fizzBuzz fizzBuzz ;
	
	@BeforeEach
	void initFizzBuzz() {
		fizzBuzz = new fizzBuzz();
	}
	
	@Test
	void fizzUn() {
		assertEquals(fizzBuzz.fizzbuzz(1), "1");
	}
	
	@Test
	void fizzDeux( ) {
		assertEquals(fizzBuzz.fizzbuzz(2), "2");
	}
	
	@Test
	void fizzTrois( ) {
		assertEquals(fizzBuzz.fizzbuzz(3), "fizz");
	}

}
