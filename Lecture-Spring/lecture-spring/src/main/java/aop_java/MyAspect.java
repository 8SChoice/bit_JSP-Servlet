package aop_java;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class MyAspect {
	@Before("execution(* aop_java.*.work())")
	public void gotoOffice(JoinPoint joinPoint) {
		System.out.println("출근...");
	}
	@After("execution(* aop_java.*.work())")
	public void getOffOffice(JoinPoint joinPoint) {
		System.out.println("퇵은!!");
	}

}
