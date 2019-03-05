package com.mitrais.gundala.gundalapbi.controllers;

import com.mitrais.gundala.gundalapbi.models.Employee;
import com.mitrais.gundala.gundalapbi.services.EmployeeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/employees")
public class EmployeeApi {
    private EmployeeService employeeService;

    public EmployeeApi(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.employeeService.getAll1();
    }

    @GetMapping()
    public List<Employee> getAllEmployee () {
        List<Employee> employees = employeeService.getAll();
        return employees;
    }

    @GetMapping("{id}")
    public List<Employee> getAllEmployeeById () {
        List<Employee> employees = employeeService.getAll();
        return employees;
    }

    @PostMapping
    public List<Employee> addEmployee (@RequestBody Employee params) {
        // 201
        System.out.println("employeee111 " + params.getNip());
        List<Employee> emg = employeeService.addEmployee(params);
        return emg;
    }

    @PutMapping("{id}")
    public List<Employee> UpdateEmployee (@RequestBody Map<String, String> params, @PathVariable String id) {
        List<Employee> emg = employeeService.UpdateEmployee(params, id);
        return emg;
    }

    @DeleteMapping("{id}")
    public List<Employee> DeleteEmployee (@PathVariable String id) {
        // 200
        List<Employee> emg = employeeService.DeleteEmployee(id);
        return emg;
    }

    @PatchMapping("{id}")
    public List<Employee> PatchEmployee (@RequestBody Map<String, String> params, @PathVariable String id) {
        List<Employee> emg = employeeService.PatchEmployee(params, id);
        return emg;
    }
}
