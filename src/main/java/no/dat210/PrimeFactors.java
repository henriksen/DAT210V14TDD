package no.dat210;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> generate(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		int candidate = 2;
		while (n>1) {
			while (n % candidate == 0) {
				primes.add(candidate);
				n /= candidate;
			}
			candidate++;
		}
		return primes;
	}

}
