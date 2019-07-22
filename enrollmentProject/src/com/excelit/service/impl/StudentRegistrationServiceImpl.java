package com.excelit.service.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelit.bean.StudentProfileBean;
import com.excelit.dao.StudentRegistrationDao;
import com.excelit.service.StudentRegistrationService;

import resources.HibernateUtil;



@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {
	
	
	/**
	 * this variable used to call saveStudentProfileInformation method to save the student profile information
	 */
	@Autowired
	private StudentRegistrationDao studentRegistrationDao;
	
	
	private SessionFactory sessionFactory;
	public StudentRegistrationServiceImpl() {
		/**
		 * getting SessionFactory from Hibernate Util
		 */
		this.sessionFactory = HibernateUtil.getSessionFactory();

	}
	@Override
	public StudentProfileBean saveStudentProfileDetails(StudentProfileBean studentProfileBean) {
		return  studentRegistrationDao.saveStudentProfileInformation(sessionFactory, studentProfileBean);
	}
	
	
	
	
	
}
