package com.javalec.cal;

public class MyCalculater {
	public Calculater cal;
	private int num1;
	private int num2;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void add() {
		cal.add(num1, num2);
	}
	public void sub() {
		cal.sub(num1, num2);
	}
	public void mul() {
		cal.mul(num1, num2);
	}
	public void div() {
		cal.div(num1, num2);
	}
	
	public void setCal(Calculater cal) {
		this.cal = cal;
	}
}
