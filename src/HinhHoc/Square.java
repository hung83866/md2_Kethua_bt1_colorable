package HinhHoc;

import Colorable.Colorable;

public class Square extends Shape11 implements Colorable {
    private double height;
    private double widght;

    public Square() {
    }

    public Square(double height, double widght) {
        this.height = height;
        this.widght = widght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidght() {
        return widght;
    }

    public void setWidght(double widght) {
        this.widght = widght;
    }

    public double area(){
        return this.getHeight()*this.getWidght();
    }

    @Override
    public String howToColor() {
        return "tô màu cả 4 mặt!";
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", widght=" + widght +
                ",area = "+this.area()+
                '}';
    }
}
