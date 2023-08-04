package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Student;

public interface Student_Repository extends JpaRepository<Student, Long> {
	
}
