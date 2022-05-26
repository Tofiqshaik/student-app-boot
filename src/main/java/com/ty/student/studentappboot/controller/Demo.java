package com.ty.student.studentappboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.student.studentappboot.dto.Hospital;
import com.ty.student.studentappboot.dto.Student;

@RestController
public class Demo {
	@PostMapping("/hello")
	public Student show() {
		Student student = new Student();
		student.setId(1);
		student.setName("Toufiq");
		student.setPer(90.0);
		return student;
		
	}
	@PostMapping("/Hospital")
	public Hospital showHospital()
	{
		Hospital hospital = new Hospital();
		hospital.setName("apolo");
		hospital.setWebsite("www.apolo");
		hospital.setId(2);
		hospital.setGst("ggggdhsh");
		return hospital;
	}
	@PostMapping("/save")
	public void SaveStudent(@RequestBody Student student) {
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getPer());
	}

	

}
