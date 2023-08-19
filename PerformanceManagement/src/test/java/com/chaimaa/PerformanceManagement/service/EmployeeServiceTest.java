package com.chaimaa.PerformanceManagement.service;

import com.chaimaa.PerformanceManagement.dtos.EmployeeDTO;
import com.chaimaa.PerformanceManagement.dtos.EmployeeDTOCreation;
import com.chaimaa.PerformanceManagement.models.Employee;
import com.chaimaa.PerformanceManagement.repositories.EmployeeRepository;
import com.chaimaa.PerformanceManagement.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    public void testCreateEmployee() throws ParseException {
        // Create an EmployeeDTOCreation object to simulate employee creation data
        EmployeeDTOCreation employeeDTOCreation = new EmployeeDTOCreation();
        employeeDTOCreation.setFirstname("John");
        employeeDTOCreation.setLastname("Doe");
        employeeDTOCreation.setEmail("chaimaa@gmail.com");
        employeeDTOCreation.setJobTitle("engineer");
        Date dateOfJoining = dateFormat.parse("2022-09-09");
        employeeDTOCreation.setDateOfJoining(dateOfJoining);
        employeeDTOCreation.setPhoneNumber("0665544332");

        // Create a mock of Employee and define the expected behavior
        Employee mockedEmployee = new Employee();
        when(employeeRepository.save(org.mockito.ArgumentMatchers.any(Employee.class))).thenReturn(mockedEmployee);

        // Call the employee service to create an employee
        EmployeeDTO result = employeeService.createEmployee(employeeDTOCreation);

        // Verify the results
        assertNotNull(result);
        assertEquals("John", result.getFirstname());
        assertEquals("Doe", result.getLastname());
        assertEquals("chaimaa@gmail.com",result.getEmail());
        assertEquals("engineer",result.getJobTitle());
        Date dateOfJoining2 = dateFormat.parse("2022-09-09");
        assertEquals(dateOfJoining2,result.getDateOfJoining());
        assertEquals("0665544332",result.getPhoneNumber());

        // Verify that the save method of the repository was called with the correct argument
        ArgumentCaptor<Employee> employeeArgumentCaptor = ArgumentCaptor.forClass(Employee.class);
        verify(employeeRepository).save(employeeArgumentCaptor.capture());

        // Additional verifications can be done on the captured Employee object if needed
    }
}
