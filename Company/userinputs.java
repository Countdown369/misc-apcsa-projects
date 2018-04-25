import java.util.Scanner;
public class userinputs
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.println("How many people work at this company?");
        int x = k.nextInt();
        String[] salespeople = new String[x];
        int[] sales = new int[x];
        int totalsales = 0;
        System.out.println("List them all, with their sales in dollars first and their name second. Each should be entered in different lines.");
        for (int i = 0; i < sales.length; i++)
        {
            sales[i] = k.nextInt();
            salespeople[i] = k.next();
        }
        for (int i = 0; i < sales.length; i++)
        {
            totalsales = sales[i] + totalsales;
        }
        int avg = totalsales/x;
        System.out.println("Total sales: $" + totalsales + ", Average sales: $" + avg);
        int maxValue = sales[0];
        int minValue = sales[0];
        String bestEmployee = " ";
        String worstEmployee = " ";
        for (int i = 0; i < sales.length; i++)
        {
            if (sales[i] > maxValue)
            {
                maxValue = sales[i];
                bestEmployee = salespeople[i];     
            }
        }
        int temp = 0;
        for (int i = 0; i < salespeople.length; i++)
        {
            if (sales[i] < minValue)
            {
                minValue = sales[i];
                temp = i;
                worstEmployee = salespeople[i];
            }
        }
        //for (int i = 0; i < salespeople.length; i++)
        //{
        //    System.out.println(salespeople[i]);
        //}
        System.out.println(bestEmployee + " was the best in the company with $" + maxValue + " in sales, while " + salespeople[temp] + " was the worst with $" + minValue + " in sales.");
    }
}