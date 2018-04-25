public class Triangle extends Shape implements Comparable
{
    public int base, height, side2, side3;
    public double area, perimeter;
    public String name;
    public Triangle(int b, int h, int two, int three, double a, double p, String n)
    {
        base = b;
        height = h;
        side2 = two;
        side3 = three;
        area = a;
        perimeter = p;
        name = n;
    }
    public double calcArea()
    {
        area = (base)*(height)*(0.5);
        return area;
    }
    public double calcPerimeter()
    {
        perimeter = base + side2 + side3;
        return perimeter;
    }
    public String toString()
    {
        return "This triangle (" + name + ") has sides of length " + base + ", " + side2 + ", " + side3 + ". It's height is " + height + ". It's perimeter and area are therefore " + perimeter + " and " + area + ", respectively.";
    }
}

    