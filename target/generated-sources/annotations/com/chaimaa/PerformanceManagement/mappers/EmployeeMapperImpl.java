package com.chaimaa.PerformanceManagement.mappers;

import com.chaimaa.PerformanceManagement.dtos.EmployeeDTO;
import com.chaimaa.PerformanceManagement.dtos.EmployeeDTOCreation;
import com.chaimaa.PerformanceManagement.models.Employee;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-18T18:58:28+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee employeeDTOCreationToEmployee(EmployeeDTOCreation employeeDTOCreation) {
        if ( employeeDTOCreation == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setPhoneNumber( employeeDTOCreation.getPhoneNumber() );
        employee.setDateOfJoining( employeeDTOCreation.getDateOfJoining() );
        employee.setFirstname( employeeDTOCreation.getFirstname() );
        employee.setLastname( employeeDTOCreation.getLastname() );
        employee.setEmail( employeeDTOCreation.getEmail() );
        employee.setJobTitle( employeeDTOCreation.getJobTitle() );

        return employee;
    }

    @Override
    public EmployeeDTO employeeToEmployeeDTO(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setFirstname( employee.getFirstname() );
        employeeDTO.setLastname( employee.getLastname() );
        employeeDTO.setEmail( employee.getEmail() );
        employeeDTO.setPhoneNumber( employee.getPhoneNumber() );
        employeeDTO.setJobTitle( employee.getJobTitle() );
        employeeDTO.setDateOfJoining( employee.getDateOfJoining() );

        return employeeDTO;
    }

    @Override
    public EmployeeDTO employeeDTOCreationToEmployeeDTO(EmployeeDTOCreation employeeDTOCreation) {
        if ( employeeDTOCreation == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setFirstname( employeeDTOCreation.getFirstname() );
        employeeDTO.setLastname( employeeDTOCreation.getLastname() );
        employeeDTO.setEmail( employeeDTOCreation.getEmail() );
        employeeDTO.setPhoneNumber( employeeDTOCreation.getPhoneNumber() );
        employeeDTO.setJobTitle( employeeDTOCreation.getJobTitle() );
        employeeDTO.setDateOfJoining( employeeDTOCreation.getDateOfJoining() );

        return employeeDTO;
    }

    @Override
    public EmployeeDTOCreation employeeToEmployeeDTOCreation(Employee savedEmployee) {
        if ( savedEmployee == null ) {
            return null;
        }

        EmployeeDTOCreation employeeDTOCreation = new EmployeeDTOCreation();

        employeeDTOCreation.setPhoneNumber( savedEmployee.getPhoneNumber() );
        employeeDTOCreation.setDateOfJoining( savedEmployee.getDateOfJoining() );
        employeeDTOCreation.setFirstname( savedEmployee.getFirstname() );
        employeeDTOCreation.setLastname( savedEmployee.getLastname() );
        employeeDTOCreation.setEmail( savedEmployee.getEmail() );
        employeeDTOCreation.setJobTitle( savedEmployee.getJobTitle() );

        return employeeDTOCreation;
    }
}
