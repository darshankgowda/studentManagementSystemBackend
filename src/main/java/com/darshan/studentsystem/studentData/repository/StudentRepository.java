package com.darshan.studentsystem.studentData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darshan.studentsystem.studentData.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
