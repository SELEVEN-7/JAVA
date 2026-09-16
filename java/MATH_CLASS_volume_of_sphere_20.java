import java.util.Scanner;
public class MATH_CLASS_volume_of_sphere_20
{
    public static void main (String[] args)
    {
        Scanner TANG = new Scanner(System.in);

        System.out.print("Enter the length of radius (cm) : ");
        double radius = TANG.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow (radius, 3);

        System.out.printf("The volume of sphere is %.2f cm³.", volume);

        TANG.close();
    }
}
