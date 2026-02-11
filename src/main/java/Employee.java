public class Employee {

    private String name;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id += counter++;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }

    @Override
    public String toString() {
        return "name: " + name + ", department: " + department + ", salary: " + salary;
    }

    public void printShortInfo() {
        System.out.println("Name: " + name + ", salary: " + salary);
    }
}
