/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 */

package Euler007;

public class EP007 {
	
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
	
	public void solution() {
		int counter = 0;
		long number = 2;
		
		while (true) {
			if (isPrime(number))
				counter++;
			
			if(counter == 10001)
				break;
			
			number++;
		}
		
		System.out.println(Long.toString(number));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EP007().solution();
	}

}
