public class Squid extends Sealife
{
    public Squid(String n, String s, String sx, int a, int h, int f, double b)
    {
        super(n, s, sx, a, h, f, b);
    }
    public void sink()
    {
        if (buoyancy <= 3)
        {
            boolean life = false;
            life();
        }
        else
        {
            System.out.println("What a beautiful squid!");
        }
    }
    public void ink()
    {
        if (fatigue >= 9 || hunger >= 8)
        {
            System.out.println("This squid is stressed out.");
        }
        else
        {
            eat();
            sleep();
        }
    }
}