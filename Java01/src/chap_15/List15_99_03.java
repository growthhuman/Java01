package chap_15;

public class List15_99_03 {
	public static void main (String [] args){
		String str = "三";
		try{
			Integer.parseInt(str);
		}catch(NumberFormatException e){
			System.err.print("NumberFormatExceptionが発生しました");
		}
	}
}