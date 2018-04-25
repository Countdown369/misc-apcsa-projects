public class Dragon extends Animal
{
    protected int annoyance;
    public Dragon(String n, String s, String sx, int a, int h, int f, int an)
    {
        super(n, s, sx, a, h, f);
        annoyance = a;
    }
    public void life()
    {
        System.out.println("It may not ever die.");
    }
    public void breathefire()
    {
        if (annoyance >= 6)
        {
            System.out.println("Get away from it, it's about to breathe FIRE!");
        }
        else
        {
            System.out.println("It seems placid at the moment...but be cautious.");
        }
    }
}