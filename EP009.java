/* Euler Problem 009
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

package Euler009;

public class EP009 {

	public void solution() {		
		for (int a = 1; a < 1000/3; a++) {
			for (int b = a + 1; b < 1000/2; b++) {
				int c = 1000 - a - b;
				if ( (a < b) && (b < c) && (a < c) && (a*a + b*b == c*c) ) {
					System.out.println(a * b * c);
				}
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EP009().solution();
	}

}
