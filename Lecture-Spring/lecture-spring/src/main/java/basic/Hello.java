package basic;

public class Hello {
	//생성자의 특징 : 클래스 이름과 동일. 반환형x, 오버로딩 지원
	public Hello() {
		System.out.println("로딩완료");
	}
	public Hello getInstance() {
		System.out.println("getInstace()....");
		return new Hello();
	}

}
