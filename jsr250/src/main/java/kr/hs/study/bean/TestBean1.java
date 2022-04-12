package kr.hs.study.bean;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TestBean1 {

	@Resource  //@Autowired + @Qualifier
	private DataBean1 data1;
	// DataBean1 Ÿ���� bean�� ������(bean�� �̸�: data1) �ڵ� ���� �ض�
	
	
	@Resource
	private DataBean2 data2;
	
	public TestBean1() {
		System.out.println("�⺻������");
	}
	
	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
//	@PostConstruct
//	public void PostConstruct() {
//		System.out.println("postconstruct");
//	}
	@PreDestroy
	public void PreDestory() {
		System.out.println("PreDestroy");
	}
}
