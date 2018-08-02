package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

        double perimeter(double sideLength, double sideWidth) {
            System.out.println(2 * sideLength + 2 * sideWidth);
        }


        double area(int length, int width) {
            System.out.println(length * width);
        }

    }


}
