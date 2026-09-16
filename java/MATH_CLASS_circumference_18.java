import java.util.Scanner;
public class MATH_CLASS_circumference_18
{
    public static void main (String[] args)
    {
        Scanner TANG = new Scanner(System.in);

        System.out.print("Enter the length of radius (cm) : ");
        double radius = TANG.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.printf("The circumference is %.2f cm.", circumference);

        TANG.close();
    }
}
