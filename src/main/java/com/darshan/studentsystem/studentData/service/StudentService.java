package com.darshan.studentsystem.studentData.service;

import java.util.List;

import com.darshan.studentsystem.studentData.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public List<Student> getAllStudent();

}
