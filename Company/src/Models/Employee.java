package Models;

import java.util.UUID;

public class Employee {
    private UUID id;
    public int salary;
    private String FIO;
    private int age;
    public Employee(String FIO, int age, int salary) {
        this.id = UUID.randomUUID();
        this.FIO = FIO;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + FIO + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }
}
