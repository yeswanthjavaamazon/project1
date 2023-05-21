package others;

import java.net.URL;
import java.net.URLConnection;

public class InternetConnection{
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			System.out.println("Internet Connection");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No Internet Connection");
		}
	}
}