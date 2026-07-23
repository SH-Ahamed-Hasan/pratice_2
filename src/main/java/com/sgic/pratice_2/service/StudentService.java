package com.sgic.pratice_2.service;

import com.sgic.pratice_2.dto.StudentRequestDTO;
import com.sgic.pratice_2.dto.StudentResponseDTO;

public interface StudentService {
    StudentResponseDTO createStudent(StudentRequestDTO requestDTO);
}
