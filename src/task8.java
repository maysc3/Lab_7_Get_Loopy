import java.util.Random;
import java.util.Scanner;
public class task8
{
    public static void main(String[] args)
    {
        Random rng = new Random();
        Scanner in = new Scanner(System.in);

        String rollAgainYN = "";
        boolean done = false;
        do
        {
            int roll = 0;
            int die1=-1;
            int die2=-2;
            int die3=-3;
            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("____________________________________");
            while (!(die1 == die2 && die2 == die3))
            {
                die1 = rng.nextInt(6) + 1;
                die2 = rng.nextInt(6) + 1;
                die3 = rng.nextInt(6) + 1;
                roll++;
                int sum = die1 + die2 + die3;
                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\t", roll, die1, die2, die3, sum);
                System.out.println();

            }
            System.out.print("Would you like to roll some more? [Y/N]: ");
            if(in.hasNext())
            {
                rollAgainYN = in.nextLine();
                    if(rollAgainYN.equalsIgnoreCase("N"))
                    {
                        done = true;
                    }
            }

        } while (!done);
    }
}
