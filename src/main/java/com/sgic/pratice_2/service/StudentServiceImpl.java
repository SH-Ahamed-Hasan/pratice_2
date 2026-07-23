package com.sgic.pratice_2.service;

import com.sgic.pratice_2.dto.StudentRequestDTO;
import com.sgic.pratice_2.dto.StudentResponseDTO;
import com.sgic.pratice_2.entity.School;
import com.sgic.pratice_2.entity.Student;
import com.sgic.pratice_2.exceptionHandlers.ResourceNotFoundException;
import com.sgic.pratice_2.mapper.StudentMapper;
import com.sgic.pratice_2.repository.SchoolRepository;
import com.sgic.pratice_2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public StudentResponseDTO createStudent(StudentRequestDTO requestDTO) {
//         DTO -> Entity
        Student student = studentMapper.toEntity(requestDTO);
//        Check school
        School school = schoolRepository.findById(requestDTO.getSchoolId())
                .orElseThrow(() -> new ResourceNotFoundException("School not found"));
        student.setSchool(school);
//         Save Student into db
        Student savedStudent = studentRepository.save(student);
//         Entity -> Response DTO
        return studentMapper.toDto(savedStudent);
    }
}
