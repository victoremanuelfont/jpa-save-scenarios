package com.ufc.estudo.services;

import com.ufc.estudo.dto.PersonDepartmentDTO;
import com.ufc.estudo.entities.Department;
import com.ufc.estudo.entities.Person;
import com.ufc.estudo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){
        Person entity = new Person();
        copyDtoToEntity(dto,entity);
        entity = repository.save(entity);
        return new PersonDepartmentDTO(entity);

    }

    private void copyDtoToEntity(PersonDepartmentDTO dto,Person entity){
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());
       Department dept = new Department();
       dept.setId(dto.getDepartment().getId());
       entity.setDepartment(dept);
    }


}
