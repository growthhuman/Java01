package chap_08;

import java.util.Random;

public class chap_08_99_4 {
	String name;
	int    hp = 50;
	final int    max_hp = 50;
	int    mp=10;
	final int    max_mp=10;
	int recover_mp;

	public void selfAid(){
		this.mp = this.mp -5;
		this.hp = this.max_hp;
	}

	public int pray(int pray_time){
		Random rm = null;
		if(pray_time == 3){
			rm = new Random();
			recover_mp = rm.nextInt(3) + 1;
		}else if(pray_time > 3){
			recover_mp = max_hp;
		}

		return recover_mp;
	}
}
