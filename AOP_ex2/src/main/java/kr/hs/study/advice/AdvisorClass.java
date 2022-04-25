package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("beforemethod 호출");
	}
	public void afterMethod() {
		System.out.println("aftermethod 호출");
	}
	public void aroundMethod(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("aroundMethod 호출1");
		pjp.proceed();
		System.out.println("aroundMethod 호출2");
	}
}
