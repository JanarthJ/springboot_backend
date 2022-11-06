package com.backend.backend_app.service;

import java.util.List;

import com.backend.backend_app.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
