import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

class HighestSalary {

    public static void main(String[] args) {
        var employeeList = new HashSet<Employee>();
        employeeList.add(new Employee(1, "person_1", 99));
        employeeList.add(new Employee(2, "person_2", 92));
        employeeList.add(new Employee(3, "person_3", 98));
        employeeList.add(new Employee(4, "person_4", 100));
        employeeList.add(new Employee(4, "person_5", 110));
        employeeList.add(new Employee(4, "person_6", 110));

        Employee emp = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(emp);
        System.out.println(employeeList);
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
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
