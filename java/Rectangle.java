public class Rectangle extends Shape{
    public Rectangle(int width, int height)
    {
        super(width, height);
    }

    public int perimeter()
    {
        return 2 *(getHeight() + getWidth());
    }

    public double area()
    {
        return getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle (" + getWidth() + "x" + getHeight() + ", perimeter=" + perimeter() + ", area=" + area() + ")";
    }

    
}
