package com.excelit.dao;

import org.hibernate.SessionFactory;

import com.excelit.bean.StudentProfileBean;

/**
 * @author     POOJA
 * @CreatedOn   24/6/2016
 * this interface used to retrieve or save  student registration details
 */

public interface StudentRegistrationDao {
	/**
	 * @author POOJA 
	 * this DAO method used to save student profile information
	 * @param studentProfileBean
	 * @param sessionFactory
	 * @return
	 */
	public StudentProfileBean saveStudentProfileInformation(SessionFactory sessionFactory,StudentProfileBean studentProfileBean);
}
