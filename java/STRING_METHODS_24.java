public class STRING_METHODS_24
{
    public static void main (String[] args)
    {
        String name = "Nathan";

        int length = name.length(); //to calculate how many character in the string
        char letter = name.charAt(4); // to output the character at the index position,index in bracket, starts with 0
        int index = name.indexOf("a"); //to output the index of the character,but only the first
        int lastIndex = name.lastIndexOf("a"); //same but only the last

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        //name = name.toUpperCase(); //change all to upper case
        //name = name.toLowerCase(); //change all to lower case
        //name = name.trim(); //delete the space in front and behind
        //name = name.replace("o","ooo"); //replace the letter or string to another

        //System.out.println(name.isEmpty()); //to check is it the input empty

        /*

        if(name.isEmpty())
            System.out.println("Your name is empty.");
        else
            System.out.printf("Hello %s !", name);

         */

        /*


        if(name.contains("a")) //check the string contains the character or not
            System.out.println("Your name contains letter 'a'");
        else
            System.out.println("Your name DOESN'T contains letter 'a'");


        */

        /*

        if(name.equals("Nathan")) //to check the name equal with the name in bracket or not
            System.out.println("Your name can't be Nathan");
        else
            System.out.printf("Hello %s!", name);

        //name.equalsIgnoreCase("") ,for this can ignore case

         */
    }
}
