package di_test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalMain {

    public static void main(String[] args){
    	ApplicationContext context = new GenericXmlApplicationContext("di_Test.xml");
    	Calculator calculator = context.getBean("calculator",Calculator.class);
    	MyCalculator myCalculator = context.getBean("myCalculator", MyCalculator.class);
    	myCalculator.setCalculator(calculator);
    
    }

}
