package com.GestionEmpresa.Repositories;

import com.GestionEmpresa.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmail(String email);
    //Employee findById(Long id);
}
