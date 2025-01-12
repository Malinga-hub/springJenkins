package com.malinga.springJenkinsApp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private int id;
    private String fullname;
    private String emailAddress;
    private String phoneNumber;
    private boolean isEnrolled;
    private boolean isBalanceCleared;
    private int currentYear;
}
