package chap_10;

public class Wand {
	private String name;
	private double power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null ){
			throw new IllegalArgumentException("���O��null");
		}

		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if(!(power >= 0.5) || !(power <=100.0)){
			throw new IllegalArgumentException("�l�̐ݒ��ς��ĉ�����");
		}

		this.power = power;
	}

}