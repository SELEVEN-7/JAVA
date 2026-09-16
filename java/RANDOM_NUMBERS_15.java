import java.util.Random; //like create a scanner, but it is random
public class RANDOM_NUMBERS_15
{
    public static void main (String[] args)
    {
        Random TANG = new Random (); //create Random

        int number1;//declare variable
        double number2;
        boolean isHeads;

        number1 = TANG.nextInt(1,101); // range of 1 to 6, first number inclusive, second number exclusive, if do not give a range it is in range -2 billion to 2 billion
        number2 = TANG.nextDouble();//between 0 and 1
        isHeads = TANG.nextBoolean();//true or false

        System.out.println(number1);
        System.out.println(number2);

        if(isHeads)
            System.out.println("HEADS");
        else
            System.out.println("TAILS");
    }
}
