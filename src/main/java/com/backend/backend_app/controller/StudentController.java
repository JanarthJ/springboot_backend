package com.backend.backend_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.backend.backend_app.model.Student;
import com.backend.backend_app.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	 @Autowired
	    private StudentService studentService;

	    @PostMapping("/add")
	    public String add(@RequestBody Student student){
	        studentService.saveStudent(student);
	        return "New student is added";
	    }

	    @GetMapping("/getAll")
	    public List<Student> list(){
	        return studentService.getAllStudents();
	    }
}
