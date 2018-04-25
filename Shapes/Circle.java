public class Circle extends Shape implements Comparable
{
    public int radius;
    public double area, perimeter;
    public String name;
    public Circle(int r, double a, double p, String n)
    {
        radius = r;
        area = a;
        perimeter = p;
        name = n;
    }
    public double calcArea()
    {
        area = (radius)*(radius)*(3.14159265359);
        return area;
    }
    public double calcPerimeter()
    {
        perimeter = (2)*(radius)*(3.14159265359);
        return perimeter;
    }
    public String toString()
    {
        return "This circle (" + name + ") has a radius of " + radius + ". It's circumference and area are therefore " + perimeter + " and " + area + ", respectively.";
    }
}