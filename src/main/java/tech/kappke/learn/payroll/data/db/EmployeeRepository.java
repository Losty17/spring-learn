package tech.kappke.learn.payroll.data.db;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.kappke.learn.payroll.data.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
