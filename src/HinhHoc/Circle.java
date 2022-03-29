package HinhHoc;

public class Circle extends Shape11 {
    private double radius = 1.0;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double area(){
        return PI*this.radius*this.radius;
    }
    public double perimeter(){
        return 2*PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ",radius=" + radius +
                ",area = "+this.area()+
                '}';
    }
}
