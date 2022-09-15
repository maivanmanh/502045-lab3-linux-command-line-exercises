public class Square extends Shape{

    public Square(int side) {
        super(side, side);
    }

    public int perimeter()
    {
        return 2 *(getHeight() + getWidth());
    }

    public double area()
    {
        return getHeight() * getWidth();
    }

    public void setWidth(int width) {
        //this.width = width;
        //this.height = width;
        super.setWidth(width);
        super.setHeight(width);
    }

    public void setHeight(int height) {
        //this.height = height;
        //this.width = height;
        super.setHeight(height);
        super.setWidth(height);
    }
   
    @Override
    public String toString() {
        return "Square (" + getWidth() + ", perimeter=" + perimeter() + ", area=" + area() + ")";
    }
}
