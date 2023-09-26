public interface GeometricShape {
    void describe();
}

public interface TwoDShape extends GeometricShape {
    double area();
}

public interface ThreeDShape extends GeometricShape {
    double volume();
}

public class Cone implements ThreeDShape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public void describe() {
        System.out.println("Cone - Radius: " + radius + " units, Height: " + height + " units");
    }
}

public class Rectangle implements TwoDShape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public void describe() {
        System.out.println("Rectangle - Width: " + width + " units, Height: " + height + " units");
    }
}

public class Sphere implements ThreeDShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public void describe() {
        System.out.println("Sphere - Radius: " + radius + " units");
    }
}

public class TestGeometricShapes {
    public static void main(String[] args) {
        GeometricShape[] shapes = new GeometricShape[3];
        shapes[0] = new Cone(5.0, 10.0);
        shapes[1] = new Rectangle(8.0, 6.0);
        shapes[2] = new Sphere(4.0);

        for (GeometricShape shape : shapes) {
            shape.describe();
            if (shape instanceof TwoDShape) {
                TwoDShape twoDShape = (TwoDShape) shape;
                System.out.println("Area: " + twoDShape.area() + " square units");
            }
            if (shape instanceof ThreeDShape) {
                ThreeDShape threeDShape = (ThreeDShape) shape;
                System.out.println("Volume: " + threeDShape.volume() + " cubic units");
            }
            System.out.println();
        }
    }
}
