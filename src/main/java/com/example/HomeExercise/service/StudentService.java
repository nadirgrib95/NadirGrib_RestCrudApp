package com.example.HomeExercise.service;

import com.example.HomeExercise.entity.Student;
import com.example.HomeExercise.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class to handle business logic for Student operations.
 */
@Service
public class StudentService {

    private StudentRepository studentRepository;

    /**
     * Constructor to initialize the StudentRepository.
     * @param studentRepository Repository layer for student data operations.
     */
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * Retrieve all students from the database.
     * @return List of all students.
     */
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    /**
     * Retrieve a student by ID.
     * @param id The ID of the student.
     * @return The student object if found, otherwise null.
     */
    public Student getStudentById(Long id) {
        return this.studentRepository.findById(id).orElse(null);
    }

    /**
     * Add a new student to the database.
     * @param student The student object to be added.
     * @return The added student object.
     */
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    /**
     * Delete a student by ID.
     * @param id The ID of the student to be deleted.
     */
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    /**
     * Update an existing student in the database.
     * @param id The ID of the student to be updated.
     * @param student The updated student object.
     * @return The updated student object if found, otherwise null.
     */
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