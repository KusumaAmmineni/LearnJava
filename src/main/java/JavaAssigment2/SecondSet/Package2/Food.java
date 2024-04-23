package JavaAssigment2.SecondSet.Package2;

import JavaAssigment2.SecondSet.Package1.Animal;
import JavaAssigment2.SecondSet.Package1.Dog;

import java.sql.SQLOutput;

public class Food {

    public void accessWithDot() {
        Animal f = new Animal();
        f.name = "Biriyani"; //able to access
       //    f.age= 10;  //Not Able to access
       // f.gender = 'M';  //Not able to access
      //  d.id = 9; //Not able to access

        System.out.println("Name is: " + f.name);
        //  System.out.println("Age is: " + f.age);
       // System.out.println("Gender is: " + f.gender);
      //  System.out.println("Id is: " + f.id);
        System.out.println("can't able to access any variables except public declared");
        System.out.println("-----------------");
    }

    public void accessWithoutDot() {
      //  name = "Corgi"; //Not able to access
        //age = 1;  //Not Able to access
        // gender = 'F';  //able to access
       // id = 4; //able to access

       // System.out.println("Name is: " + name);
        //  System.out.println("Age is: " + age);
       // System.out.println("Gender is: " + gender);
       // System.out.println("Id is: " + id);
        System.out.println("can't able to access any of the variables without creating the object");
        System.out.println("-----------------");
    }

}
