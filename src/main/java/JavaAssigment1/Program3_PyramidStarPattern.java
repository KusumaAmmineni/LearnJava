package JavaAssigment1;

public class Program3_PyramidStarPattern {

    public void pyramidPattern() {
        for (int i = 1; i <= 5; i++) /* for number of rows, iterations of i start from 1 until 5*/ {
            for (int j = 1; j <= 5 - i; j++)  /* for number of spaces, iterations of j start from 1 to 0 */ {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) /* for number of stars, iterations of k start from 1 to 9  */ {
                System.out.print("*");
            }
            System.out.println();

        }
    }


}
