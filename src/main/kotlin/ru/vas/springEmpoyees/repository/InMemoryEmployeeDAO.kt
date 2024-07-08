package ru.vas.springEmpoyees.repository

import org.springframework.stereotype.Repository
import ru.vas.springEmpoyees.model.Employee

@Repository
class InMemoryEmployeeDAO {
    var employees: MutableList<Employee> = mutableListOf()
    fun findAllEmployees(): List<Employee>{
        return employees
    }
    fun saveEmployee(employee: Employee): Employee{
        employees.add(employee)
        return employee
    }
    fun findById(id: Long): List<Employee> {
        return employees.filter { it.id == id }
    }
    fun updateEmployee(updatedEmployee: Employee): Employee{
        val index = employees.indexOfLast { it.id == updatedEmployee.id }
        if (index != -1){
            employees[index] = updatedEmployee
        }
        return updatedEmployee
    }
    fun deleteEmployee(id: Long): Long {
        var employee = findById(id)
        if (employee != null){
            employees.removeAll(employee)
        }
        return id
    }

}
