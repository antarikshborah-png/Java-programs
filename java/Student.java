class Student {

    void average(int a, int b) {
        System.out.println("Average = " + (a + b) / 2.0);
    }

    void average(int a, int b, int c) {
        System.out.println("Average = " + (a + b + c) / 3.0);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.average(80, 90);
        s.average(80, 90, 70);
    }
}
```
