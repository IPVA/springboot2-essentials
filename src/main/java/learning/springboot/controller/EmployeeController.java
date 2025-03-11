package learning.springboot.controller;


import learning.springboot.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {


    @GetMapping(path = "list")
    public List<Employee> list() {
        return List.of(new Employee("Naruto"), new Employee("Agaroth"), new Employee("Shaiko"));
    }

}
