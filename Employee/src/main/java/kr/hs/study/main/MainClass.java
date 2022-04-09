package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
	
	TestBean obj1=ctx.getBean("t1",TestBean.class);
	System.out.println("디자이너"+obj1.getDesigner());
	System.out.println("개발자"+obj1.getDeveloper());
	System.out.println("퍼블리셔"+obj1.getPublisher());
	
	TestBean obj2=ctx.getBean("t2",TestBean.class);
	System.out.println("디자이너"+obj2.getDesigner());
	System.out.println("개발자"+obj2.getDeveloper());
	System.out.println("퍼블리셔"+obj2.getPublisher());
	ctx.close();
	}

}
