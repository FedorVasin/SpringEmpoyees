package ru.vas.springEmpoyees.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.vas.springEmpoyees.model.Employee

@Repository
interface EmployeeRepository:  JpaRepository<Employee, Long>