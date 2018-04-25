import java.util.*;
public class ShoppingSim
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        ShoppingCart s1 =  new ShoppingCart();
        for (int i = 0; i < 0.5; i++)
        {
            s1.increaseSize();
            System.out.println("What do you want?");
            String want = k.nextLine();
            System.out.println("What does it cost, in dollars?");
            double cost = k.nextDouble();
            System.out.println("How many do you want?");
            int quant = k.nextInt();
            s1.addToCart(want, cost, quant);
            System.out.println(s1.toString());
            System.out.println("Want to continue? Yes / No");
            String cont = k.nextLine();
            if (cont.equals("Yes"))
            {
                i = -1;
            }
            cont = k.nextLine();
            if (cont.equals("Yes"))
            {
                i = -1;
            }
        }
        System.out.println("Please pay: $" + s1.getTotalPrice());
    }
}