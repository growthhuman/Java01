package chap_15;

public class List15_99_02 {
	public static void main (String [] args){
		String s = null;
		try{
		System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("NullPointerException��O��catch���܂���");
			System.out.println("--�X�^�b�N�g���[�X(��������)--");
			e.printStackTrace();
			System.out.println("--�X�^�b�N�g���[�X(�����܂�)--");

		}
	}
}
