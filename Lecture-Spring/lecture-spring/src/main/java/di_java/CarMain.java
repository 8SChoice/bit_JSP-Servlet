package di_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		/*
		 * Tire tire = context.getBean("kumTire", Tire.class);
		 * System.out.println(tire.getBrand());
		 */

		Car car = context.getBean("car", Car.class);
		System.out.println("장착된 타이어 : " + car.getTireBrand());
	}
}
