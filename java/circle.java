class Circle {
double radius;

```
// Method to display area
void calculateArea() {
    double area = Math.PI * radius * radius;
    System.out.println("Area of Circle: " + area);
}

// Method to calculate and display circumference
void calculateCircumference() {
    double circumference = 2 * Math.PI * radius;
    System.out.println("Circumference of Circle: " + circumference);
}

public static void main(String[] args) {
    Circle c = new Circle();

    c.radius = 5;

    System.out.println("Radius: " + c.radius);
    c.calculateArea();
    c.calculateCircumference();
}
```

}
