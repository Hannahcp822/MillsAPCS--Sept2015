
/**
 * Write a description of class ChristmasTrees here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChristmasTrees
{
    public static void main(String[] args) 
    {
        int segment = 3;
        int height = 4;
        printTree(segment,height);
    }
    
    public static void printTree(int segment, int height)
    {
        int x = 5;
        int y = 1;
        int x1 = x;
        int y1 = y;
        for (int i = 1; i <= segment; i++)
        {
            for (int j = 1; j <= height; j++)
            {
                for (int k = 1; k <= x1; k++)
                {
                    System.out.print(" ");
                }
                for (int l = 1; l <= y1; l++)
                {
                    System.out.print("*");
                }
                System.out.println();
                x1--;
                y1 += 2;
            }
            x -= 1;
            y += 2;
            x1 = x;
            y1 = y;
        }
        printBase();
    }
    
    public static void printBase()
    {
        oneStar();
        oneStar();
        System.out.println("  *******");
    }
    
    public static void oneStar()
    {
            System.out.println("     *");
    }
}
