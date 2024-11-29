package fizzbuzz;

public class fizzBuzz {
	String fizzbuzz(int i) {
		if (i == 3) {
			return "fizz";
		}
		if (i == 5) {
			return "buzz";
		}
		return "" + i;
	}
}
