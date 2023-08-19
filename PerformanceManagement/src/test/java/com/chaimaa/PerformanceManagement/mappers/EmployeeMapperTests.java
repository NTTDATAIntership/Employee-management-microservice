package com.chaimaa.PerformanceManagement.mappers;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import com.chaimaa.PerformanceManagement.dtos.EmployeeDTO;
import com.chaimaa.PerformanceManagement.dtos.EmployeeDTOCreation;
import com.chaimaa.PerformanceManagement.models.Employee;
import com.chaimaa.PerformanceManagement.repositories.EmployeeRepository;
import com.chaimaa.PerformanceManagement.services.EmployeeService;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class EmployeeMapperTests {

//    @InjectMocks
//    private EmployeeMapper employeeMapper;
//
//    @Test
//    public void testEmployeeToDTO() {
//        // Créez un Employee pour le test
//        Employee employee = new Employee();
//        employee.setId(1L);
//        employee.setFirstname("John");
//        employee.setLastname("Doe");
//        employee.setPhoneNumber("0646467665");
//        employee.setEmail("chaimaa@gmail.com");
//        employee.setJobTitle("engineer");
//
//        // Effectuez la conversion et vérifiez les résultats
//        EmployeeDTO employeeDTO = employeeMapper.employeeToEmployeeDTO(employee);
//        assertEquals(employee.getId(), employeeDTO.getId());
//        assertEquals(employee.getFirstname(), employeeDTO.getFirstname());
//        assertEquals(employee.getLastname(), employeeDTO.getLastname());
//        assertEquals(employee.getEmail(),employeeDTO.getEmail());
//        assertEquals(employee.getJobTitle(),employeeDTO.getJobTitle());
//        assertEquals(employee.getPhoneNumber(),employeeDTO.getPhoneNumber());
//
//
//    }

//    @Test
//    public void testDtoToEmployee() {
//        // Créez un EmployeeDTO pour le test
//        EmployeeDTO employeeDTO = new EmployeeDTO();
//        employeeDTO.setId(1L);
//        employeeDTO.setFirstname("John");
//        employeeDTO.setLastname("Doe");
//
//        // Effectuez la conversion et vérifiez les résultats
//        Employee employee = employeeMapper.EmployeeDTOToEmployee(employeeDTO);
//        assertEquals(employeeDTO.getId(), employee.getId());
//        assertEquals(employeeDTO.getFirstname(), employee.getFirstname());
//        assertEquals(employeeDTO.getLastname(), employee.getLastname());
//    }
//private final EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);
//
//    @Test
//    void testEmployeeDTOCreationToEmployee() {
//        // Create an instance of EmployeeDTOCreation
//        EmployeeDTOCreation employeeDTOCreation = new EmployeeDTOCreation();
//        employeeDTOCreation.setFirstname("John");
//        employeeDTOCreation.setLastname("Doe");
//        employeeDTOCreation.setPhoneNumber("0646467665");
//        employeeDTOCreation.setEmail("chaimaa@gmail.com");
//        employeeDTOCreation.setJobTitle("engineer");
//        // Set other properties
//
//        // Perform the mapping
//        Employee employee = mapper.employeeDTOCreationToEmployee(employeeDTOCreation);
//
//        // Assertions
//        assertEquals("John", employee.getFirstname());
//        assertEquals("Doe", employee.getLastname());
//        assertEquals("chaimaa@gmail.com",employee.getEmail());
//        assertEquals("engineer",employee.getJobTitle());
//        assertEquals("0646467665",employee.getPhoneNumber());
//        // Verify other properties
//    }
private final EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

    @Test
    void testEmployeeDTOCreationToEmployee() {
        // Create an instance of EmployeeDTOCreation
        EmployeeDTOCreation employeeDTOCreation = new EmployeeDTOCreation();
        employeeDTOCreation.setFirstname("John");
        employeeDTOCreation.setLastname("Doe");
        employeeDTOCreation.setEmail("john.doe@example.com");
        employeeDTOCreation.setPhoneNumber("123456789");
        employeeDTOCreation.setJobTitle("Software Engineer");
        employeeDTOCreation.setDateOfJoining(new Date());
        employeeDTOCreation.setDepartmentId(1L);
        // Set other properties

        // Perform the mapping
        Employee employee = mapper.employeeDTOCreationToEmployee(employeeDTOCreation);

        // Assertions
        assertNotNull(employee);
        assertEquals("John", employee.getFirstname());
        assertEquals("Doe", employee.getLastname());
        assertEquals("john.doe@example.com", employee.getEmail());
        assertEquals("123456789", employee.getPhoneNumber());
        assertEquals("Software Engineer", employee.getJobTitle());
        assertEquals(1L, employee.getDepartment().getId());
        // Verify other properties
    }
}