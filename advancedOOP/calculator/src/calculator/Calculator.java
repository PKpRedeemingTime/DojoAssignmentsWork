package calculator;

public class Calculator implements java.io.Serializable{
	
	private double operandOne = 0;
	private double operandTwo = 0;
	private double result = 0;
	private String operation = "";
	
	public void setOperandOne(double o) {
		this.operandOne = o;
	}
	
	public double getOperandOne() {
		return this.operandOne;
	}
	
	public void setOperandTwo(double o) {
		this.operandTwo = o;
	}
	
	public double getOperandTwo() {
		return this.operandTwo;
	}
	
	public void setOperation(String o) {
		this.operation = o;
	}
	
	public String getOperation() {
		return this.operation;
	}
	
	public void calculator()  {
		if(operation == "+") {
			this.result = operandOne + operandTwo;
		}
		else if(operation == "-") {
			result = operandOne - operandTwo;
		}
		else {
			System.out.println("Improper operation");
			result = 0;
		}
	}
	
	public double getResult() {
		return this.result;
	}
}
