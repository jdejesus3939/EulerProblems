/* Euler Problem 004
 * A palindromic number reads the same both ways. The largest palindrome made from
 * the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

package Euler;

public class EP004 {

	public boolean isPalindromic(String str) {
		if(str.equals(new StringBuilder(str).reverse().toString()))
			return true;
		else
			return false;
	}

	public String solution() {
		int largestPalindrome = 0;
		int product = 0;
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				product = i * j;
				if (isPalindromic(Integer.toString(product)) && product > largestPalindrome) {
					largestPalindrome = product;
				}
			}
		}
		
		return Long.toString(largestPalindrome);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = new EP004().solution();
		System.out.println(result);
	}

}
