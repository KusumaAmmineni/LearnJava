package JavaAssigment2.SecondSet.Package1;

import java.sql.SQLOutput;

public class Animal {
    public String name;
    private int age;
    protected char gender;
    int id;

    public void accessWithDot() {
        Animal a = new Animal();
        a.name = "Tiger"; //able to access
        a.age = 7; //able to access
        a.gender = 'F'; //able to access
        a.id = 1; //able to access

        System.out.println("Name is: " + a.name);
        System.out.println("Age is: " + a.age);
        System.out.println("Gender is: " + a.gender);
        System.out.println("Id is: " + a.id);
        System.out.println("-----------------");

    }

    public void accessWithoutDot() {
        name = "Deer"; //able to access
        age = 3; //able to access
        gender = 'M'; //able to access
        id = 2; //able to access

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Gender is: " + gender);
        System.out.println("Id is: " + id);
        System.out.println("-----------------");
    }

}
