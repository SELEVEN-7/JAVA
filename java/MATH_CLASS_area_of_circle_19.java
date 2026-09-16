import java.util.Scanner;
public class MATH_CLASS_area_of_circle_19
{
    public static void main (String[] args)
    {
        Scanner TANG = new Scanner(System.in);

        System.out.print("Enter the length of radius (cm) : ");
        double radius = TANG.nextDouble();

        double area = Math.PI * Math.pow (radius, 2);

        System.out.printf("The area of circle is %.2f cm².", area);

        TANG.close();
    }
}
