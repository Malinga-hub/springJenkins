package com.malinga.springJenkinsApp.controllers;

import com.malinga.springJenkinsApp.dtos.StudentDto;
import com.malinga.springJenkinsApp.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
@RequiredArgsConstructor
public class ApiController {
    private final StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<?> students(){
        List<StudentDto> students = studentService.students();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
