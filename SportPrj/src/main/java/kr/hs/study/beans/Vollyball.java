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
		System.out.println("배구는"+people+"의 선수가 경기하며");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(set+"를 먼저 획득하면 멈춘다");
	}
}
