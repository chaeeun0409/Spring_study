package kr.hs.study.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		HelloWorldEn En=ctx.getBean("En",HelloWorldEn.class);
		System.out.println("En : "+En);
		HelloWorldKo Ko=ctx.getBean("Ko",HelloWorldKo.class);
		System.out.println("Ko : "+Ko);
		
		ctx.close();
	}
	
}
