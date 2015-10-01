
/**
 * Programming Project 3.1 - ChristmasTrees
 * Prints christmas trees with different heights and number of segments.
 * 
 * @author Hannah Pang
 * @version September 30, 2015
 */

public class ChristmasTrees
{   
    public static void main(String[] args) 
    {
        printTree(2,5);
        printTree(3,4);
        printTree(3,3);
        printTree(5,5);
        printTree(8,8);
    }
    
    public static void printTree(int segment, int height)
    {
        // use nested for loops to print the segments of the tree
        
        int spaces = segment + height - 2; // number of spaces in first row of first segmet
        int stars = 1; // number of stars in first row of first segment
        
        for (int i = 1; i <= segment; i++)
        {
            int spaces1 = spaces;
            int stars1 = stars;
            
            for (int j = 1; j <= height; j++)
            {
                
                for (int k = 1; k <= spaces1; k++)
                {
                    System.out.print(" ");
                }

                for (int l = 1; l <= stars1; l++)
                {
                    System.out.print("*");
                }
                System.out.println();
                
                // decrement "spaces1" so next row in segment will have 1 less space than the previous row 
                spaces1 --;
                // increment "stars1" so next row in segment will have 2 more stars than previous row 
                stars1 += 2;
            }
        
            // first line of next segment has 1 less space than the first line of the previous segment
            spaces --;  
            
            // first line of next segment has 2 more stars than the first line of the previous segment
            stars += 2;
        }
        
        // print two identical rows each with 1 star centered to form the trunk of the tree
        
        int spacesForTrunk = segment + height - 2; 
        for (int i = 1; i <= spacesForTrunk; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
        
        for (int i = 1; i <= spacesForTrunk; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
        
        // print one row with 7 stars centered to form the base of the tree
    
        int spacesForBase = segment + height - 5; 
        for (int i = 1; i <= spacesForBase; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*******");
        System.out.println();
    }
}

