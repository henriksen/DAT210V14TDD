package no.dat210;

import static org.junit.Assert.*;

import org.junit.Test;


public class ImageRaterTests {
	@Test(expected = Exception.class)
	public void rate_negativeValue_ThrowsException() throws Throwable {
		ImageRater rater = new ImageRater(new FakeServerRater());
		rater.rate(-1);
	}
	@Test(expected = Exception.class)
	public void rate_MoreThan5_ThrowsException() throws Throwable {
		ImageRater rater = new ImageRater(new FakeServerRater());
		rater.rate(6);
	}
	
	@Test
	public void rate_ValidValue_PassedToServerRater() throws Throwable {
		FakeServerRater fake = new FakeServerRater();
		ImageRater rater = new ImageRater(fake);
		rater.rate(4);
		assertEquals(4, fake.Rating);
	}
	
}
