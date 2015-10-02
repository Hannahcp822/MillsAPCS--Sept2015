
/**
 * ASCII Project - prints a penguin
 * 
 * @author Hannah Pang
 * @version 10/02/15
 */
public class Penguin
{
    public static void main(String[] args)
    {
        int height = 1;
        int width = 1;
        for (int i = 1; i <= width; i++)
        {
            for (int j = 1; j <= height; j++)
            {
                printPenguin();
            }
        }
    }
    
    public static void printPenguin()
    {                           
        System.out.println("                                   88888888");
        System.out.println("                                  8888888888");
        System.out.println("            (MMMMMMMMMMMMMM)      8888888888");
        System.out.println("          (MMMMMMMMMMMMMMMMMM)    8888888888");
        System.out.println("         (@        MM        @)    88888888");
        System.out.println("        (@@     /\\    /\\     @@)      $");
        System.out.println("        (&/     \\/    \\/     \\D)      |");
        System.out.println("        (@       ______       @)      /");
        System.out.println("         (@      \\\\  //      @)       |");
        System.out.println("          @a      \\\\//      o@        \\");
        System.out.println("        &######################D      |");
        System.out.println("      (&&&####################DDD)    /");
        System.out.println("     (&&&&(         ####      )DDD)   |");
        System.out.println("    (&&&&&          ####       DDDDD) \\");
        System.out.println("   (&&&&&(          ####       )DDDDD)|");
        System.out.println("   &&&&&&&          |###       DDDDDDD/");
        System.out.println("  (&&&&&&(          \\###       )DDDDDD)");
        System.out.println("  &&&&&&&&           ####      DDDDDDDD");
        System.out.println("  (&&&&&&&(                   )DDDDDDD)");
        System.out.println("   &WWV &&&                   DDD VWWD");
        System.out.println("    (WV  &&(                 )DD  VW)");
        System.out.println("          &&                 DD");
        System.out.println("           @@@@@@@@@@@@@@@@@@@");
        System.out.println("            W@@@@@@@@@@@@@@@W");
        System.out.println("            W      W W      W");
        System.out.println("            WWW/\\WWW WWW/\\WWW");
    }
}        
