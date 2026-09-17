public class PRINTF_21
{
    public static void main (String[] args)
    {
        //printf() = is a method used to format output

        //%[flags][width][.precision][specifier-character]

        String name = "Bobo";
        char firstLetter =  'B';
        int age = 18;
        double height = 168.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s !\n", name); //s for spring
        System.out.printf("Your name starts with a %c.\n", firstLetter); //c for char
        System.out.printf("You are %d years old.\n", age); // d for int
        System.out.printf("You are %f cm tall.\n", height); //f for double, normally output 6 decimal, but we can limit it
        System.out.printf("Employed : %b\n", isEmployed); //b for boolean

        System.out.printf("%s is %d years old\n\n", name, age);

        //[flags]

        //+ = output a positive sign (only for positive number)
        //, = comma grouping separator
        //( = negative numbers are enclosed in ()
        //space = display a minus if negative, space if positive

        double price1 = 9.9999;
        double price2 = 1000000000.333333;
        double price3 = -4.25;
        double price4 = 92.46;

        System.out.printf("%+.3f\n", price1);
        System.out.printf("%,.3f\n", price2);
        System.out.printf("%(.3f\n", price3);
        System.out.printf("% .3f\n", price4);

        //[width]

        //0 = zero padding
        //number = right justified padding
        //negative number = left justified padding

        int id1 = 5;
        int id2 = 320;
        int id3 = 1127;

        System.out.printf("%07d\n", id1); //4 means how many digit
        System.out.printf("%7d\n", id2);
        System.out.printf("%-7d\n", id3);
    }
}
