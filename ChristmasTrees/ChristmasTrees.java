
/**
 * Programming Project 3.1 - ChristmasTrees
 * Prints christmas trees with different heights and number of segments.
 * 
 * @author Hannah Pang
 * @version September 29, 2015
 */
public class ChristmasTrees
{
    public static void main(String[] args) 
    {
        printTree(8,8);
        printTree(5,5);
    }
    
    public static void printTree(int segment, int height)
    {
        int x = segment + height - 2;
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
        int z1 = segment + height - 2; 
        for (int i = 1; i <= z1; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 1; i <= z1; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
    
        int z2 = segment + height - 5; 
        for (int i = 1; i <= z2; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*******");
    }
}
