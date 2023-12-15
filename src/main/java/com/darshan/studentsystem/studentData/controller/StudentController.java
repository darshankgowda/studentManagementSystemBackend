package com.darshan.studentsystem.studentData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.studentsystem.studentData.model.Student;
import com.darshan.studentsystem.studentData.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
//	public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }  if you use @Autowired means you need not to use this
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "New Student is added";
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
}
/*
 * @RequestBody is used here to automatically convert 
 * the incoming request body (containing student information, likely
 *  in JSON format) into a Student object, making it easy to work with and save 
 *  in your application.
*/
