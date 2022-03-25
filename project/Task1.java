package group.project;

public class Task1 {
    /*Create an Interface 'Shape' with undefined methods as calculateArea and calculate Perimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code*/
}
interface Shape{
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle : "+  area);
    }
    @Override
    public void calculatePerimeter() {
double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter of circle : "+perimeter);
    }
}
class Square implements Shape{
    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area=width*width;
        System.out.println("Area of square : "+area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter=4*width;
        System.out.println("Perimeter of square : "+perimeter);
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape c= new Circle(3.5);
        c.calculateArea();
        c.calculatePerimeter();
        Shape s=new Square(8);
        s.calculateArea();
        s.calculatePerimeter();
    }
}