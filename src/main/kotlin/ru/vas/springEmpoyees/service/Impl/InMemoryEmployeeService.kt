package ru.vas.springEmpoyees.service.Impl

import lombok.AllArgsConstructor
import ru.vas.springEmpoyees.service.EmployeeService
import ru.vas.springEmpoyees.model.Employee
import ru.vas.springEmpoyees.repository.InMemoryEmployeeDAO

@AllArgsConstructor
class InMemoryEmployeeService: EmployeeService {

    private val repository: InMemoryEmployeeDAO = InMemoryEmployeeDAO()

    override fun findAllEmployees(): List<Employee>{
        return repository.findAllEmployees()
    }

    override fun saveEmployee(employee: Employee): Employee{
        return repository.saveEmployee(employee)
    }

    override fun findById(id: Long): List<Employee> {
        return repository.findById(id)
    }
    override fun updateEmployee(employee: Employee): Employee{
        return repository.updateEmployee(employee)
    }
    override fun deleteEmployee(id: Long): Long {
        repository.deleteEmployee(id)
        return id
    }
}
