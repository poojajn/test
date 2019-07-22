package com.excelit.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.excelit.bean.StudentInformation;
import com.excelit.dao.StudentEnrollmentDetailDao;

@Repository
public class StudentEnrollmentDetailDaoImpl implements StudentEnrollmentDetailDao{
	private Session session;
	@Override
	public StudentInformation saveStudentInformation(SessionFactory sessionFactory,
			StudentInformation studentInformation) {
		session = sessionFactory.openSession();
		session.save(studentInformation);
		session.beginTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return studentInformation;
	}
}
