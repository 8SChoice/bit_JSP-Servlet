package calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyCalculator {
	public static void main(String[] args) {
		int a = 14;
		int b = 5;
		ApplicationContext ap = new GenericXmlApplicationContext("calculator.xml");
		Calculator ca = (Calculator)ap.getBean("cal2");
		System.out.println(ca.getFirstNum()+ca.getSecondNum());
//		Calculator ca2 = ap.getBean("cal", Calculator.class);
		

	}
}