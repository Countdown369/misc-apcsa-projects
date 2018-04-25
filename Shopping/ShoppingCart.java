import java.util.*;
public class ShoppingCart
{
    private ArrayList<Item> cart;
    private int itemCount, capacity;
    private double totalPrice; 
    public ShoppingCart()
    {
        cart = new ArrayList<Item>();
    }

    public ArrayList<Item> getCart()
    {
        return cart;
    }

    public void increaseSize()
    {
        capacity += 3;
    }

    public void addToCart(String n, double p, int q)
    {
        cart.add(new Item(n, p, q));
        totalPrice += (p * q);
    }
    
    public double getTotalPrice()
    {
        return totalPrice;
    }

    public String toString()
    {
        String items = "";
        for (int i = 0; i < cart.size(); i++)
        {
            items = items + cart.get(i).getName() + "\t" + cart.get(i).getPrice() + "\t" + cart.get(i).getQuanity() + "\t"
            + (cart.get(i).getPrice() * cart.get(i).getQuanity()) + "\n";
        }
        return "\t" + "\t" + "Shopping Cart" + "\n" + "Item" + "\t" + "Price" + "\t" + "Quanity" +"\t" + "Total" + "\n" + items + 
        "\n" + "\n" + "Total Price of Cart: $" + totalPrice;

    }
}