package Servise;

import Models.Department;
import Models.Employee;
import Repository.DepRepository;

import java.util.HashSet;

public class DepServise {
    private final DepRepository repository;

    public DepServise(DepRepository repository) {
        this.repository = repository;
    }

    public Department getById(Long id) {
        try {
            return repository.find(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public HashSet<Employee> getAll() {
        return repository.list();
    }
}
