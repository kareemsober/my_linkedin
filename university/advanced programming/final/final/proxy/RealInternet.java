package FA.proxy;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String serverHost) throws Exception {

		System.out.println("Connecting to :" + serverHost);
		Thread.sleep(1500);
		System.out.println("conected");
		
	}

}
