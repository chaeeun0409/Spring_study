package kr.hs.study.beans;

public class Vollyball implements Sport{
	private String people;
	private int set;
	
	public Vollyball(String people, int set) {
		this.people=people;
		this.set=set;
	}
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("�豸��"+people+"�� ������ ����ϸ�");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(set+"�� ���� ȹ���ϸ� �����");
	}
}
