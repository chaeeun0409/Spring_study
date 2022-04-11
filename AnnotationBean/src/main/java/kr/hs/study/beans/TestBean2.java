package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean2 {
	@Autowired
	@Qualifier("d1") //������ Ÿ���� bean�� ������ ���� �� ���� �ϱ� ���� /// �̸��� d1�� bean�� ã�Ƽ� data1�� �ڵ����� �ض�
	private DataBean1 data1;
	//container�� dataBean1Ÿ���� bean�� ������ �� ���� �˾Ƽ� data1�� �ڵ������ض�
	
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
