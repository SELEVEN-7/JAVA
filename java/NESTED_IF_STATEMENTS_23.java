import java.util.Scanner;
public class NESTED_IF_STATEMENTS_23
{
    public static void main (String[] args)
    {
        Scanner TANG = new Scanner (System.in);

        double price = 9.99;

        System.out.print("Are you a student? (true/false) : ");
        boolean isStudent = TANG.nextBoolean();

        System.out.print("Are you a senior? (true/false) : ");
        boolean isSenior = TANG.nextBoolean();

        if(isStudent)
        {
            if(isSenior)
            {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else
            {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else
        {
           if (isSenior)
           {
               System.out.println("You get a senior discount of 20%");
               price *= 0.8;
           }
           else
               price *= 1;
        }

        System.out.printf("The price of a ticket is RM %.2f",price);

        TANG.close();
    }
}
