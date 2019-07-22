package com.excelit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.excelit.bean.StudentInformation;
import com.excelit.service.StudentEnrollmentService;

@Controller

public class StudentEnrollmentController {
	
	
	@Autowired
	private StudentEnrollmentService studentEnrollmentService;
	
	
	@RequestMapping(value ="/save_student_enroll",  method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	@ResponseBody
	public StudentInformation saveStudentInformation(@RequestBody StudentInformation studentInformation){
		return studentEnrollmentService.saveStudentInformation(studentInformation);
		
	}
	
}
