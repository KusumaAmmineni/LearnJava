public class LearnConditionalStatements {

    public static void main(String[] args)
    {
LearnConditionalStatements lc = new LearnConditionalStatements();
lc.learnIf(61);
lc.learnSwitch("");
    }

    public void learnIf(int age)
    {
        if (age>20 && age<60)
        {
            System.out.println("You are adult!");
        }
        else if (age>60)
            System.out.println("You Are senior citizen");
        else if (age>=13 && age<=19) {
            System.out.println("You are a teenager");
        }
        else
            System.out.println("you are a kid!");

    }

    public void learnSwitch(String corporate) {
        switch (corporate) {
            case "developer":
                System.out.println("you develops the applications");
                break;
            case "tester":
                System.out.println("you test the application");
                break;
            case "po":
                System.out.println("you specify requirements");
                break;
            default:
                System.out.println("you are client");

        }
    }
}
