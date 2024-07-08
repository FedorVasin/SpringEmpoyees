package ru.vas.springEmpoyees.service.Impl

import lombok.AllArgsConstructor
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service
import ru.vas.springEmpoyees.model.Employee
import ru.vas.springEmpoyees.repository.EmployeeRepository
import ru.vas.springEmpoyees.service.EmployeeService
import java.util.*
import kotlin.jvm.optionals.toList

@Service
@AllArgsConstructor
@Primary
class EmployeeServiceImpl(val repository: EmployeeRepository): EmployeeService {

    override fun findAllEmployees(): List<Employee> {
        return repository.findAll()
    }

    override fun saveEmployee(employee: Employee): Employee {
        return repository.save(employee)
    }

    override fun findById(id: Long): List<Employee> {
        return repository.findById(id).toList()

    }

    override fun updateEmployee(employee: Employee): Employee {
        return repository.save(employee)
    }

    override fun deleteEmployee(id: Long): Long {
        repository.deleteById(id)
        return id
    }

}