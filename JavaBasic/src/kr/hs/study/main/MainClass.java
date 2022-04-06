package kr.hs.study.main;

import kr.hs.study.Hello;
import kr.hs.study.HelloWorldEn;
import kr.hs.study.HelloWorldKo;

public class MainClass {
	
	public static void main(String[]args) {
		Hello hello = new HelloWorldKo();
		say_Method(hello);
		
	}
	public static void say_Method(Hello hello) {
		hello.sayHello();
	}
	
}
