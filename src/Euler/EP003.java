/* Euler Problem 003
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package Euler;

public class EP003 {
	
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
		long largestPrime = 0;
		long prime = 3;
		long number = 600851475143L;
		
		while (true) {
			while (!isPrime(prime)) {
				prime += 2;
			}
			
			if (number % prime == 0) {
				number /= prime;
				largestPrime = prime;
			}
			
			prime += 2;
			
			if (number == 1)
				break;
		}
		
		return Long.toString(largestPrime);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = new EP003().solution();
		System.out.println(result);
	}

}
