
/**
 * This program uses nested for loops to print an hourglass figure.
 * (Programming Project 2.4)
 * 
 * @author Hannah Pang
 * @version September 18, 2015
 */
public class Hourglass
{
   public static void main(String[] args)
   {
       printQuotes();
       printTopHalf();
       printPipelines();
       printBottomHalf();
       printQuotes();
   }
   
   public static void printQuotes() //prints the first and last lines of the hourglass
   {
       System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
   }
   
   public static void printPipelines() //prints the two pipelines in the middle of the hourglass
   {
       System.out.println("     ||");
   }
   
   public static void printTopHalf() //prints the top inverted triangle of the hourglass
   {
       for (int i = 1; i <= 4; i++) 
       {
           for (int j = 1; j <= i; j++) //number of spaces increases as i increases
           {
               System.out.print(" "); 
           }
           System.out.print("\\");
           for (int k = 4; k >= i; k--) //number of "::" decreases as i increases
           {
               System.out.print("::");
            }
           System.out.println("/");
       }
   }
   
   public static void printBottomHalf() //prints the bottom triangle of the hourglass
   {
       for (int i = 1; i <= 4; i++)
       {
           for (int j = 4; j >= i; j--) //number of spaces decreases as i increases
           {
               System.out.print(" ");
           }
           System.out.print("/");
           for (int k = 1; k <= i; k++) //number of "::" increases as i increases
           {
               System.out.print("::");
           }
           System.out.println("\\");
       }
   }
}   
           
            