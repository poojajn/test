package com.excelit.dao.impl;
/**
 * @author  		:POOJA J
 * @created on		:24/6/2017
 * this DAO implementation class used for student registration details
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.excelit.bean.StudentProfileBean;
import com.excelit.dao.StudentRegistrationDao;



@Repository
public class StudentRegistrationDaoImpl implements StudentRegistrationDao{

	/**
	 * this session variable used to get connection with database
	 */
	private Session session;
	
	/**
	 * @author POOJA J
	 * @createdOn 24/6/2017
	 * @param sessionFactory
	 * @param studentProfileBean
	 * @return studentProfileBean
	 * this method used to save Student Profile Information  
	 */
	@Override
	public StudentProfileBean saveStudentProfileInformation(SessionFactory sessionFactory,
			StudentProfileBean studentProfileBean) {
		session = sessionFactory.openSession();
		session.save(studentProfileBean);
		session.beginTransaction().commit();
		if (session != null && session.isOpen()) {
			session.close();
		}
		return studentProfileBean;
	}

}
