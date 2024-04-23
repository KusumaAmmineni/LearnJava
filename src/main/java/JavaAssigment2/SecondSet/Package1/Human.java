package JavaAssigment2.SecondSet.Package1;

public class Human {
    public void accessWithDot() {
        Animal h = new Animal();

        h.name = "Kent"; //able to access
        //   h.age= 1;  //Not Able to access
        h.gender = 'M';  //able to access
        h.id = 25; //able to access

        System.out.println("Name is: " + h.name);
        //  System.out.println("Age is: " + h.age);
        System.out.println("Gender is: " + h.gender);
        System.out.println("Id is: " + h.id);
        System.out.println("-----------------");
    }

    public void accessWithoutDot() {
        //  name = "Sarah"; //Not able to access
        // age = 27;  //Not Able to access
        //  gender = 'F';  //Not able to access
        // id = 4; //Not able to access

        //System.out.println("Name is: " + name);
        //  System.out.println("Age is: " + age);
//        System.out.println("Gender is: " + gender);
//        System.out.println("Id is: " + id);
        System.out.println("can't able to access the variables without Dot (without creating the instance)");
        System.out.println("-----------------");
    }
}
