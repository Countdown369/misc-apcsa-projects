public class Item
{
    private String name;
    private double price;
    private int quanity;
    public Item(String n, double p, int q)
    {
        name = n;
        price = p;
        quanity = q;
    }
    public String toString()
    {
        return "Name: " + name + "\n" + "Price: " + price + "\n" + "Quanity: " + quanity;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuanity()
    {
        return quanity;
    }
}