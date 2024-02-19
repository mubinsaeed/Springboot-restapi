package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // Import Service annotation

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service // Add Service annotation
public class StudentService {
    private final StudentRepository studentrepo;


    @Autowired
    public StudentService(StudentRepository studentrepo) {
        this.studentrepo = studentrepo;
    }

    public List<Student> getStudents(){
        return studentrepo.findAll();
    }

    public void addnewstudent(Student student){
     Optional<Student> stdbyemail =  studentrepo.findbyemail(student.getEmail());
     if(stdbyemail.isPresent())
     {throw new IllegalStateException("email already register");}
     studentrepo.save(student);


    };
}
