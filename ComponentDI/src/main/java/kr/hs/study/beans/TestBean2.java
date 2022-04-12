package kr.hs.study.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
	
	@Autowired
	private DataBean1 data1;
	
	//이름을 obj2로 지정
	@Autowired
	@Qualifier("obj2")
	private DataBean2 data2;
	//DataBean2타입의 obj2라는 이름을 bean을 가지고 와서 자동주입
	
	//@Resource(obj3)
	@Resource(name="obj3")
	private DataBean3 data3;
	
	//@Resource(obj4)
	@Resource(name="obj4")
	private DataBean4 data4;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean4 getData4() {
		return data4;
	}
	
}
