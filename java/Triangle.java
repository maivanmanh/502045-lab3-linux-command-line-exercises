public class Triangle extends Shape
{
    private int side;

    public Triangle(int width, int height, int side)
    {
        super(width, height);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int perimeter()
    {
        return side + getHeight() + getWidth();
    }

    public double area()
    {
        double p = perimeter() * 1.0 / 2;
        return Math.sqrt(p * (p-side) * (p-getHeight()) * (p-getWidth()));
    }

    @Override
    public String toString() {
        return "Triangle (A=" + side + ",B=" + getWidth() + ",C=" + getHeight() + ", perimeter=" + perimeter() + ", area=" + area() + ")";
    }
    
    
}