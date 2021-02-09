package sharma.bimarsh.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sharma.bimarsh.employeemanager.model.Employee;

/*
 * extends JpaRepository<model/entityName, dataType-of-primary-key>
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
