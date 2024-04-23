package JavaAssigment2.SecondSet;

import JavaAssigment2.SecondSet.Package1.Animal;
import JavaAssigment2.SecondSet.Package1.Dog;
import JavaAssigment2.SecondSet.Package1.Human;
import JavaAssigment2.SecondSet.Package2.Food;
import JavaAssigment2.SecondSet.Package2.Lion;

public class RunAccessModifiersAssignment {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.accessWithDot();
        a.accessWithoutDot();
        //Able to access all the variables from both the methods

        Dog d = new Dog();
        d.accessWithDot();
        d.accessWithoutDot();
        //able to access all the variable except privately declared from both the methods
        //default can be accessed because of same package
        //protected can be accessed because Dog is child class of Animal and present in same package

        Human h = new Human();
        h.accessWithDot();
        h.accessWithoutDot();
        //able to access all the variable except privately declared from the method which has object created to access them
        //default can be accessed because of same package
        //protected can be accessed because same package
        //Not able to access variable directly without creating object

        Lion l = new Lion();
        l.accessWithDot();
        l.accessWithoutDot();
        //able to access only public declared variables from the method which has object created to access them
        //Able to access Public and Protected declared variable directly without creating an object
        //Protected can be accessed directly eventhough Lion is different package because Lion is subclass of Animal

        Food f = new Food();
        f.accessWithDot();
        f.accessWithoutDot();
        //able to access only public declared variables from the method which has object created to access them
        //Not able to access variable directly without creating object

    }




}
