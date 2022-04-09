package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
	
	TestBean obj1=ctx.getBean("t1",TestBean.class);
	System.out.println("�����̳�"+obj1.getDesigner());
	System.out.println("������"+obj1.getDeveloper());
	System.out.println("�ۺ���"+obj1.getPublisher());
	
	TestBean obj2=ctx.getBean("t2",TestBean.class);
	System.out.println("�����̳�"+obj2.getDesigner());
	System.out.println("������"+obj2.getDeveloper());
	System.out.println("�ۺ���"+obj2.getPublisher());
	ctx.close();
	}

}
