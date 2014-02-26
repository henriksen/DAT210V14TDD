package no.dat210;

public class ImageRater {

	private ServerRater serverRater;

	public ImageRater(ServerRater serverRater) {
		this.serverRater = serverRater;
	}
	
	public void rate(int i) throws Throwable {
		if (i < 0 || i > 5) throw new Exception();
		serverRater.Rate(i);
	}

}
	