package aop_anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAspect {
	@Before("execution(* aop_anno.*.work())")
	public void gotoOffice(JoinPoint joinPoint) {
		System.out.println("출근...");
	}
	@After("execution(* aop_anno.*.work())")
	public void getOffOffice(JoinPoint joinPoint) {
		System.out.println("퇵은!!");
	}

}
