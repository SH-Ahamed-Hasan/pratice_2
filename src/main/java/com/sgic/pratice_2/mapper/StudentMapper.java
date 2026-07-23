package com.sgic.pratice_2.mapper;

import com.sgic.pratice_2.dto.StudentRequestDTO;
import com.sgic.pratice_2.dto.StudentResponseDTO;
import com.sgic.pratice_2.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",  nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface StudentMapper {

    Student toEntity(StudentRequestDTO dto);

    StudentResponseDTO toDto(Student student);

}
