/*Letters 2
 * Allen Ng
 * 8/30/15
 */
public class RecLetters
{
    public static void main(String[] args)
    {
        dreyer ();
        peel ();
        paul ();
    }
    public static void dreyer ()
    {
        System.out.println("Dear Mrs. Dreyer,");
        System.out.println("I'm an amazing student; I work hard.");
        System.out.println("So you should help a bud out.");
        intro ();
        stuffdone ();
        System.out.println("I've participated in programs where they learn to code and do math.");
        stuffdone ();
        begging ();
        System.out.println("I promise to work super hard in AP computer science.");
        salutation ();
    }
    public static void peel ()
    {
        System.out.println("Dear Mrs. Peel");
        System.out.println("I've had you for two years, so you should totally know me and be able");
        System.out.println("to write a really good letter about about how amazing I am.");
        intro ();
        stuffdone ();
        System.out.println("Also I adore math (and your a math teacher!)");
        begging ();
        salutation ();
    }
    public static void paul ()
    {
        System.out.println("Dear Mr. Paul,");
        System.out.println("I was in your class for 2 years, and I was so smart. I got an A+");
        System.out.println("every semester and helped other people figure out their work.");
        intro ();
        stuffdone ();
        System.out.println("Since I helped to much with turoring in chemistry you should really");
        System.out.println("write a letter for me. Please, Please, Please, Please");
        begging ();
        salutation ();
    }
    public static void intro ()
    {
        System.out.println("I finally made it to senior year here at Mills and I'm starting to apply");
        System.out.println("to colleges. The only way I'll get into any of my dream schools is if");
        System.out.println("you help me and write a letter of Rec for me. Here if why you");
        System.out.println("write an amazing letter for me so I can get into Stanford, Cal, or Duke");
    }
    public static void stuffdone ()
    {
        System.out.println("I am such an amazing person becuase I participate in a lot of activities");
        System.out.println("and I always succeed in everything I do. I've taken so many AP");
        System.out.println("classes and gotten A's in all of them. I never fail. I'm in");
        System.out.println("some clubs and I volunteer for some programs.");
    }
    public static void begging ()
    {System.out.println("Please, please, please, please help a bud out.");
    }
    public static void salutation ()
    {
        System.out.println("\t\t\t Sincerely,");
        System.out.println("\t\t\t A student going to college");
    }
}
   