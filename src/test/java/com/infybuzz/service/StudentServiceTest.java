package com.infybuzz.service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.infybuzz.entity.Student;
import com.infybuzz.repository.StudentRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class StudentServiceTest {

    private MockMvc mockMvc;
    ObjectMapper objectMapper = new ObjectMapper();
    ObjectWriter objectWriter = objectMapper.writer();

    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentRepository studentRepository;


    Student RECORD_1 = new Student(33L, "dario1", "caric", "dario1.caric@gmail.com");
    Student RECORD_2 = new Student(34L, "dario2", "caric", "dario2.caric@gmail.com");


    @BeforeEach
    public void setUp(WebApplicationContext context) {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllStudents2() {
    }

    @Test
    public void getAllStudents_successful_service() {

        List<Student> records = new ArrayList<>(Arrays.asList(RECORD_1, RECORD_2));

        when(studentRepository.findAll()).thenReturn(records);

        //test start (trigger
        List<Student> empList = studentService.getAllStudents();

        // test verification, some attributes etc.
        assertEquals(2, empList.size());
        assertEquals("dario2", empList.get(1).getFirstName());

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