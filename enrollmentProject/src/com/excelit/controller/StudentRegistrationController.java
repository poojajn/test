package com.excelit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.excelit.bean.StudentProfileBean;
import com.excelit.service.StudentRegistrationService;

import response.StudentRegistrationResponse;

@Controller

public class StudentRegistrationController {
	
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	
	@RequestMapping(value ="/save_student_profile",  method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	@ResponseBody
	public StudentRegistrationResponse saveStudentInformation(@RequestBody StudentProfileBean studentInformation){
		StudentRegistrationResponse studentRegistrationResponse=new StudentRegistrationResponse();
		StudentProfileBean studentProfileBean= studentRegistrationService.saveStudentProfileDetails(studentInformation);
		if(studentProfileBean!=null){
			studentRegistrationResponse.setStudentProfileBean(studentProfileBean);
			//studentRegistrationResponse.setResponseCode(responseCode);
		}
		return studentRegistrationResponse;
		
	}
	
}
