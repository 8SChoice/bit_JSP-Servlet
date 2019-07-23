package aop.pojo;

public class Programmer implements Employee{

	@Override
	public void work() {
		Action.gotoOffice();
		System.out.println("개발");
		Action.getOffOffice();
		
	}

}
