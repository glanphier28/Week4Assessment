/**
 * @author gabel - glanphier
 * CIS175 - Fall 2022
 * Sep 29, 2022
 */
package model;


public class NumberMultiplier {
	private int firstNumber;
	private int secondNumber;
	
	
	public NumberMultiplier() {
		super();
	}
	
	public NumberMultiplier(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public int calculate() {
		return this.firstNumber * this.secondNumber;
	}
	
	@Override
	public String toString() {
		return "Number Multiplier: " + firstNumber + " x " + secondNumber + " = " + calculate();
	}
	
	
}
