package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class Studentconfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
      return args -> {
         Student ali =  new Student("ali", LocalDate.of(2000, Month.JANUARY,5),
                  "ali@gmail.com");
        Student Shah =   new Student("shah", LocalDate.of(2000, Month.JANUARY,5),
                  "shah@gmail.com");
        repository.saveAll(List.of(ali,Shah));
      };
    };
}
