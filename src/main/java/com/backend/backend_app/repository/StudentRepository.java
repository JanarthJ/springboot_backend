package com.backend.backend_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backend_app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}

