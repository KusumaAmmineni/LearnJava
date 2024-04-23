package JavaAssigment2.SecondSet.Package1;

public class Dog extends Animal {

    public void accessWithDot() {
        Dog d = new Dog();
        d.name = "German Shepherd"; //able to access
        //    d.age= 1;  //Not Able to access
        d.gender = 'M';  //able to access
        d.id = 3; //able to access

        System.out.println("Name is: " + d.name);
        //  System.out.println("Age is: " + d.age);
        System.out.println("Gender is: " + d.gender);
        System.out.println("Id is: " + d.id);
        System.out.println("-----------------");
    }

    public void accessWithoutDot() {
        name = "Corgi"; //able to access
        //age = 1;  //Not Able to access
        gender = 'F';  //able to access
        id = 4; //able to access

        System.out.println("Name is: " + name);
        //  System.out.println("Age is: " + age);
        System.out.println("Gender is: " + gender);
        System.out.println("Id is: " + id);
        System.out.println("-----------------");
    }


}
