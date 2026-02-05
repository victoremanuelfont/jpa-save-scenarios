package com.ufc.estudo.services;

import com.ufc.estudo.dto.PersonDTO;
import com.ufc.estudo.dto.PersonDepartmentDTO;
import com.ufc.estudo.entities.Department;
import com.ufc.estudo.entities.Person;
import com.ufc.estudo.repositories.DepartmentRepository;
import com.ufc.estudo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
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

       dept = departmentRepository.getReferenceById(dto.getDepartment().getId());

       //dept.setId(dto.getDepartment().getId());
       entity.setDepartment(dept);
    }


    @Transactional
    public PersonDTO insert(PersonDTO dto){
        Person entity = new Person();
        copyDtoToEntity(dto,entity);
        entity = repository.save(entity);
        return new PersonDTO(entity);

    }

    private void copyDtoToEntity(PersonDTO dto, Person entity){
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());
        Department dept = new Department();
        dept = departmentRepository.getReferenceById(dto.getDepartmentId());
        dept.setId(dto.getDepartmentId());
        entity.setDepartment(dept);
    }





}
