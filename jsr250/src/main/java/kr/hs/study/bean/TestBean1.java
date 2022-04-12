package kr.hs.study.bean;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class TestBean1 {

	@Resource  //@Autowired + @Qualifier
	private DataBean1 data1;
	// DataBean1 타입의 bean이 있으면(bean의 이름: data1) 자동 주입 해라
	
	
	@Resource
	private DataBean2 data2;
	
	public TestBean1() {
		System.out.println("기본생성자");
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
