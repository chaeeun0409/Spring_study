package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Value;
//생성자를 통한 자동주입( 출력: data1, data2, data3, data4)
@Component
public class TestBean3 {
	@Autowired
	private int data1;
	@Autowired
	private String data2;
	@Autowired
	private DataBean3 data3;
	@Autowired
	private DataBean4 data4;
	
//	public TestBean3(DataBean3 data3, DataBean4 data4) {
//		this.data3=data3;
//		this.data4=data4;
//	}
	//100,spring100,주소값,주소값
	public TestBean3(int data1, String data2, DataBean3 data3, DataBean4 data4) {
		this.data1=data1;
		this.data2=data2;
		this.data3=data3;
		this.data4=data4;
	}

	public int getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean4 getData4() {
		return data4;
	}
	
}
