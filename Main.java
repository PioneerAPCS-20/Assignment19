
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














