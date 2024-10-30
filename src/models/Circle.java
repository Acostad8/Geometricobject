package models;

import java.util.Date;
import java.util.Map;

public class Circle extends Geometricobject {
    private double radius;

    public Circle(String color, boolean filled, Date dateCreated, double radius) {
        super(color, filled, dateCreated);
        this.radius = radius;
    }

    public Circle() {
        
    }

    public Circle(int i) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    public double getDiametro(){
        return  2 * getRadius();

    }

    public void printCircle(){
        System.out.println("el color de circulo es =  " + getColor());
        System.out.println("el area de circulo es = " + getArea());
        System.out.println("el perimetro de circulo es = " + getPerimeter());
        System.out.println("el diametro de ciculo es = " + getDiametro());
    }
    
    
    public void printcirculo(){
        System.out.println("circle");
        System.out.println(super.toString());
        System.out.println("{" +
                "radius" + radius +
                ", Area " + getArea() + 
                "perimetro " + getPerimeter() + 
                "diametro " + getDiametro()
        );
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
