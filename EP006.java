/*
 * The sum of the squares of the first ten natural numbers is,
 * (1)2 + (2)2 + ... + (10)2 = 385
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and
 * the square of the sum is 3025 - 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 */

package Euler006;

public class EP006 {

	public long sumOfSquare(long number) {
		long sum = 0;
		long product = 0;
		
		for (long i = 0; i <= number; i++) {
			product = i * i;
			sum += product;
		}
		
		return sum;
	}
	
	public long squareOfSum(long number) {
		long sum = 0;
		long product = 0;
		
		for (long i = 0; i <= number; i++) {
			sum += i;
		}
		
		product = sum * sum;
		
		return product;
	}
	
	public void solution() {
		long number = 100;
		
		System.out.println(Long.toString(Math.abs( squareOfSum(number) - sumOfSquare(number) )));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EP006().solution();
	}

}
