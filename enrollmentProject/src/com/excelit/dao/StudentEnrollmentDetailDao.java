package com.excelit.dao;

import org.hibernate.SessionFactory;

import com.excelit.bean.StudentInformation;

public interface StudentEnrollmentDetailDao {
	
/**
 * @author Pooja J
 * this method used to save student information	
 */
public StudentInformation saveStudentInformation(SessionFactory sessionFactory,StudentInformation studentInformation);
}
