package Homework7.Shape;
public class Circle extends Shape {
    private double radius;
    public Circle (double radius) {
        this.radius = radius;
    }
    @Override
    public double square() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return  2 * Math.PI * radius;
    }
  }