package com.melodych.spring_employee_and_order;

import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
