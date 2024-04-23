package JavaAssigment2.SecondSet.Package2;

import JavaAssigment2.SecondSet.Package1.Animal;

public class Lion extends Animal {

    public void accessWithDot() {
        Animal l = new Animal();
        l.name = "Lion1"; //able to access
        //    l.age = 6; //Not able to acess
       // l.gender = 'M'; //Not Able to access
        // l.id = 25; //Not able to access

        System.out.println("Name is: " + l.name);
        //  System.out.println("Age is: " + l.age);
        // System.out.println("Gender is: " + l.gender);
        // System.out.println("Id is: " + l.id);
        System.out.println("-----------------");
    }

    public void accessWithoutDot() {
        name = "Lion2"; //able to access
        // age = 2;  //Not Able to access
        gender = 'F';  //able to access
        //  id = 4; //Not able to access

        System.out.println("Name is: " + name);
        //      System.out.println("Age is: " + age);
        System.out.println("Gender is: " + gender);
//       System.out.println("Id is: " + id);
        System.out.println("-----------------");
    }
}