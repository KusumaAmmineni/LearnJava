package AccessModifiers.SamePackage;

public class Student {
    public int rollNo;
    private String name;
    char grade;

    public void getRollNo(int rollNo)
    {
        System.out.println("get rollNo of Student" + rollNo);
    }

    private void getName(String name)
    {
        System.out.println("get student name"+ name);
    }

    void getGrade(char grade)
    {
        System.out.println("get grade of student" + grade);
    }
}
