public class Animal
{
    protected String name, species, sex;
    protected int age, hunger, fatigue;
    public Animal(String n, String s, String sx, int a, int h, int f)
    {
        name = n;
        species = s;
        sex = sx;
        age = a;
        hunger = h;
        fatigue = f;
    }
    public void sleep()
    {
        if (fatigue >= 8) 
        {
            System.out.println("The " + species + " is going to sleep.");
        }
        else
        {
            System.out.println("The " + species + " is still wide awake.");
        }
    }
    public void eat()
    {
        if (hunger >= 6)
        {
            System.out.println(name + " would like to be fed!");
        }
        else
        {
            System.out.println(name + " is not very hungry.");
        }
    }
    public void zootime()
    {
        System.out.println("Our " + species + ", " + name +", has been at the zoo for " + ((int)(Math.random() * 20 + 1)) + " years.");
    }
    public void life()
    {
        boolean life = true;
        if (age >= 100)
        {
            life = false;
        }
        if (life = false)
        {
            System.out.println("Yeah, " + name + " passed away " + ((int)(Math.random() * 3 + 1)) + " years ago.");
        }
        else
        {
            zootime();
        }
    }
}