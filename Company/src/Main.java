import Models.Department;
import Models.Employee;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Employee> employee = new HashSet<>();
        employee.add(new Employee( "И.И. Иванов",26,25000));
        employee.add(new Employee( "А.В. Сидоров",54,30000));

        Department department = new Department("Отдел1",employee);
        department.add(new Employee("И.И. Иванов",26,25000));
        department.add(new Employee( "А.В. Сидоров",54,30000));

        Department groupLoaded = new Department("Отдел2",employee);

        System.out.println(department);
        System.out.println(groupLoaded);
    }
}
