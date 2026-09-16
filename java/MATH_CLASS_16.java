public class MATH_CLASS_16
{
    public static void main (String[] args)
    {
        //System.out.println(Math.PI); //print value of PI
        //System.out.println(Math.E); //print value of E(exponential constant)

        double result1, result2, result3, result4, result5, result6, result7, result8;

        result1 = Math.pow (2, 3); //Math.pow (a, b), which means a power of b
        result2 = Math.abs (-5); //Math.abs (a), which means the absolute value of a
        result3 = Math.sqrt (64); //Math.sqrt (a), which means square root of a
        result4 = Math.round (3.667); //Math.round (a), which means round a to the nearest whole number
        result5 = Math.ceil (3.14); //Math.ceil (a), which means round a up to the ceiling
        result6 = Math.floor (3.999); //Math.floor (a), which means round a down to the floor
        result7 = Math.max(4, 7); //Math.max (a, b), which means find the max number between a and b
        result8 = Math.min(2, 9); //Math.min (a, b), which means find the min number between a and b

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
    }
}
