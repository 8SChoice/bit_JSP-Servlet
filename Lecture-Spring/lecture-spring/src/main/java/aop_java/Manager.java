package aop_java;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{

	@Override
	public void work() {
		System.out.println("사원관리한다해");
	}
	

}
