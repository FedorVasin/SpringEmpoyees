package ru.vas.springEmpoyees.controller

import lombok.AllArgsConstructor
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.vas.springEmpoyees.service.EmployeeService
import ru.vas.springEmpoyees.model.Employee

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
class EmployeeController(val service: EmployeeService) {

    @GetMapping
    fun findAllEmployees(): List<Employee>{
        return service.findAllEmployees()
    }

    @PostMapping("save-employee")
    fun saveEmployee(@RequestBody employee: Employee): String{
        service.saveEmployee(employee)
        return "Студент успешно сохранен"
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: Long): List<Employee> {
        return service.findById(id)
    }

    @PutMapping("update-employee")
    fun updateEmployee(@RequestBody employee: Employee): Employee{
        return service.updateEmployee(employee)
    }

    @DeleteMapping("delete-employee/{id}")
    fun deleteEmployee(@PathVariable("id") id: Long): Long{
        service.deleteEmployee(id)
        return id
    }
}