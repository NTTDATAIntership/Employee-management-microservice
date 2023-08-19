package com.chaimaa.PerformanceManagement.controllers;

import com.chaimaa.PerformanceManagement.models.Department;
import com.chaimaa.PerformanceManagement.repositories.DepartmentRepository;
import com.chaimaa.PerformanceManagement.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    private final DepartmentRepository departmentRepository;
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository, DepartmentService departmentService) {
        this.departmentRepository = departmentRepository;
        this.departmentService = departmentService;
    }

    @GetMapping("/all")
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

}
