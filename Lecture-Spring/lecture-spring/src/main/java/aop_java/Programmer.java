package aop_java;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Employee{

	@Override
	public void work() {
		System.out.println("개발");

	}

}
