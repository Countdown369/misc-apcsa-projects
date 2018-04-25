import java.util.*;
import java.text.*;
public class Latin
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the size of the Latin Square. ");
        int size = k.nextInt();
        Latin sqone = new Latin(size);
        sqone.computeSquare();
        sqone.displaySquare();
    }
    private static int size;
    private static int[][] matrix;
    public Latin(int s)
    {
        size = s;
        matrix = new int[size][size];
    }
    public static void computeSquare()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix.length; col++)
            {
                if (row + col < matrix.length)
                {
                    matrix[row][col] = row + col + 1;
                }
                else
                {
                    matrix[row][col] = row + col + 1 - matrix.length;
                }
            }
        }
    }
    public static void displaySquare()
    {
        String hundo = "000";
        DecimalFormat hunds = new DecimalFormat(hundo);
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix.length; col++)
            {
                System.out.print(hunds.format(matrix[row][col]) + " ");
                if (col == matrix.length-1)
                {
                    System.out.println();
                }
            }
        }
    }
}