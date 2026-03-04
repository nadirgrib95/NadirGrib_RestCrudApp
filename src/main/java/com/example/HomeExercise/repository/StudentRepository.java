package com.example.HomeExercise.repository;

import com.example.HomeExercise.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
