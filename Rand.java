//adding comments to this file and modifying. This is a random number generator using random() method.

package test;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		Random r = new Random (); // Creating an object of the inbuilt class random.
		int number = r.nextInt(8);
		System.out.println(number);
	}

}
