package net.rchronicler.liang_ch13;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = width * height;
        return area;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }

    @Override
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
