package com.malinga.springJenkinsApp.services;

import com.malinga.springJenkinsApp.dtos.StudentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Service
public class StudentService {

    //get all students
    public List<StudentDto> students(){
        List<StudentDto> list = new ArrayList<>();
        StudentDto studentDto = new StudentDto(
                1,
                "Malinga Simuchimba",
                "malinga.simuchimba@gmail.com",
                "0975608340",
                true,
                true
        );
        list.add(studentDto);

        return list;
    }
}
