package di_test;

public class Calculator {

    public void addition(int firstNum, int secondNum){
    	System.out.println(firstNum+"+"+secondNum+"="+(firstNum+secondNum));
    }

    public void substraction(int firstNum, int secondNum){
    	System.out.println(firstNum+"-"+secondNum+"="+(firstNum-secondNum));
    }

    public void multipication(int firstNum, int secondNum){
    	System.out.println(firstNum+"x"+secondNum+"="+(firstNum*secondNum));
    }

    public void division(int firstNum, int secondNum){
    	System.out.println(firstNum+"/"+secondNum+"="+(double)(firstNum/secondNum));
    }

}
