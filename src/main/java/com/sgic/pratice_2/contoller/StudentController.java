package com.sgic.pratice_2.contoller;

import com.sgic.pratice_2.Utils.EndpointBundle;
import com.sgic.pratice_2.dto.StudentRequestDTO;
import com.sgic.pratice_2.dto.StudentResponseDTO;
import com.sgic.pratice_2.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EndpointBundle.STUDENT)
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentResponseDTO> createStudent(
            @RequestBody StudentRequestDTO requestDTO) {

        StudentResponseDTO response =
                studentService.createStudent(requestDTO);

        return ResponseEntity.ok(response);
    }
}

