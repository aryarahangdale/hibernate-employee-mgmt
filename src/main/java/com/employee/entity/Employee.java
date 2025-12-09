
package com.employee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String name;
    
    @Email(message = "Invalid email")
    @Column(unique = true)
    private String email;
    
    @Min(value = 0, message = "Salary must be positive")
    private Double salary;
    
    @Column(length = 50)
    private String department;
    
    // Constructors
    public Employee() {}
    
    public Employee(String name, String email, Double salary, String department) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }
    
    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
