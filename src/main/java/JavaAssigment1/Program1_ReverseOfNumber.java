package JavaAssigment1;

public class Program1_ReverseOfNumber {

    int reverseNumber=0;
    int remainder = 0;

    /*
    number 123 as input should print 321 as output
    quotient = divided/divisor
    remainder = divided%divisor
    1234%10 = 123 as quotient and 4 as remainder */
    public int reverseNumber(int number)
    {
        while(number!=0)
        {
            remainder = number%10;
            /*first iteration remainder = 4, Second iteration remainder = 3, third iteration remainder = 2,
            fourth iteration remainder = 1 */

            reverseNumber=reverseNumber*10+remainder; /* first iteration 0*10+4 = 4, second iteration 4*10+3 = 43,
            third iteration 43*10+2 = 432, fourth iteration 432*10+1=4321 */

            number=number/10; /* first iteration quotient 123, second iteration quotient = 12, third iteration quotient = 1,
            fourth iteration quotient 0.1 */
        }
        return reverseNumber; //returns the final reversed number
    }
}
