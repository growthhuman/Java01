package chap_16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class List16_1 {
	public static void main(String[] args){
		String filename = "data.txt";
		FileReader fr = null;
		try {
			fr = new FileReader(filename);
			char c1 = (char) fr.read();
			char c2 = (char) fr.read();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�t�@�C����������܂���");
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
		}

	}

}
