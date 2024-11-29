package fizzbuzz;

public class fizzBuzz {
	String fizzbuzz(int i) {
		String returnValue = new String();
		if (i % 3 == 0) {
			returnValue += "fizz";
		}
		if (i % 5 == 0) {
			returnValue += "buzz";
		}
		if (returnValue.equals("")) {
			returnValue += i;
		}
		return returnValue;
	}
}
