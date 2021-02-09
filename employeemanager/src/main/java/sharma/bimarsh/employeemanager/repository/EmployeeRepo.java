package sharma.bimarsh.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sharma.bimarsh.employeemanager.model.Employee;

import java.util.Optional;

/*
 * extends JpaRepository<model/entityName, dataType-of-primary-key>
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id); // why optional? maybe employee does not exist for given id
}
