import java.util.ArrayList;
import java.util.Comparator;

class HighestSalary {

    public static void main(String[] args) {
        var employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "person_1", 99));
        employeeList.add(new Employee(2, "person_2", 92));
        employeeList.add(new Employee(3, "person_3", 98));
        employeeList.add(new Employee(4, "person_4", 100));
        employeeList.add(new Employee(4, "person_5", 110));

        Employee emp = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(emp);
    }
}

class Employee {

    private Integer id;
    private String name;
    private Integer salary;

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", salary=" + salary
                + '}';
    }
}
