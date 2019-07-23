package aop_xml;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void gotoOffice(JoinPoint joinPoint) {
		System.out.println("출근...");
	}
	public void getOffOffice(JoinPoint joinPoint) {
		System.out.println("퇵은!!");
	}

}
