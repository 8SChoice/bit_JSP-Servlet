package di_test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class MyCalculator {
    private int firstNum;
    private int secondNum;
    private Calculator calculator;
    
    public MyCalculator() {
	}
    
	public MyCalculator(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Autowired
	public MyCalculator(@Value("14") int firstNum, @Value("3") int secondNum, Calculator calculator) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}

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

	public void setFirstNum( int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	@Autowired
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}



}


