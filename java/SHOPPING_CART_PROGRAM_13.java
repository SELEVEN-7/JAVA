import java.util.Scanner;
public class SHOPPING_CART_PROGRAM_13
{
    public static void main (String[] args)
    {
        Scanner TANG = new Scanner (System.in);

        String item;
        double price;
        int quantity;
        String currency = "RM";
        double total;

        System.out.print("What item would you like buy? : ");
        item = TANG.nextLine();

        System.out.print("What is the price for each? : ");
        price = TANG.nextDouble();

        System.out.print("How many would you like? : ");
        quantity = TANG.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is "+ currency + " " + total);

        TANG.close();
    }
}
