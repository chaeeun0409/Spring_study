package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		
		/*xml 파일 로딩*/
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		//Generic도 되고 ClassPath도 된다
		
		/*t1을 가지와서 obj1에 대입 후 주소 출력
		 * t1을 가지고 와서 obj2에 대입후 주소 출력*/
		TestBean1 obj1=ctx.getBean("t1",TestBean1.class);
		TestBean1 obj2=ctx.getBean("t1",TestBean1.class);	
		TestBean1 obj3=ctx.getBean("t2",TestBean1.class);
		TestBean1 obj4=ctx.getBean("t2",TestBean1.class);
		
		System.out.println("obj1 :" +obj1);
		System.out.println("obj2 :" +obj2);
		System.out.println("obj3 :" +obj3);
		System.out.println("obj4 :" +obj4);
		
		TestBean1 obj5=ctx.getBean("t3",TestBean1.class);
		System.out.println("obj5 :" +obj5);
		
		TestBean1 obj6=ctx.getBean("t4",TestBean1.class);
		System.out.println("obj6 :" +obj6 );
		ctx.close(); 
	}

}
