
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("deFront, sum, without2? ");
        String choice = in.nextLine();
        System.out.print("Enter your string: ");
        String input = in.nextLine();

        if(choice.equals("deFront"))
        {
            System.out.println(deFront(input));
        }
        else if(choice.equals("sum"))
        {
            System.out.println(sum(input));
        }
        else if(choice.equals("without2"))
        {
            System.out.println(without2(input));
        }
        else
        {
            System.out.println("Invalid method.");
        }
    }

    public static String deFront(String str)
    {
        String first = "";
        String sec = "";
        String rest = "";

        int len = str.length();

        // checking to see if the first char is an 'a'
        if(len > 0 && str.substring(0, 1).equals("a"))  // same as == true
        {
            first = "a";
        }

        // checking to if the second char is a 'b'
        if(len > 1 && str.substring(1, 2).equals("b"))
        {
            sec = "b";
        }

        // get rest of string, if it exists
        if(len > 2)
        {
            rest = str.substring(2);
        }

        return first + sec + rest;

        // if you want the char at index n
        // substring(n, n+1);
    }

    public static String without2(String str)
    {
        int len = str.length();

        if(len < 2)
        {
            return str;
        }

        // check to see if the first two chars are the same as the last two chars
        // without2("HelloHe") → "Hello" (all capitals come before any lowercase)

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(len - 2);
        
        // if(firstTwo.equals(lastTwo))

        if(str.substring(0, 2).equals(str.substring(len - 2)))
        {
            // grab first letter
            // grab the second letter
            String first = str.substring(0, 1);
            String sec = str.substring(len - 1);
            
            // check the order (compareTo)
            // "a".compareTo("b") < 0 ("a" comes before "b")
            // "b".compareTo("a") > 0 ("b" comes after "a")
            // "a".compareTo("a") == 0 (same string)
            int comp = first.compareTo(sec);
            

            // if compareTo <= 0
            // return string without the last two chars
            if(comp <= 0)
            {
                return str.substring(0, len - 2);
            }

            // else
            // return String without first two chars
            else
            {
                return str.substring(2);
            }
        }

        return str;
    }

    public static int sum(String str)
    {
        // sum("10 + 7") → 17
        // sum("2+1") → 3
        // sum("10 + -7") → 3
        // "num1 + num2"
        
        int plus = str.indexOf("+");
        
        String firstNum = str.substring(0, plus);
        int num1 = Integer.parseInt(firstNum.trim());  // "10 ".trim() -> "10"

        String secNum = str.substring(plus + 1);
        int num2 = Integer.parseInt(secNum.trim());

        return num1 + num2;
    }
}














