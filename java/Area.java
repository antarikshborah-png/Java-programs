class Area {

    void calculate(double side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void calculate(double length, double breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void calculate(float radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Area a = new Area();

        a.calculate(5.0);       // Square
        a.calculate(10.0, 5.0); // Rectangle
        a.calculate(7.0f);      // Circle
    }
}
```
