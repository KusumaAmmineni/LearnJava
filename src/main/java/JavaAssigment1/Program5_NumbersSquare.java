package JavaAssigment1;

public class Program5_NumbersSquare {

    public void numberSquare() {
        for (int i = 0; i < 7; i++) //rows
        {
            for (int j = 0; j < 7; j++) //numbers
            {
                if (i == 0 || i == 6 || j == 0 || j == 6) {
                    System.out.print("4");
                } else if (i == 1 || i == 5 || j == 1 || j == 5)
                    System.out.print("3");
                else if (i == 2 || i == 4 || j == 2 || j == 4)
                    System.out.print("2");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}


