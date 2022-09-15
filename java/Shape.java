public abstract class Shape {

    private int width;
    private int height;

    public Shape(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    
    public abstract int perimeter();

    public abstract double area(); 

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    
}
