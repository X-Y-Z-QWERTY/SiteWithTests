package com.melodych.site_with_tests;

import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
