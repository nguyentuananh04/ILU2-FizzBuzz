package fizzbuzz;

public class fizzBuzz {
	String fizzbuzz(int i) {
		if (i % 3 == 0) {
			return "fizz";
		}
		if (i % 5 == 0) {
			return "buzz";
		}
		return "" + i;
	}
}
