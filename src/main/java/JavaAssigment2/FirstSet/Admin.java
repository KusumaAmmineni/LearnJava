package JavaAssigment2.FirstSet;

public class Admin {

    String role;


    public void getTotalRequiredBudget(Organization org) {
        float totalBudget = 0.0f;
        for (Employee emp : org.employees) {
            if (emp.isActive) {
                totalBudget = totalBudget + emp.getMonthlySalary();

            }
        }
        System.out.println("total Budget is: " + totalBudget);
        System.out.println("--------------------------------");
    }

    public void getTotalTaxCollected(Organization org) {
        float totalTax = 0.0F;
        for (Employee emp : org.employees) {
            totalTax += emp.getTaxAmountToBePaid();
        }
        System.out.println("Total tax collected from all employeess: " + totalTax);
        System.out.println("----------------------------------------------------");

    }

    public void printTaxAmountPerEmployee(Organization org) {
        for(Employee emp : org.employees)
        {
            System.out.println("Total tax for each employee: " + emp.name + " " + emp.getTaxAmountToBePaid());
            System.out.println("------------------------------------------");
        }

    }
}
