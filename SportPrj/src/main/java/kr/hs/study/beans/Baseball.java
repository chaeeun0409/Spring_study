package kr.hs.study.beans;

public class Baseball implements  Sport {
	private String people;
	private int set;
	
	public Baseball(String people, int set) {
		this.people=people;
		this.set=set;
	}
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("�߱���"+people+"�� ������ ����ϸ�");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(set+"�� �Ǹ� �����");
	}
}
