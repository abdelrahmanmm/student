package com.example.demo.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import org.springframework.boot.CommandLineRunner;

@Configuration
public class Studentconfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args->{
             Student mathew = new Student("mathew",
              "mathew_owen@gmail.com",
              LocalDate.of(2000,Month.JUNE,18)
              
              );
              Student mohamed = new Student("mohamed",
              "mohamed_metwally@gmail.com",
              LocalDate.of(2001,Month.JULY,18)
              
              );
              repository.save(mathew);
              repository.save(mohamed);

        };
        }

    }
    

