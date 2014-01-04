/* Euler Prolem 005
 * 2520 is the smallest number that can be divided by each of
 * the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20?
 */

package Euler;

public class EP005 {

	private long[] prime = { 2, 3, 5, 7, 11, 13, 17, 19 };
	private long[] occurrences = { 0, 0, 0, 0, 0, 0, 0, 0 };
	private long res = 1;

	public void compute(long number) {

		long n = number;
		long counter;

		//prime factor 
		for (int i = 0; i < prime.length; i++) {
			counter = 0;
			while (n % prime[i] == 0) {
				n /= prime[i];
				counter = counter + 1;
			}
			
			if (occurrences[i] < counter)
				occurrences[i] = counter;
		}
	}

	public String solution() {
				
		//list of number 2-20
		for(long i = 2; i <= 20; i++) {
			compute(i);
		}
		
		//compute the smallest positive number
		for(int i = 0; i < prime.length; i++) {
			res *= (long) Math.pow((double)prime[i], (double)occurrences[i]);
		}
		
		return Long.toString(res);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = new EP005().solution();
		System.out.println(result);
	}

}
