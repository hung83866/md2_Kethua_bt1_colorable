package com.company;

import Colorable.Colorable;
import HinhHoc.Circle;
import HinhHoc.Shape11;
import HinhHoc.Square;
import HinhHoc.Triangle;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape11[] shape11 = new Shape11[4];
        shape11[0] = new Circle(4.6);
        shape11[1] = new Triangle(2,4,6);
        shape11[2] = new Square(3.4,6.5);
        shape11[3] = new Square(5,87);

        for (Shape11 s1: shape11) {
            System.out.println(s1);
            if (s1 instanceof Colorable){
                System.out.println(((Colorable) s1).howToColor());
            }
        }
    }

}
