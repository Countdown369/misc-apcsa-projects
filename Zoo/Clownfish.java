public class Clownfish extends Sealife
{
    public Clownfish(String n, String s, String sx, int a, int h, int f, double b)
    {
        super(n, s, sx, a, h, f, b);
    }
    public void findanemone()
    {
        if (fatigue >= 6)
        {
            System.out.println("The " + species + " is returning home. They're all tuckered out for the day.");
        }
        else if (hunger >= 4)
        {
            System.out.println(name + " is still on the prowl for some food.");
        }
        else
        {
            System.out.println(name + " is exploring the habitat.");
        }
    }
}