public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        Employee employee1 = new Employee("Иван", 3, 300);
        Employee employee2 = new Employee("Вова", 1, 50);
        Employee employee3 = new Employee("Петя", 2, 250);
        Employee employee4 = new Employee("Таня", 4, 450);
        Employee employee5 = new Employee("Лена", 5, 333);
        Employee employee6 = new Employee("Марина", 3, 100);
        Employee employee7 = new Employee("Вероника", 3, 111);
        Employee employee8 = new Employee("Даша", 3, 145);
        Employee employee9 = new Employee("Света", 2, 444);
        Employee employee10 = new Employee("Катя", 1, 300);
        Employee employee11 = new Employee("Димка", 2, 200);

        employeeBook.getAllEmployees();

        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee3);
        employeeBook.addEmployee(employee4);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);
        employeeBook.addEmployee(employee10);
        employeeBook.addEmployee(employee11);

        System.out.println(employeeBook.getEmployee(3));

        System.out.println(employeeBook.compareEmployees(employee4));
        System.out.println(employeeBook.compareEmployees(employee11));

        employeeBook.getEmployeesWithMinSalary(200, 2);
        employeeBook.getFirstEmployeeWithMaxSalary(2, 300);

        employeeBook.updateSalary(2, 20);

        System.out.println(employeeBook.getNalog(200, "PROPORTIONAL"));
        System.out.println(employeeBook.getNalog(400, "PROGRESSIVE"));
        System.out.println(employeeBook.getNalog(300, "PROGRESSIVE"));

        System.out.println("Средняя зарплата - " + employeeBook.getMiddleSalary());

        employeeBook.getAllEmployees();
    }
}
