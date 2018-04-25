public class Robot extends Animal
{
    protected int battery;
    public Robot(String n, String s, String sx, int a, int h, int f, int b)
    {
        super(n, s, sx, a, h, f);
        battery = b;
    }
    public void sleep()
    {
        if (battery < 1) 
        {
            System.out.println("The " + species + "'s battery has died. Plug it it to recharge.");
        }
        else
        {
            System.out.println("The " + species + " is still operating.");
        }
    }
    public void eat()
    {
        System.out.println("\"I only hunger for more knowledge, simple animal.\"");
    }
    public void life()
    {
        boolean life = true;
        if (age >= 20)
        {
            life = false;
        }
        if (life = false)
        {
            System.out.println("Yeah, " + name + " stopped turning on " + ((int)(Math.random() * 3 + 1)) + " years ago.");
        }
        else
        {
            zootime();
        }
    }
    public void name()
    {
        if (name == "")
        {
            System.out.println("Please contact the administrator to give this " + species + " a name.");
        }
        else
        {
            System.out.println("It's name is " + name + ".");
        }
    }
}