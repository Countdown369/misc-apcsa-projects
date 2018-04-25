public class SpecialtyPizza extends Pizza
{
    private String type;
    public SpecialtyPizza(int n, String s, String[] t, String ty)
    {
        super(n, s, t);
        type = ty;
        if (type.equals("Spinach Alfredo"))
        {
            numTops = 1;
            size = "Large";
            toppings = new String[]{"Spinach"};
        }
        else if(type.equals("Hawaiian BBQ Chicken"))
        {
            numTops = 3;
            size = "Large";
            toppings = new String[]{"Pineapple", "Ham", "Chicken"};
        }
        else
        {
            numTops = 2;
            size = "Large";
            toppings = new String[]{"Onions", "Pepperoni"};
        }
    }

    public double calcCost()
    {
        double cost = 0.0;
        if (type.equals("Spinach Alfredo"))
        {
            cost = 15.00;
        }
        else if(type.equals("Hawaiian BBQ Chicken"))
        {
            cost = 15.50;
        }
        else
        {
            cost = 14.00;
        } 
        return cost;
    }
}