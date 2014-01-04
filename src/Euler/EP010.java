/* Euler Problem 010
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

package Euler;

public class EP010 {

	public boolean isPrime(long n)
	{
		long i = 2;
	 
		if (n == 2) {
			return true;	
		}
	 
		while (i <= Math.sqrt(n)) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
	 
		return true;
	}
	
	public String solution() {
		long sum = 0;
		for (long i = 2; i < 2000000; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		
		return Long.toString(sum);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = new EP010().solution();
		System.out.println(result);
	}

}
