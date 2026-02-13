public class EmployeeBook {

    Employee[] employees = new Employee[10];

    public void getAllEmployees() {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            } else {
                System.out.println(e.toString());
            }
        }
    }

    public double getMiddleSalary() {
        int i = 0;
        int sum = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
                i++;
            }
        }
        double middleSalary = (double) sum / i;
        return middleSalary;
    }

    public double getNalog(int salary, String shema) {
        double percent = 0;
        switch (shema) {
            case "PROPORTIONAL":
                percent = 13;
                break;
            case "PROGRESSIVE":
                if (salary < 150) {
                    percent = 13;
                } else if (salary < 350) {
                    percent = 17;
                } else {
                    percent = 21;
                }
        }
        return percent;
    }

    public void updateSalary(int department, int percent) { //индекс зарплаты
        for (Employee e : employees) {
            if (e == null) {
                continue;
            } else if (e.getDepartment() != department) {
                System.out.print("Зарплата не изменилась - ");
                e.printShortInfo();
            } else {
                e.setSalary(e.getSalary() + percent * e.getSalary() / 100);
                System.out.print("Новая зарплата - " + e.getSalary() + " ");
                e.printShortInfo();
                ;
            }
        }
    }

    public void getFirstEmployeeWithMaxSalary(int department, int salary) {
        for (Employee e : employees) {
            if (e != null && e.getDepartment() == department && e.getSalary() >= salary) {
                System.out.print("Номер: " + e.getId() + " ");
                e.printShortInfo();
                break;
            }
        }
    }

    public void getEmployeesWithMinSalary(int wage, int employeeNumber) {
        int i = 0;
        int j = 0;
        while (employeeNumber > i) {
            if (employees[j].getSalary() < wage) {
                employees[j].printShortInfo();
                i++;
            }
            j++;
        }
    }

    public boolean compareEmployees(Employee e) {
        boolean result = false;
        for (Employee ee : employees) {
            result = ee.equals(e);
            if (result) {
                break;
            }
        }
        return result;
    }

    public boolean addEmployee(Employee employee) {
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] == null) {
                employees[j] = employee;
                System.out.println("Добавлен - " + employee.getName());
                return true;
            }
        }
        System.out.println("Мест нет - " + employee.getName());
        return false;
    }

    public Employee getEmployee(int id) {
        return employees[id - 1];
    }
}

