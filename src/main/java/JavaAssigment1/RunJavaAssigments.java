package JavaAssigment1;

public class RunJavaAssigments {
    public static void main(String[] args) {
        //Program 1
        Program1_ReverseOfNumber run_N1 = new Program1_ReverseOfNumber();
        Program1_ReverseOfNumber run_N2 = new Program1_ReverseOfNumber();
        int N1 = 123;
        int N2 = 234;
        System.out.println("Reverse of " + N1 + " is: " + run_N1.reverseNumber(N1));
        System.out.println("Reverse of " + N2 + " is:" + run_N2.reverseNumber(N2));

        //Program 2

        Program2_DivisorsOfNumber run_divisor1 = new Program2_DivisorsOfNumber();
        run_divisor1.divisorOfNumbers(36);

        // program 3

        Program3_PyramidStarPattern pyramid = new Program3_PyramidStarPattern();
        pyramid.pyramidPattern();

        //program 4

        Program4_RightAnglePyramid rightAnglePyramid = new Program4_RightAnglePyramid();
        rightAnglePyramid.rightAnglePyramid();

        //program 5

        Program5_NumbersSquare numbersSquare = new Program5_NumbersSquare();
        numbersSquare.numberSquare();

        //testing to see the username and email

    }

}
