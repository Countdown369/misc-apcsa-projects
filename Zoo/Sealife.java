public class Sealife extends Animal
{
    protected double buoyancy;
    public Sealife(String n, String s, String sx, int a, int h, int f, double b)
    {
        super(n, s, sx, a, h, f);
        buoyancy = b;
    }
    public void life()
    {
        boolean life = true;
        if (age >= 3)
        {
            life = false;
        }
        if (life = false)
        {
            System.out.println("Yeah, " + name + " passed away " + ((int)(Math.random() * 2 + 1)) + " years ago.");
        }
        else
        {
            zootime();
        }
    }
    public void sink()
    {
        if (buoyancy <= 1)
        {
            boolean life = false;
            life();
        }
        else
        {
            System.out.println("What a beautiful fish!");
        }
    }
}