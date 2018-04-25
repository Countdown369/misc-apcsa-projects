public class MrDinh extends Animal
{
    protected int annoyance;
    public MrDinh(String n, String s, String sx, int a, int h, int f, int an)
    {
        super(n, s, sx, a, h, f);
        annoyance = a;
    }
    public void sleep()
    {
        if (fatigue >= 8) 
        {
            System.out.println("The " + species + " just got home from a busy day and is going to sleep.");
        }
        else
        {
            System.out.println("The " + species + " is still wide awake, but probably wishing they were taking a nap.");
        }
    }
    public void eat()
    {
        if (hunger >= 6)
        {
            System.out.println(name + " would like to be fed! Go get the Sour Patch Kids.");
        }
        else
        {
            System.out.println(name + " is not very hungry, but ultimately would eat something regardless.");
        }
    }
    public void yell()
    {
        if (annoyance >= 6)
        {
            System.out.println("\"Get off of my property!\"");
        }
        else
        {
            System.out.println("\"I'm mostly just bored. It's alright here.\"");
        }
    }
}