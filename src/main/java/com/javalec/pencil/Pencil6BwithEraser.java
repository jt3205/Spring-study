package com.javalec.pencil;

public class Pencil6BwithEraser extends Pencil6B implements Pencil{
	@Override
	public void use() {
		super.use();
		System.out.println("지우개도 있습니다.");
	}
}
