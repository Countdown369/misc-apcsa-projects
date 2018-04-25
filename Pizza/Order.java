import java.util.*;
public class Order
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        ArrayList <Pizza> orders = new ArrayList <Pizza>();
        for (int i = 0; i < 1; i++)
        {
            System.out.println("Would you like to order a pizza? yes(1) or no(2)");
            int answer = k.nextInt();
            int numTops = 0;
            String size = "";
            String[] toppings;
            String answers = "";
            if (answer == 1)
            {
                System.out.println("Would you like to order a regular pizza(1) or a specialty pizza(2)?");
                answer = k.nextInt();
                if (answer == 1)
                {
                    System.out.println("A medium(1) or large(2)?");
                    answer = k.nextInt();
                    if (answer == 1)
                    size = "Medium";
                    else
                    size = "Large";
                    System.out.println("How many toppings?");
                    answer = k.nextInt();
                    if (answer > 0)
                    {
                        System.out.println("What topping(s) would you like?");
                        String topping1 = k.nextLine();
                        if (answer == 2)
                        {
                            String topping2 = k.nextLine();
                            if (answer == 3)
                            {
                                String topping3 = k.nextLine();
                                if (answer == 4)
                                {
                                    String topping4 = k.nextLine();
                                }
                            }
                        }
                    }
                }
                else
                {
                    System.out.println("What type of specialty pizza? We have Spinach Alfredo, Hawaiian BBQ Chicken, and Spicy Italian.");
                    String reply = k.nextLine();
                    if (reply.equals("Spinach Alfredo"))
                    {
                        numTops = 1;
                        size = "Large";
                        toppings = new String[]{"Spinach"};
                    }
                    else if(reply.equals("Hawaiian BBQ Chicken"))
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
                    k.nextLine();
                    System.out.println("Would you like any additional toppings? yes(1) or no(2)");
                    int wtf = k.nextInt();
                    if (wtf == 1)
                    {
                        System.out.println("How many toppings?");
                        answer = k.nextInt();
                        numTops = numTops + answer;
                        System.out.println("What Toppings?");
                        for (int m = 0; m < answer; m++)
                        answers = k.nextLine();
                    }
                }
                orders.add(new Pizza(numTops, size, new String[]{"Pineapple", "Sausage"}));
                System.out.println("Would you like to order another pizza? yes(1) or no(2)");
                answer = k.nextInt();
                if (answer == 1)
                i--;
            }
            else
            {
                System.out.println("Thank you for coming to our pizza parlor.");
            }
        }
        if ((orders.size()) > 0)
        {
            System.out.println((orders.get((orders.size()-1))).toString());
        }
    }
}