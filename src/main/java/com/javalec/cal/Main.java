package com.javalec.cal;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyCalculater myCal = ctx.getBean("myCalculator", MyCalculater.class);
		
		myCal.add();
		myCal.sub();
		myCal.mul();
		myCal.div();
	}
}
