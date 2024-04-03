package Homework7.Shape;
public class Rectangle extends Shape {
    protected final double height;
    protected final double width;
    public Rectangle (double height, double width) {

        this.height = height;
        this.width = width;
    }
    @Override
    public double square () {
        return height * width;
    }
    @Override
    public double calculatePerimeter () {
        return 2 * (height + width);
    }
}

