package chap_15;

import java.io.FileWriter;
import java.io.IOException;

public class List15_1 {
	public static void main (String[] agrgs) {

		FileWriter fw = null;
		try {
			System.out.println("hello");
			fw = new FileWriter("data.txt");
			fw.write("test");
		} catch (IOException e) {
			System.out.println("ÉGÉâÅ[Ç™î≠ê∂ÇµÇ‹ÇµÇΩ");
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
