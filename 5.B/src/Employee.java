// Employee class to manage employee details
public class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}

// SalaryCalculator class to handle salary calculation logic
 class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        switch (employee.getRole()) {
            case "Manager":
                return 80000;
            case "Developer":
                return 60000;
            case "Intern":
                return 30000;
            default:
                return 40000;
        }
    }
}

// Demonstration
 class SRPMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "Manager");
        Employee emp2 = new Employee("Bob", "Developer");

        SalaryCalculator calculator = new SalaryCalculator();
        System.out.println(emp1.getName() + "'s salary: " + calculator.calculateSalary(emp1));
        System.out.println(emp2.getName() + "'s salary: " + calculator.calculateSalary(emp2));
    }
}
