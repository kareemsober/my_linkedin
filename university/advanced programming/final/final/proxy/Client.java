package FA.proxy;

public class Client {
	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		try {
			internet.connectTo("omg.com");
			internet.connectTo("back.com");
		} catch (Exception e) {
	
			System.out.println("e.getmassage");
		}
		
		
	}

}
