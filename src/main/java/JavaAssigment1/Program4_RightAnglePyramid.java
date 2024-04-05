package JavaAssigment1;

public class Program4_RightAnglePyramid {

    public void rightAnglePyramid() {
        //To Print the Triangle in increased pattern
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //To Print the Triangle in decreased pattern
        for (int i = 0; i <= 5; i++) /* for rows */ {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Together, it will form right angled pryamid.
    }

}
