
/**
 * This program uses nested for loops to print an output (using stars, slashes, and backslashes) that looks like wings.
 * Programming Project 2.1
 * 
 * @author Hannah Pang
 * @version 09/21/15
 */
public class Wings
{
    public static void main(String[] args)
    {
       for (int i = 0; i < 7; i++) //main for loop with 6 nested for loops 
       {
           for (int j = 6; j >= i; j--) //stars decrease in number
           {
               System.out.print("*");
           }
           for (int k = 0; k <= i; k++) //spaces increase in number
           { 
               System.out.print(" ");
           }
           for (int l = 6; l > i; l--) //slashes decrease in number
           {
               System.out.print("//");
           }
           for (int m = 0; m <= i; m++) //backslashes increase in number
           {
               System.out.print("\\\\");
           }
           for (int n = 0; n <= i; n++) //spaces increase in number
           {
               System.out.print(" ");
           }
           for (int o = 6; o >= i; o--) //stars decrease in number
           { 
               System.out.print("*");
           }
       System.out.println();
       }
    }
}
    