package chap_08;

public class chap_08_99_3 {
	String name;
	int    hp = 50;
	final int    max_hp = 50;
	int    mp=10;
	final int    max_mp=10;

	public void selfAid(){
		this.mp = this.mp -5;
		this.hp = this.max_hp;
	}
}
