package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private  final StudentService studentservice;

    public StudentController(StudentService studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentservice.getStudents();
    }


    @PostMapping
    public void registerstudent(@RequestBody Student student){
        studentservice.addnewstudent(student);
    }
}
