package no.dat210;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class PrimeFactorsTests {

	private List<Integer> list(int...ints) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i:ints)
			result.add(i);
		return result;
	}
	
	private PrimeFactors pf;
	@Before
	public void Before(){
		pf = new PrimeFactors();
	}
	
	@Test
	public void generate_One_EmptyList() {
		assertEquals(new ArrayList<Integer>(), pf.generate(1) );
	}
	@Test
	public void generate_Two_ListWith2() {
		assertEquals(list(2), pf.generate(2));
	}
	
	@Test
	public void generate_Three_ListWith3() {
		assertEquals(list(3), pf.generate(3));
	}		

	@Test
	public void generate_Four_ListWith2and2() {
		assertEquals(list(2,2), pf.generate(4));
	}	
	
	@Test
	public void generate_Six_ListWith2and3() {
		assertEquals(list(2,3), pf.generate(6));
	}	
	@Test
	public void generate_Eight_ListWith2and2and2() {
		assertEquals(list(2,2,2), pf.generate(8));
	}	
	@Test
	public void generate_Nine_ListWith3and3() {
		assertEquals(list(3,3), pf.generate(9));
	}
	@Test
	public void generate_48_ListWith2and2and2and2and3() {
		assertEquals(list(2,2,2,2,3), pf.generate(48));
	}
	

		
	
	
}
