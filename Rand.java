package test;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		Random r = new Random ();
		int number = r.nextInt(8);
		System.out.println(number);
	}

}
