abstract class Shape
{
    String color;
    Boolean filled;

    public Shape(String color, Boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public Shape() { }

    String getColor()
    {
        return color;
    }

    void setColor(String color)
    {
        this.color = color;
    }

    Boolean isFilled()
    {
        return filled;
    }

    void setFilled(Boolean isFilled)
    {
        filled = isFilled;
    }

    abstract double getArea();
    abstract double getPerimeter();
}

class Circle extends Shape
{
    double radius;

    public Circle() { }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean isFilled)
    {
        this.radius = radius;
        super.color = color;
        super.filled = isFilled;
    }

    @Override
    double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return String.format("Circle:\nS=%f\nP=%f\nColor=%s\nIsFilled?=%s",
                getArea(), getPerimeter(), getColor(), isFilled());
    }
}

class Rectangle extends Shape
{
    double width;
    double length;

    public Rectangle() { }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean isFilled)
    {
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = isFilled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString()
    {
        return String.format("Rectangle:\nS=%f\nP=%f\nColor=%s\nIsFilled?=%s",
                getArea(), getPerimeter(), getColor(), isFilled());
    }
}

class Square extends Rectangle
{
    public Square() { }

    public Square(double side)
    {
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled)
    {
        width = side;
        length = side;

        super.color  = color;
        super.filled = filled;
    }

    public void setSide(double side)
    {
        width = side;
        length = side;
    }

    public double getSide()
    {
        return width;
    }

    @Override
    double getArea() {
        return super.getArea();
    }

    @Override
    public void setLength(double length) {
        super.width = length;
        super.length = length;
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
        super.length = width;
    }

    @Override
    public String toString() {
        return String.format("Square:\nS=%f\nP=%f\nColor=%s\nIsFilled?=%s",
                getArea(), getPerimeter(), getColor(), isFilled());
    }
}
