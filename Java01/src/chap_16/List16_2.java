package chap_16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class List16_2 {
	public static void main(String[] args){
		String filename = "data.txt";
		FileWriter fw = null;
		try {
			fw = new FileWriter(filename);
			fw.write("��");
			fw.write("��");
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();

		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
		}


	}

}
