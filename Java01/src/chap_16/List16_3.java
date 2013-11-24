package chap_16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class List16_3 {
	public static void main(String[] args){
		String page = "http://docs.oracle.com/javase/jp/6/api/java/net/URL.html";
		URL url = null;
		InputStream is = null;
		try {
			url = new URL(page);
			is = url.openStream();
			int i = is.read();
			while(i != -1){
				char c = (char)i;
				System.out.print(c);
				i = is.read();
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
