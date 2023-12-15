package com.darshan.studentsystem.studentData.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darshan.studentsystem.studentData.model.Student;
import com.darshan.studentsystem.studentData.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{
	//StudentService methods and fields are implemented by StudentServiceImpl
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {	
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

}
