/*Allen Ng
 * 9-18-15
 * Attempt two of HourGlass
 */
public class HourGlass
{
    public static void main(String[] args)
    { 
        tip();
        for (int lines = 1; lines <= 4; lines++)
        { 
            for (int i = 1; i <= lines; i++)
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 1; j <= 5 - lines; j++)
            {
                System.out.print("::");
            }
            System.out.print("/");
            System.out.println();
        }
        System.out.println("     ||");
        for (int lines = 1; lines <= 4; lines++)
        {
            for (int i = 1; i <= 5 - lines; i++)
            {
             System.out.print(" ");   
            }
            System.out.print("/");
            for (int j = 4; j <= 5 - lines; j--)
            {
                System.out.print("::");
            }
            System.out.print("\\");
            System.out.println();
        }
        tip();
    }
    public static void tip()
    {
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }
}
                