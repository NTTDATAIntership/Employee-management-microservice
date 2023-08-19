package com.chaimaa.PerformanceManagement.mappers;

import com.chaimaa.PerformanceManagement.dtos.EmployeeDTO;

import com.chaimaa.PerformanceManagement.dtos.EmployeeDTOCreation;
import com.chaimaa.PerformanceManagement.models.Employee;

import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface EmployeeMapper {


//    @Mapping(target = "department.id", source = "employeeDTOCreation.departmentId") // Map departmentId to department.id

    Employee employeeDTOCreationToEmployee(EmployeeDTOCreation employeeDTOCreation);

    EmployeeDTO employeeToEmployeeDTO(Employee employee);


    EmployeeDTO employeeDTOCreationToEmployeeDTO(EmployeeDTOCreation employeeDTOCreation);

    EmployeeDTOCreation employeeToEmployeeDTOCreation(Employee savedEmployee);
}