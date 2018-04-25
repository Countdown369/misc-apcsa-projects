import java.util.*;
public class PizzaDriver
{
    public static void main(String[] args)
    {
        System.out.println();
        Pizza p1 = new Pizza(2, "Large", new String[]{"Pineapple", "Sausage"});
        System.out.println(p1.getNumTops());
        System.out.println(p1.getSize());
        System.out.println(p1.getTops());
        System.out.println(p1.calcCost());
        System.out.println(p1.toString());
        SpecialtyPizza sp1 = new SpecialtyPizza(2, "Large", new String[]{"Pineapple", "Sausage"}, "Hawaiian BBQ Chicken");
        System.out.println(sp1.getNumTops());
        System.out.println(sp1.getSize());
        System.out.println(sp1.getTops());
        System.out.println(sp1.calcCost());
        System.out.println(sp1.toString());
    }
}