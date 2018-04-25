public class Square extends Rectangle implements Comparable
{
    public int side1, side2;
    public double area, perimeter;
    public String name;
    public Square(int s1, int s2, double a, double p, String n)
    {
        super(s1, s2, a, p, n);
    }
    public double calcArea()
    {
        area = (side1)*(side1);
        return area;
    }
    public double calcPerimeter()
    {
        perimeter = (side1)*(4);
        return perimeter;
    }
    public String toString()
    {
        return "This square (" + name + ") has a side length of " + side1 + ". It's perimeter and area are therefore " + perimeter + " and " + area + ", respectively.";
    }
}