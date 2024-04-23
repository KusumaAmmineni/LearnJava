package JavaAssigment2.FirstSet;

import JavaAssigment2.FirstSet.Employee;

public class Organization {

    int noOfEmployees;
    //Employee[] employees;

    Employee[] employees = new Employee[]{
            new Employee("Andrew", 26, 400000.0F, 1,true),
            new Employee("Nomad", 25, 350000.8F, 2,false),
            new Employee("Gerald", 23, 200000.312F, 3,true),
            new Employee("Shaket", 22, 400000.209F, 4, false),
            new Employee("Derek", 24, 600000.988F, 5,true)
    };

    public void printEmployeeDetailsAll() {

        for (Employee employee : employees) {
            System.out.println("Employee Name is" + " " + employee.name);
            System.out.println("Employee Age is" + " " + employee.age);
            System.out.println("Employee Id is" + " " + employee.empId);
        }

        {

        }
    }
}
