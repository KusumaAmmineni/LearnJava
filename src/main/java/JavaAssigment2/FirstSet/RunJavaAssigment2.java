package JavaAssigment2.FirstSet;


import JavaAssigment2.FirstSet.Admin;
import JavaAssigment2.FirstSet.Employee;
import JavaAssigment2.FirstSet.Organization;

public class RunJavaAssigment2 {

    public static void main(String[] args) {

        Admin rohan = new Admin();


        Organization podTest = new Organization();

        podTest.printEmployeeDetailsAll();

        Employee[] employees = podTest.employees;

        Employee emp = new Employee("Saron", 27, 50000, 6, true);
        emp.getDetails();
        emp.getTaxAmountToBePaid();

        rohan.getTotalRequiredBudget(podTest);

        rohan.getTotalTaxCollected(podTest);

        rohan.printTaxAmountPerEmployee(podTest);

    }


}
