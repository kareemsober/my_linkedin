package FA.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private Internet internet = new RealInternet();
	private static List<String> unautharized;
	
	static {
		unautharized = new ArrayList<String>();
		unautharized.add("aaa.com");
		unautharized.add("bbb.com");
		unautharized.add("ccc.com");
		unautharized.add("back.com");
	}
	
	
	@Override
	public void connectTo(String serverHost) throws Exception {

		if (unautharized.contains(serverHost.toLowerCase())) {
			throw new Exception("Access Denied" + serverHost);
			
			
		}
		Thread.sleep(5000);
		internet.connectTo(serverHost);
		
	}

}
