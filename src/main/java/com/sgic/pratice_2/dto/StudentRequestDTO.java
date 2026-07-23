package com.sgic.pratice_2.dto;

import lombok.Data;

@Data
public class StudentRequestDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;

    private Long schoolId;
}
