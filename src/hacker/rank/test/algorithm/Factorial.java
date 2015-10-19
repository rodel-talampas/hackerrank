package hacker.rank.test.algorithm;

import java.math.BigDecimal;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanIn = new Scanner(System.in);
		String input = scanIn.nextLine();
		scanIn.close();
		System.out.println(new Factorial().factorial(new BigDecimal(input)));
	}

	private BigDecimal factorial(BigDecimal n) {
		if (n.equals(new BigDecimal(1)))
			return new BigDecimal(1);
		else
			return n.multiply(factorial(new BigDecimal(n.subtract(
					new BigDecimal(1)).longValue())));
	}
}
