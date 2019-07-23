package aop.pojo;

public class Designer implements Employee{

	@Override
	public void work() {
		Action.gotoOffice();
		System.out.println("디자인");
		Action.getOffOffice();
		
	}

}
