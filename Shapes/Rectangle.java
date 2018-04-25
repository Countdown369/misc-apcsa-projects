public abstract class Rectangle extends Shape implements Comparable
{
    public int side1, side2;
    public double area, perimeter;
    public String name;
    public Rectangle(int s1, int s2, double a, double p, String n)
    {
        side1 = s1;
        side2 = s2;
        area = a;
        perimeter = p;
        name = n;
    }
    public double calcArea()
    {
        area = (side1)*(side2);
        return area;
    }
    public double calcPerimeter()
    {
        perimeter = ((side1)*(2))+((side2)*(2));
        return perimeter;
    }
    public String toString()
    {
        return "This rectangle (" + name + ") has side lengths of " + side1 + " and " + side2 + ". It's perimeter and area are therefore " + perimeter + " and " + area + ", respectively.";
    }
}
