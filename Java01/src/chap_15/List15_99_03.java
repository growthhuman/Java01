package chap_15;

public class List15_99_03 {
	public static void main (String [] args){
		String str = "O";
		try{
			Integer.parseInt(str);
		}catch(NumberFormatException e){
			System.err.print("NumberFormatException‚ª”­¶‚µ‚Ü‚µ‚½");
		}
	}
}