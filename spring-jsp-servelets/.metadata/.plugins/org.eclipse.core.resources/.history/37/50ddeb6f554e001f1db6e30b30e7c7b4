package stream;



import java.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamMain {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee<Integer>> employees = Arrays.asList(
            new Employee<>(1, "John Doe", 25, 50000.0),
            new Employee<>(2, "Jane Smith", 30, 60000.0),
            new Employee<>(3, "Jack Johnson", 35, 70000.0),
            new Employee<>(4, "Jill Brown", 40, 80000.0)
        );

        // Example: Filter employees with salary greater than 55000, sort by name, and print each
        employees.stream()
                 .filter(emp -> emp.getSalary() > 55000)
                 .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                 .forEach(System.out::println);

        // Example: Collect employees older than 30 to a list
        List<Employee<Integer>> filteredEmployees = employees.stream()
                                                             .filter(emp -> emp.getAge() > 30)
                                                             .collect(Collectors.toList());

        System.out.println("\nEmployees older than 30:");
        filteredEmployees.forEach(System.out::println);

        // Example: Map employee names to a list of strings
        List<String> employeeNames = employees.stream()
                                              .map(Employee::getName)
                                              .collect(Collectors.toList());

        System.out.println("\nEmployee Names:");
        employeeNames.forEach(System.out::println);
        // Find the youngest employee
        Optional<Employee<Integer>> youngestEmployee = employees.stream()
                                                                .min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

        // Display the details of the youngest employee
        youngestEmployee.ifPresent(employee -> {
            System.out.println("Youngest Employee:");
            System.out.println(employee);
        });
        
        // Find the employee with the lowest salary
        Optional<Employee<Integer>> lowestSalaryEmployee = employees.stream()
                                                                    .min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        // Display the details of the employee with the lowest salary
        lowestSalaryEmployee.ifPresent(employee -> {
            System.out.println("Employee with the Lowest Salary:");
            System.out.println(employee);
        });
        // Calculate the total salary
        double totalSalary = employees.stream()
                                      .mapToDouble(Employee::getSalary)
                                      .sum();

        // Display the total salary
        System.out.println("Total Salary of All Employees: " + totalSalary);
    }
    }

