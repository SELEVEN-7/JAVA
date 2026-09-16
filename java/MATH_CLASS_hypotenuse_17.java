import java.util.Scanner;
public class MATH_CLASS_hypotenuse_17
{
    public static void main (String[] args)
    {
        Scanner TANG = new Scanner(System.in);

        System.out.print("Enter the length of side A (cm) : ");
        double a = TANG.nextDouble();

        System.out.print("Enter the length of side B (cm) : ");
        double b = TANG.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); //HYPOTENUSE c = Math.sqrt (a² + b²)

        System.out.printf("The hypotenuse (side C) is %.2f cm", c); //to control the number of decimal

        TANG.close();
    }
}
