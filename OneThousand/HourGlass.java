/*Allen Ng
 * 9/17/15
 * Attempt 1 of HourGlass revisited
 */
public class HourGlass
{
    public static void main(String[] args)
    {
        tip();
        for (int i = 1; i <= 4; i++)
        {
            System.out.print(" ");
            for (int j = 1; j <= 1; j++)
            {
                System.out.print("\\");
                for (int k = 1; 10 - (2 * i) > 0; k++)
                {
                    System.out.print("::");
                }
            }
            System.out.print("/");
            System.out.println();
        }
        System.out.println("     ||");
        for (int i = 1; 5 - i > 0; i++)
        {
            System.out.print(" ");
            for (int j = 1; j <= 1; j++)
            {
                System.out.print("/");
                for (int k = 1; 2 * i <10;  k++)
                {
                System.out.print("::");
                }
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
