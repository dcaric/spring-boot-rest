package com.infybuzz.service;

import com.infybuzz.entity.Student;
import com.infybuzz.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dcaric on 10/04/2022
 * @project spring-boot-app
 */
@Service
public class StudentService {

   @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public  Student getById(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student has been deleted";
    }
}
