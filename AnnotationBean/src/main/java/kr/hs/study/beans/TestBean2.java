package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean2 {
	@Autowired
	@Qualifier("d1") //동일한 타입의 bean이 여러개 있을 때 방지 하기 위해 /// 이름이 d1인 bean을 찾아서 data1에 자동주입 해라
	private DataBean1 data1;
	//container에 dataBean1타입의 bean이 있으면 그 값을 알아서 data1에 자동주입해라
	
	@Qualifier("d2")
	@Autowired
	private DataBean2 data2;
	
	
	public TestBean2(DataBean2 dataBean2) {
		// TODO Auto-generated constructor stub
	}
	public TestBean2() {
		// TODO Auto-generated constructor stub
	}
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
	
}
