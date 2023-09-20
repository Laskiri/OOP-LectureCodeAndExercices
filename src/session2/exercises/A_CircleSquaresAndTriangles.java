package session2.exercises;

class Circle {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    double circumference() {
        return 2 * this.radius * Math.PI;
    }

    double area() {
        return this.radius * this.radius * Math.PI;
    }

}

class Square {
    double width;

    Square(double w) {
        this.width = w;
    }

    double circumference() {
        return 4 * this.width;
    }

    double area() {
        return this.width * this.width;
    }
}

class Rectangle {
    double height;
    double width;

    Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }

    double circumference() {
        return 2 * (this.height + this.width);
    }

    double area() {
        return this.height * this.width;
    }

}



public class A_CircleSquaresAndTriangles {

    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.println("Circle with radius: " + c1.radius + " has circumference: " +
                c1.circumference() + " and area: " + c1.area());
        Square s1 = new Square( 5);
        System.out.println("Square with width: " + s1.width + " has circumference: " +
                s1.circumference() + " and area: " + s1.area());
        Rectangle r1 = new Rectangle(3, 4);
        System.out.println("Rectangle with height: " + r1.height + " and width: " + r1.width + " has circumference: " +
                r1.circumference() + " and area: " + r1.area());

    }
}
