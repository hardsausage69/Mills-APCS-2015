/*Allen Ng
 * 9-21-15
 * DashesNStars
 */
public class DashesNStars
{
    public static void main(String[] args)
    {
        for (int lines = 1; lines <= 6; lines++)
        {
            for (int i = 6; i >= lines; i--)
            {
                System.out.print("*");
            }
            for (int space = 1; space <= lines; space++)
            {
                System.out.print(" ");
            }
            for (int slash = 6; slash >= lines; slash--)
            {
                System.out.print("//");
            }
            for (int backslash = 1; backslash < lines; backslash++)
            {
                System.out.print("\\\\");
            }
            for (int space = 1; space <= lines; space++)
            {
                System.out.print(" ");
            }
            for (int i = 6; i >= lines; i--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("       \\\\\\\\\\\\\\\\\\\\\\\\");
    }
   
}
