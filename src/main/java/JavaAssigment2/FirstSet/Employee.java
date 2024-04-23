package JavaAssigment2.FirstSet;

public class Employee {
    String name;
    int age;
    private float monthlySalary;
    int empId;
    boolean isActive;

    //Question2
    public Employee(String name, int age, float salary, int empId, boolean isActive) {
        this.name = name;
        this.age = age;
        this.monthlySalary = salary;
        this.empId = empId;
        this.isActive = isActive;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void getDetails() {

        System.out.println("Name is" + " " + this.name);
        System.out.println("Age is" + " " + this.age);
        System.out.println("ID is" + " " + this.empId);
        System.out.println("--------------------------------");

    }

    public float getTaxAmountToBePaid() {
        float tax = 0.0f;
        if (monthlySalary > 100000) {
            System.out.println("tax percentage is 20%");
            tax = monthlySalary * 20 / 100;
            System.out.println("tax amount to be paid is" + " " + tax);
        } else {
            System.out.println("tax percentage is 0%");
            System.out.println("No tax amount is to be paid");
        }
        System.out.println("-------------------------------------------");
        return tax;
    }


}
