import java.util.*;
import java.text.*;
public class Fourbyfour
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter any number (try your age!): ");
        int age = k.nextInt();
        Fourbyfour partytrick = new Fourbyfour(age);
        partytrick.Compute();
        partytrick.Display();
    }
    private static int age;
    private static int mat[][] = new int[4][4];
    public Fourbyfour(int a)
    {
        age = a;
    }
    public static void Compute()
    {
        mat[2][0] = 5;
        mat[3][0] = 4;
        mat[0][1] = 1;
        mat[1][1] = 8;
        mat[2][2] = 3;
        mat[3][2] = 6;
        mat[0][3] = 7;
        mat[1][3] = 2;
        mat[3][3] = 9;
        mat[2][1] = 10;
        mat[1][0] = 11;
        mat[0][2] = 12;
        mat[1][2] = age-21;
        mat[0][0] = age-20;
        mat[3][1] = age-19;
        mat[2][3] = age-18;
    }
    public static void Display()
    {   
        String hundreds = "00";
        DecimalFormat hun = new DecimalFormat(hundreds);
        for (int row = 0; row < mat.length; row++)
        {
            for (int col = 0; col < mat.length; col++)
            {
                System.out.print(hun.format(mat[row][col]) + " ");
                if (col == mat.length-1)
                {
                    System.out.println();
                }
            }
        }
        System.out.println("Behold, a magic square! The individual rows, columns, diagonals, all four corners, and all square-shaped groups of four numbers within the above matrix add up to your number, " + age + ".");
    }
}