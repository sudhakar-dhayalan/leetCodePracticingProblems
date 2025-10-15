import java.util.*;
import java.util.stream.Collectors;

//Highest paid employee by department:
//    Finance -> Grace
//    HR -> Eve
//    IT -> Charlie
public class HighestPaidEmployeeBySal {
    public static void main(String[] args) {
        List<Empl> employees = Arrays.asList(
                new Empl("Alice", 30, "IT", 70000),
                new Empl("Bob", 45, "HR", 50000),
                new Empl("Charlie", 25, "IT", 80000),
                new Empl("David", 38, "Finance", 60000),
                new Empl("Eve", 29, "HR", 55000),
                new Empl("Frank", 26, "IT", 65000),
                new Empl("Grace", 40, "Finance", 75000)
        );

        Map<String, Optional<Empl>> highest = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Empl::dName,
                                Collectors.maxBy(
                                        Comparator.comparingInt(Empl::salary)
                                ))
                );
        System.out.println("Dept -> Highest paying employee name in this department");
        highest.forEach((dept, emp) -> System.out.println(dept + " -> " + emp.get().name()));

        System.out.println("========");

        Map<String, Optional<Empl>> secondHighestPaidEmpOnEachDepartment = employees
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Empl::dName
                        )
                )
                .entrySet()
                .stream()
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                e -> e.getValue()
                                        .stream()
                                        .sorted(Comparator.comparingInt(Empl::salary).reversed())
                                        .skip(1)
                                        .findFirst()
                        )
                );
        System.out.println("Dept -> Second highest paying employee name in this department");
        secondHighestPaidEmpOnEachDepartment.forEach((dept, emp) -> {
            System.out.println(dept + " -> " + emp.map(Empl::name).orElse("None"));
        });

        System.out.println("======");
        Map<String, Optional<Empl>> secondHighestPaidEmpOnEachDepartment2ndWay = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Empl::dName,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparingInt(Empl::salary).reversed())
                                                .skip(1)
                                                .findFirst()
                                )
                        )
                );
        System.out.println("Dept -> Second highest paying employee name in this department, 2nd way");
        secondHighestPaidEmpOnEachDepartment2ndWay.forEach((dept, emp) -> {
            System.out.println(dept + " -> " + emp.map(Empl::name).orElse("None"));
        });


        // Find out sum of salary based on gender from an employee
        System.out.println("Find out sum of salary based on Age");
        Map<Integer, Integer> salary = employees
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Empl::age,
                                Collectors.summingInt(Empl::salary)
                        )
                );
        System.out.println(salary);


        System.out.println("Highest earning employee over all the departments");
        Empl empl = employees
                .stream()
                .max((e1, e2) -> e1.salary() > e2.salary() ? 1 : -1)
                .get();
        System.out.println(empl);
    }
}

record Empl(
        String name,
        int age,
        String dName,
        int salary
) {
}

//class Empl {
//    private String name;
//    private int age;
//    private String dName;
//    private int salary;
//
//    public Empl(String name, int age, String dName, int salary) {
//        this.name = name;
//        this.age = age;
//        this.dName = dName;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getdName() {
//        return dName;
//    }
//
//    public void setdName(String dName) {
//        this.dName = dName;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Empl{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", dName='" + dName + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//}
