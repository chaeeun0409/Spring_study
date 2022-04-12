package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.study.bean.TestBean1;
import kr.hs.study.config.BeanConfigClass;


public class MainClass {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
      
      BeanConfigClass obj1 = ctx.getBean(BeanConfigClass.class);
     
      ctx.close();
   }
}