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
		System.out.println("야구는"+people+"의 선수가 경기하며");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(set+"가 되면 멈춘다");
	}
}
