public class LearnLooping {

    public static void main(String[] args) {
        LearnLooping ll = new LearnLooping();
       // ll.learnForLoop();
        ll.printStars();
    }

    public void learnForLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Printing 5 Times:" + i);
        }
        System.out.println("Learning Printing of Stars using for loop");
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void printStars()
    {
        System.out.println("Printing * in decreased pattern");
        for (int i=0; i<5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Printing * in increased pattern");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Printing stars in diamond shape");
     /*   for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                for(int k=5;k>j;k--)
                {
                    System.out.print("\t");
                }
                System.out.print("*");
            }
            System.out.println("");
        } */
    }


}
