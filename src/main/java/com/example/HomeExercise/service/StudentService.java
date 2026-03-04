package com.example.HomeExercise.service;

import com.example.HomeExercise.entity.Student;
import com.example.HomeExercise.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {

        return this.studentRepository.findAll();
    }

    public Student getStudentById(Long id) {

        return this.studentRepository.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {

        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {

        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student student) {
        Student stud = this.getStudentById(id);

        if(stud != null) {
            stud.setName(student.getName());
            stud.setFees(student.getFees());
            stud.setSubName(student.getSubName());
            return this.addStudent(stud);
        }
        return null;
    }
}
