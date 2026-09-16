import java.util.Scanner;
public class CALCULATE_AREA_OF_RECTANGLE_7
{
    public static void  main (String[] args)
    {
        double width = 0 , height = 0 , area = 0;

        Scanner tang = new Scanner(System.in);

        System.out.print("Enter the width (cm) : ");
        width = tang.nextDouble();

        System.out.print("Enter the height (cm) : ");
        height = tang.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + "cm²"); // ² = num lock, alt + 0178

        tang.close();

    }
}
