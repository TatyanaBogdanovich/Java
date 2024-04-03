package Homework7.Shape;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        Shape[] array = new Shape[5];
        for (int i = 0; i < 5; i++) {
            System.out.println ("Выберите значение фигуры (1 - Прямоугольник, 2 - Квадрат, 3 - Круг):");
            int type = scanner.nextInt ();
            if (type == 1) {
                System.out.print ("Введите высоту прямоугольника: ");
                double height = scanner.nextDouble ();
                System.out.print ("Введите ширину прямоугольника: ");
                double width = scanner.nextDouble ();
                array[i] = new Rectangle (height, width);
            } else if (type == 2) {
                System.out.print ("Введите значение стороны квадрата: ");
                double side = scanner.nextDouble ();
                array[i] = new Square (side);
            } else if (type == 3) {
                System.out.print ("Введите значение радиуса круга: ");
                double radius = scanner.nextDouble ();
                array[i] = new Circle (radius);
            }
        }
        double totalPerimeter = 0.0;
        for (Shape shapes : array) {
            totalPerimeter += shapes.calculatePerimeter ();
        }
        System.out.println ("Сумма периметров всех фигур в массиве: " + totalPerimeter);
    }
}
