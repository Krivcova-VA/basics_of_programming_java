package Inmemory;

import Models.Department;
import Models.Employee;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class Storage {
    private static Storage instance;

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    Set<Department> department;
    final AtomicLong boxIdGenerator = new AtomicLong(4L);

    private Storage() {
        department = new HashSet<>();
        initDepartment();
    }

    private void initDepartment() {
        Employee e1 = new Employee("Пупкин В.Д.", 54, 10000);

        Department b1 = new Department("1L", department);

        department.add(b1);

    }
}
