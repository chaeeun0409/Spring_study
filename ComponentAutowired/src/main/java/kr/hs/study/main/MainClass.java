package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean3 xml1 = ctx.getBean("t1",TestBean3.class);
		System.out.println("data1:"+xml1.getData1());
		System.out.println("data2:"+xml1.getData2());
		System.out.println("data3:"+xml1.getData3());
		System.out.println("data4:"+xml1.getData4());
		
		ctx.close();
		
	}

}
