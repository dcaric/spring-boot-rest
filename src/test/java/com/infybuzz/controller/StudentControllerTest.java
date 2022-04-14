package com.infybuzz.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.infybuzz.entity.Student;
import com.infybuzz.repository.StudentRepository;
import com.infybuzz.service.StudentService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @RunWith(SpringRunner.class)
@RunWith(MockitoJUnitRunner.class)
class StudentControllerTest {

    //private MockMvc mockMvc;
    //ObjectMapper objectMapper = new ObjectMapper();
    //ObjectWriter objectWriter = objectMapper.writer();

    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentRepository studentRepository;


    Student RECORD_1 = new Student(33L, "dario1", "caric", "dario1.caric@gmail.com");
    Student RECORD_2 = new Student(34L, "dario2", "caric", "dario2.caric@gmail.com");


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        //mockMvc = MockMvcBuilders.standaloneSetup(this.studentController).build();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllStudents2() {
    }

    /*
    @Test
    void getAllStudents_successful() throws Exception {

        List<Student> records = new ArrayList<>(Arrays.asList(RECORD_1, RECORD_2));

        // Mock student repository to return Student record when called
        Mockito.when(studentRepository.findAll()).thenReturn(records);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/student/getAllStudents")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(2)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].firstName", is("dario2")));

    }
    */

    @Test
    public void getAllStudents_successful() {

        List<Student> records = new ArrayList<>(Arrays.asList(RECORD_1, RECORD_2));

        when(studentRepository.findAll()).thenReturn(records);

        //test
        List<Student> empList = studentService.getAllStudents();
        assertEquals(2, empList.size());
        verify(studentRepository, times(1)).findAll();
    }

    @Test
    void getById_successful() throws Exception {


    }

    @Test
    void createStudent() {
    }

    @Test
    void updateStudent() {
    }

    @Test
    void deleteStudent() {
    }
}