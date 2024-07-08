package ru.vas.springEmpoyees.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.*

@Entity
@Table(name = "employees")
data class Employee(
    @Id
    @GeneratedValue
    var id: Long,
    val firstName: String,
    val lastName: String,
    val age: Int,
    val dateOfBirth: String,
    val email: String,
) {
}