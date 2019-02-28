package com.mitrais.gundala.gundalapbi.services;

import com.mitrais.gundala.gundalapbi.models.Employee;
import org.apache.el.stream.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public void getAll1() {
        employees.add(new Employee("Dimas", "JP123"));
        employees.add(new Employee("Lukas", "JP124"));
        employees.add(new Employee("Rafif", "JP125"));
        employees.add(new Employee("Reni", "JP126"));
    }

    public List<Employee> getAll() {return employees;}

    public List<Employee> findById (String id) {
        List<Employee> optionalEmployee = employees.stream().filter((emp) -> emp.getNip().equals(id)).collect(Collectors.toList());
        return optionalEmployee;
    }

    public List<Employee> addEmployee (Employee employee) {
        employees.add(employee);
        return employees;
    }

    public List<Employee> UpdateEmployee (Map<String, String> params, String id) {
        employees = employees.stream().map(e -> {
            if (e.getNip().equals(id)) {
                e.setName(params.get("name"));
                e.setNip(params.get("nip"));
            }
            return e;
        }).collect(Collectors.toList());
        return employees;
    }

    public List<Employee> DeleteEmployee (String id) {
        employees = employees.stream().map(e -> {
            if (e.getNip().equals(id)) {
                e.setName("unset");
            }
            return e;
        }).filter(e-> !e.getName().equals("unset")) .collect(Collectors.toList());
        return employees;
    }

    public List<Employee> PatchEmployee (@RequestBody Map<String, String> params, String id) {
        employees = employees.stream().map(e -> {
            if (e.getNip().equals(id)) {
                if (params.get("name") != null) {
                    e.setName(params.get("name"));
                }
                if (params.get("nip") != null) {
                    e.setNip(params.get("nip"));
                }
            }
            return e;
        }).collect(Collectors.toList());
        return employees;
    }
}
