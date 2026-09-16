import java.util.Scanner;
public class SCANNER_BUFFER_PROBLEM_common_issues_6
{
    public static void  main (String[] args)
    {
        Scanner bo = new Scanner(System.in); //create scanner

        System.out.print("Enter your age : "); //input statement for user
        int age1 = bo.nextInt(); //read age(integer) , use nextInt()
        bo.nextLine(); //to solve the buffer problem

        System.out.print("Enter your favorite color : "); //input statement for user
        String color = bo.nextLine(); //read color(String),nextLine() read all,next() do not read space

        System.out.println("Your age is " + age1 + " years old"); //print output
        System.out.println("Your favorite color is " + color);

        bo.close(); //close the scanner

    }
}
