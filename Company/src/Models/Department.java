package Models;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Department {
    private String depName;
    private HashSet<Employee> salaryEmp;
    private HashSet<Employee> employee;
    private UUID id;
    public Department (String depName, HashSet<Employee> salaryEmp) {
        this.salaryEmp = salaryEmp;
        this.depName = depName;
        this.employee = new HashSet<>();

    }

    public Department(String depName, Set<Department> department) {
    }

    public void add(Employee emp){
        if (!employee.contains(emp)){
            employee.add(emp);
        }
    }

    public void remove(Employee emp){
        if (employee.contains(emp)){
            employee.remove(emp);
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + depName + '\'' +
                ", salary=" + salaryEmp +
                ", employee=" + employee +
                '}';
    }

    public Object getId() {
        return id;
    }

    public void setId(long incrementAndGet) {
    }
}
