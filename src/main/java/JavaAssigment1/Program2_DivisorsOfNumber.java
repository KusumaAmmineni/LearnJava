package JavaAssigment1;

public class Program2_DivisorsOfNumber {

    public int number;
    public int remainder, divisor;

    public void divisorOfNumbers(int number) {
        for (int divisor = 1; divisor <= number; divisor++) {
            remainder = number % divisor; /* will give the remainder of the number. divisor will be increased
            every iteration until it reaches 36 */
            if(remainder==0)
            {
                System.out.print(divisor + " ");
            }
        }
        System.out.println('\n' + "All the divisors of " + number + " are printed");
    }

}
