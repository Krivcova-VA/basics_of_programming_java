package Repository;

import Models.Department;
import Models.Employee;

import java.util.HashSet;

public interface DepRepository {
    Department find(Long id) throws Exception;

    HashSet<Employee> list();

    void save(Department department);

    void remove(Department department);
}
