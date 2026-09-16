import java.util.Scanner;
public class MAD_LIBS_GAME_8
{
    public static void  main (String[] args)
    {
        Scanner tang = new Scanner(System.in);

        String adjective1 , noun1 , adjective2 , verb1 , adjective3;

        System.out.print("Enter an adjective (description) : ");
        adjective1 = tang.nextLine();
        System.out.print("Enter a noun (animal or person) : ");
        noun1 = tang.nextLine();
        System.out.print("Enter an adjective (description) : ");
        adjective2 = tang.nextLine();
        System.out.print("Enter a verb end with -ing (action) : ");
        verb1 = tang.nextLine();
        System.out.print("Enter an adjective (description) : ");
        adjective3 = tang.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        tang.close();
    }
}
