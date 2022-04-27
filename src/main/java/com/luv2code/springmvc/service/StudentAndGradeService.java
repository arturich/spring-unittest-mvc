package com.luv2code.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springmvc.models.CollegeStudent;
import com.luv2code.springmvc.repository.StudentDao;

@Service
@Transactional
public class StudentAndGradeService {
	
	@Autowired
	StudentDao studentDao;
	
	public void createStudent(String firstName, String lastName, String emailAddress)
	{
		CollegeStudent student = new CollegeStudent(firstName, lastName, emailAddress);
		student.setId(0);
		
		studentDao.save(student);
	}

}
