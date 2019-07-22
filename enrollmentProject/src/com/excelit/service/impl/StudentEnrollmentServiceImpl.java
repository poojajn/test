package com.excelit.service.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelit.bean.StudentInformation;
import com.excelit.dao.StudentEnrollmentDetailDao;
import com.excelit.service.StudentEnrollmentService;

import resources.HibernateUtil;

@Service
public class StudentEnrollmentServiceImpl implements StudentEnrollmentService {
	@Autowired
	private StudentEnrollmentDetailDao studentEnrollmentDetailDao;

	private SessionFactory sessionFactory;

	public StudentEnrollmentServiceImpl() {
		/**
		 * getting SessionFactory from Hibernate Util
		 */
		this.sessionFactory = HibernateUtil.getSessionFactory();

	}

	@Override
	/**
	 * this service method used to save student information
	 */
	public StudentInformation saveStudentInformation(StudentInformation studentInformation) {
		return studentEnrollmentDetailDao.saveStudentInformation(sessionFactory, studentInformation);
	}

}
