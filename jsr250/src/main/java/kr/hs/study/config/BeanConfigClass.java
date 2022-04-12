package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.bean.DataBean1;
import kr.hs.study.bean.DataBean2;
import kr.hs.study.bean.TestBean1;

public class BeanConfigClass {
	
	
	@Configuration
	public class BeanConfig {
	   @Bean
	   public DataBean1 java1() {
	      return new DataBean1();
	   }
	   
	   @Bean
	   public DataBean2 java2() {
	      return new DataBean2();
	   }
	   
	   @Bean
	   public TestBean1 java3() {
	      return new TestBean1();
	   }
	}
}
