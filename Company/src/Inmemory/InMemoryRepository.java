package Inmemory;
import Data.sql.demo.RepositoryImp;
import Models.Department;
import Repository.DepRepository;

import java.util.HashSet;
import java.util.Objects;


public class InMemoryRepository implements DepRepository {
    private final Storage storage = Storage.getInstance();

    @Override
    public Department find(Long id) throws Exception {

        return storage.department.stream()
                .filter(b -> Objects.equals(b.getId(), id))
                .findFirst()
                .orElseThrow(() -> new Exception("No boxes found by id=" + id));
    }

    @Override
    public HashSet list() {
        return new HashSet<>(storage.department);
    }

    @Override
    public void save(Department department) {
        if (department.getId() == null) {
            department.setId(storage.boxIdGenerator.incrementAndGet());
        }
        storage.department.remove(department); // ???
        storage.department.add(department);
    }

    @Override
    public void remove(Department box) {
        storage.department.remove(box);
    }
}
