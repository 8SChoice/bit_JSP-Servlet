package di_anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	//@Autowired(required=false)
	//@Qualifier("hanTire")
	@Resource(name="hanTire")
	private Tire tire;
	//private Tire spareTire;
	
	// 기본생성자 : alt + shift + s 누른후 c 선택
	public Car() {
		System.out.println("Car() 호출...");
	}

	// 매개변수생성자 : alt + shift + s 누른후 o 선택
	//@Autowired
	//@Resource => 여기는 못붙인다.
	public Car(/*@Qualifier("kumTire")*/Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 호출...");
	}
	
//	public Car(Tire tire, Tire spareTire) {
//		this.tire = tire;
//		this.spareTire = spareTire;
//		System.out.println("Car(Tire, Tire) 호출...");
//	}
//	
//	public Car(Tire tire, Tire spareTire, int num) {
//		this.tire = tire;
//		this.spareTire = spareTire;
//		System.out.println("Car(Tire, Tire, int) 호출..." + num);
//	}

	// setter/getter : alt + shift + s 누른후 r 선택
	@Autowired   //타입매칭이 우선이다.
	@Qualifier("hanTire")
//	@Resource //java관련. spring과 관계없다.
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire() 호출...");
	}


	public String getTireBrand() {
		return tire.getBrand();
	}
//	public void setSpareTire(Tire spareTire) {
//		this.spareTire = spareTire;
//		System.out.println("setSpareTire() 호출...");
//	}
//
//	
//	public String getSpareTireBrand() {
//		return spareTire != null ? spareTire.getBrand() : "미장착";
//	}
}
