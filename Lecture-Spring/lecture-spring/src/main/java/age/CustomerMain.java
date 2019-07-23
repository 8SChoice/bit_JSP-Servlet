package age;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomerMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);//new GenericXmlApplicationContext("age/beanCtx.xml");
		Person p = context.getBean("customer",Person.class);//new Customer();
		p.setAge(25);
		
		
	}

}
