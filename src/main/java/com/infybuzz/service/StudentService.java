package com.infybuzz.service;

import com.infybuzz.entity.Student;
import com.infybuzz.entity.StudentTypes.StudentSimple;
import com.infybuzz.entity.StudentTypes.StudentSimpleClass;
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

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getAllStudents() {
        System.out.println("FINDALL");
        return studentRepository.findAll();
    }

    public List<StudentSimple> getAllStudents2(String name) {
        return studentRepository.findByNameLike2(name);
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
