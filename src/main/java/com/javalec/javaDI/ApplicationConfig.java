package com.javalec.javaDI;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
		
		Student student = new Student("홍길동");
		student.setAge(18);
		student.setHobbys(hobbys);
		return student;
	}
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("코딩");
		hobbys.add("요요");
		
		Student student = new Student("가나다");
		student.setAge(8);
		student.setHobbys(hobbys);
		return student;
	}
}
