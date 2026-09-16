import java.util.Scanner;
public class SCANNER_5
{
    public static void  main (String[] args)
    {
        Scanner tang = new Scanner(System.in); //create scanner

        System.out.print("Enter your name : "); //input statement for user
        String name = tang.nextLine(); //read name(String),nextLine() read all,next() do not read space

        System.out.print("Enter your age : "); //input statement for user
        int age = tang.nextInt(); //read age(integer) , use nextInt()

        System.out.print("Enter your GPA : "); //input statement for user
        double gpa = tang.nextDouble(); //read gpa(double) , use nextDouble()

        System.out.print("Are you a student? (true/false) : "); //input statement for user
        boolean isStudent = tang.nextBoolean(); //read isStudent(boolean) , use nextBoolean()

        System.out.println("Hello! "+name); //print output
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is "+gpa);
        if (isStudent)
            System.out.println("You are enrolled as a student");
        else
            System.out.println("You are NOT enrolled");

        tang.close(); //close the scanner

    }
}
