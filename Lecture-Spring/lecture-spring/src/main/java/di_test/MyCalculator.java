package di_test;

public class MyCalculator {
    private int firstNum;
    private int secondNum;
    private Calculator calculator;

    
    public void add(){
    	calculator.addition(firstNum, secondNum);
    }

    public void sub(){
    	calculator.substraction(firstNum, secondNum);
    }

    public void mul(){
    	calculator.multipication(firstNum, secondNum);
    }

    public void div(){
    	calculator.division(firstNum, secondNum);
    }

    public MyCalculator(int firstNum, int secondNum, Calculator calculator){
    	super();
    	this.firstNum = firstNum;
    	this.secondNum = secondNum;
    	this.calculator = calculator;
    }
    
    

    public MyCalculator(){
    }

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
    

}
