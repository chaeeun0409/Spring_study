package kr.hs.study.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.Magazine;
import kr.hs.study.beans.Novel;
import kr.hs.study.beans.Poet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Book obj1 = ctx.getBean("t1",Novel.class);
		obj1.buy();
		
		Poet obj2 = ctx.getBean("t2",Poet.class);
		obj2.buy();
		
		Magazine obj3 = ctx.getBean("t3",Magazine.class);
		obj3.buy();
		ctx.close();
		
	}

}
