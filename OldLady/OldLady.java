/*Allen Ng
 * 8/31/15
 * Revision 1
 */
public class OldLady
{
    public static void main(String[] args)
    {
        iKnow();
        System.out.println("fly,");
        fly();
        System.out.println();
        iKnow();
        System.out.println("spider.");
        spider();
        System.out.println();
        iKnow();
        System.out.println("bird,");
        System.out.println("How absurd to swallow a bird!");
        bird();
        System.out.println();
        iKnow();
        System.out.println("cat,");
        System.out.println("Imagine that, to swallow a cat!");
        cat();
        System.out.println();
        iKnow();
        System.out.println("dog,");
        System.out.println("My, what a hog, to swallow a dog!");
        dog();
        System.out.println();
        iKnow();
        System.out.println("goat,");
        System.out.println("Just opened her throat and swallowed a goat!");
        goat();
        System.out.println();
        iKnow();
        System.out.println("cow,");
        System.out.println("I wonder how she swallowed a cow?!");
        cow();
        System.out.println();
        horse();
    }
    public static void horse()
    {
        System.out.println("I know an old lady who swallowed a horse.");
        System.out.println("She's dead, of course.");
    }
    public static void fly()
    {
        System.out.println("I don't know why she swallowed the fly,");
        System.out.println("I guess she'll die.");
    }
    public static void spider()
    {
        System.out.println("That wriggled and jiggled and tickled inside her.");
        System.out.println("She swallowed the spider to catch the fly.");
        fly();
    }
    public static void bird()
    {
        System.out.println("She swallowed the bird to catch the spider.");
        spider();
    }
    public static void cat()
    { 
        System.out.println("She swallowed the cat to catch the bird.");
        bird();
    }
    public static void dog()
    {
        System.out.println("She swallowed the dog to catch the cat.");
        cat();
    }
    public static void goat()
    {
        System.out.println("She swallowed the goat to catch the dog.");
        dog();
    }
    public static void cow()
    {
        System.out.println("She swallowed the cow to catch the goat.");
        goat();
    }
    public static void iKnow()
    {
        System.out.print("I know an old lady who swallowed a ");
    }
}