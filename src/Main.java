import models.Circle;
import models.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.printcirculo();

        Circle circle1 = new Circle(20);
        circle1.printcirculo();

        Circle circle2 = new Circle();

        Rectangle rectangle = new Rectangle();
        rectangle.printRectangle();

        Rectangle rectangle1 = new Rectangle();
        rectangle1.printRectangulo();





    }
}