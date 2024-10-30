package models;

import java.util.Date;

public class Rectangle extends Geometricobject  {
    private double wight;
    private double heigth;


    public Rectangle(String color, boolean filled, Date dateCreated, double wight) {
        super(color, filled, dateCreated);
        this.wight = wight;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getArea(){
        return getHeigth() * getWight();
    }

    public double getPerimeter(){
        return 2*(getWight() + getHeigth());
    }

    public void printRectangulo(){
        System.out.println("el color del rectangulo es = " + getColor());
        System.out.println("el area del rectangulo es = " + getArea());
        System.out.println("el perimetro de rectangulo es = " + getPerimeter());
    }
}
