package aop_anno;

public class Manager implements Employee{

	@Override
	public void work() {
		System.out.println("사원관리한다해");
	}
	

}
