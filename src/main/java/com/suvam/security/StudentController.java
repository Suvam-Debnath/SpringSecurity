package com.suvam.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"suvam","java"),
            new Student(2,"paranay","Data"),
            new Student(3,"abir","python")
    ));
    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }
    @PostMapping("students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }
}
