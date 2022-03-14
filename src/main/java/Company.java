import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

    String name;
    String surname;
    double salary;
    Scanner scan = new Scanner(System.in);
    List<Employee> listOfEmployees = new ArrayList<>();

    public Employee createEmployee(Employee employee) {
        System.out.println("Enter employee name");
        employee.setName(scan.nextLine());
        System.out.println("Enter employee surname");
        employee.setSurname(scan.nextLine());
        System.out.println("Enter employee salary");
        employee.setSalary(scan.nextInt());
        scan.nextLine();
        return employee;
    }
    public Employee addEmployee(Employee employee) {
        for (int i = 0; i < 5; i++) {
            listOfEmployees.add(createEmployee(new Employee(name, surname, salary)));
        }
        return employee;
    }

    public void sumSalary() {
        int salarySum = 0;
        for (int i = 0; i < listOfEmployees.size(); i++) {
            salarySum += listOfEmployees.get(i).getSalary();
        }
        System.out.println("The sum of salaries for all employees is " + salarySum);
    }

    public void getAllEmployeesData() {
        for (Employee i : listOfEmployees) {
            System.out.println(i.toString());
        }
    }

    public void menuDisplay() {
        System.out.println("Pick an option: \n" + "1 – Print sum of all employees salary\n" + "\n" + "2 – Display all employees data\n" + "\n" + "3 – Add new employee\n" + "\n" + "4 – End program");
        int optionNumber = scan.nextInt();
        scan.nextLine();
        switch (optionNumber) {
            case 1:
                sumSalary();
                menuDisplay();
                break;
            case 2:
                getAllEmployeesData();
                menuDisplay();
                break;
            case 3:
                listOfEmployees.add(createEmployee(new Employee(name, surname, salary)));
                menuDisplay();
                break;
            case 4:
                System.out.println("End of program");
                break;
            default:
                System.out.println("Please provide a proper number: 1, 2, 3 or 4. Try again");
                menuDisplay();
        }
    }
}
