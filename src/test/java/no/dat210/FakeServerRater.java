package no.dat210;

public class FakeServerRater implements ServerRater {

	public int Rating;

	@Override
	public void Rate(int i) {
		// TODO Auto-generated method stub
		Rating = i;
	}

}
