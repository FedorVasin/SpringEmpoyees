package ru.vas.springEmpoyees.service

import ru.vas.springEmpoyees.model.Employee
import java.util.*

interface EmployeeService {
    fun findAllEmployees(): List<Employee>
    fun saveEmployee(employee: Employee): Employee
    fun findById(id: Long): List<Employee>
    fun updateEmployee(employee: Employee): Employee
    fun deleteEmployee(id: Long): Long
}