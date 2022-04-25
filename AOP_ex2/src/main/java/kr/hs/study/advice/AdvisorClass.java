package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("beforemethod ȣ��");
	}
	public void afterMethod() {
		System.out.println("aftermethod ȣ��");
	}
	public void aroundMethod(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("aroundMethod ȣ��1");
		pjp.proceed();
		System.out.println("aroundMethod ȣ��2");
	}
}
