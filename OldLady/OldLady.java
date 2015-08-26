public class OldLady
{
    public static void main(String[] args)
    {
        IKnow();
        System.out.println("fly,");
        Fly();
        System.out.println();
        IKnow();
        System.out.println("spider.");
        Spider();
        System.out.println();
        IKnow();
        System.out.println("bird,");
        System.out.println("How absurd to swallow a bird!");
        Bird();
        System.out.println();
        IKnow();
        System.out.println("cat,");
        System.out.println("Imagine that, to swallow a cat!");
        Cat();
        System.out.println();
        IKnow();
        System.out.println("dog,");
        System.out.println("My, what a hog, to swallow a dog!");
        Dog();
        System.out.println();
        IKnow();
        System.out.println("goat,");
        System.out.println("Just opened her throat and swallowed a goat!");
        Goat();
        System.out.println();
        IKnow();
        System.out.println("cow,");
        System.out.println("I wonder how she swallowed a cow?!");
        System.out.println();
        Horse();
    }
    public static void Horse()
    {
        System.out.println("I know an old lady who swallowed a horse.");
        System.out.println("She's dead, of course.");
    }
    public static void Fly()
    {
        System.out.println("I don't know why she swallowed the fly,");
        System.out.println("I guess she'll die.");
    }
    public static void Spider()
    {
        System.out.println("That wriggled and jiggled and tickled inside her.");
        System.out.println("She swallowed the spider to catch the fly.");
        Fly();
    }
    public static void Bird()
    {
        System.out.println("She swallowed the bird to catch the spider.");
        Spider();
    }
    public static void Cat()
    { 
        System.out.println("She swallowed the cat to catch the bird.");
        Bird();
    }
    public static void Dog()
    {
        System.out.println("She swallowed the dog to catch the cat.");
        Cat();
    }
    public static void Goat()
    {
        System.out.println("She swallowed the goat to catch the dog.");
        Dog();
    }
    public static void Cow()
    {
        System.out.println("She swallowed the cow to catch the goat.");
        Goat();
    }
    public static void IKnow()
    {
        System.out.print("I know an old lady who swallowed a ");
    }
}