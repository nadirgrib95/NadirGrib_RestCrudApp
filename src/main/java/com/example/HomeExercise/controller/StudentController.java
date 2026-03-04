package com.example.HomeExercise.controller;

import com.example.HomeExercise.entity.Student;
import com.example.HomeExercise.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class to handle HTTP requests related to Student operations.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    /**
     * Constructor to initialize the StudentService.
     * @param studentService Service layer for student operations.
     */
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    /**
     * Endpoint to add a new student.
     * @param student The student object to be added.
     * @return The added student object.
     */
    @PostMapping
    public Student addNewStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    /**
     * Endpoint to retrieve all students.
     * @return List of all students.
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    /**
     * Endpoint to retrieve a student by ID.
     * @param id The ID of the student.
     * @return The student object if found.
     */
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    /**
     * Endpoint to delete a student by ID.
     * @param id The ID of the student to be deleted.
     */
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    /**
     * Endpoint to update an existing student.
     * @param id The ID of the student to be updated.
     * @param updatedStudent The updated student object.
     * @return The updated student object.
     */
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }
}