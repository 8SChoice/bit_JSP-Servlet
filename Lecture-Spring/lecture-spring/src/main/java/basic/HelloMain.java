package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanContainer.xml"); //classpath : src/resources 폴더.
//		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
//		ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:beanContainer.xml");
//		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:beanContainer.xml");
		//Hello obj = new Hello();
		Hello obj = (Hello)ctx.getBean("hello");
		System.out.println("obj:"+obj);
		
		Hello obj2 = (Hello)ctx.getBean("hello2");
		System.out.println("obj2:"+obj2);
	}

}
