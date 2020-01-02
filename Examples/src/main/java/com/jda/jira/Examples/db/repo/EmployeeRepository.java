package com.jda.jira.Examples.db.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jda.jira.Examples.db.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
