import java.util.*;
public class Pizza
{
    protected int numTops;
    protected String size;
    protected String[] toppings;
    public Pizza(int n, String s, String[] t)
    {
        numTops = n;
        size = s;
        toppings = t;
    }
    
    public int getNumTops()
    {
        return numTops;
    }
    
    public String getSize()
    {
        return size;
    }
    
    public String getTops()
    {
        String temp = "";
        for (int i = 0; i < numTops; i++) 
        {
            temp = temp + toppings[i] + " ";
        }
        return temp + "\n";
    }
    
    public double calcCost()
    {
        double sum = 0;
        double sizeCost = 10.00;
        if (size.equals("Large"))
        sizeCost = 12.00;
        sum = sizeCost + ((double) numTops * .5);
        return sum;
    }
    
    public String toString()
    {
        return "# of Toppings: " + numTops + "\n" + "Size: " + size + "\n" + "Toppings: " + getTops() + "Price: $" + calcCost() + "0";
    }
}