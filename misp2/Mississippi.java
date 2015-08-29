
/*
 * Allen Ng
 * Mississippi Attempt 2
 * 8-29-15
 */
public class Mississippi
{
    public static void m()
    {
        farM();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        farM();
        farM();
        farM();
    }

    public static void farM()
    {
        System.out.println("M     M");
    }

    public static void i()
    {
        fiveI();
        iGroup();
        fiveI();
    }

    public static void fiveI()
    {
        System.out.println("IIIII");
    }

    public static void iGroup()
    {
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");
        System.out.println("  I  ");     
        System.out.println("  I  ");
    }

    public static void s()
    {
        fiveS();
        someS();
        nearS();
        fiveS();
        farS();
        someS();
        fiveS();
    }

    public static void fiveS()
    {
        System.out.println(" SSSSS ");
    }

    public static void someS()
    {
        System.out.println("S     S");
    }

    public static void nearS()
    {
        System.out.println("S");
    }

    public static void farS()
    {
        System.out.println("      S");
    }

    public static void p()
    {
        sixP();
        twoP();
        twoP();
        sixP();
        groupP();
    }

    public static void sixP()
    {
        System.out.println("PPPPPP");
    }

    public static void twoP()
    {
        System.out.println("P     P");
    }

    public static void groupP()
    {
        System.out.println("P");
        System.out.println("P");
        System.out.println("P");
        System.out.println("P");
    }
    public static void iss()
    {
        i();
        s();
        s();
    }
    public static void main(String[] args)
    {
        m();
        iss();
        iss();
        i();
        p();
        p();
        i();
    }
}
