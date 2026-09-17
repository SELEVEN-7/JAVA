import java.util.Scanner;
public class COMPOUND_INTEREST_CALCULATOR_22
{
    public static void main (String[] args)
    {
        Scanner TANG = new Scanner (System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount (RM) : ");
        principal = TANG.nextDouble();

        System.out.print("Enter the interest rate (in %) : ");
        rate = TANG.nextDouble() / 100;

        System.out.print("Enter the number of times compound per year : ");
        timesCompound = TANG.nextInt();

        System.out.print("Enter the number of years : ");
        years = TANG.nextInt();

        amount = principal * Math.pow((1+(rate / timesCompound)), (timesCompound * years));
        System.out.printf("The amount after %d years is RM %.2f.", years, amount);

        TANG.close();
    }
}
