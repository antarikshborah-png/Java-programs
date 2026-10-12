```java
class BillGenerator {

    void bill(int price, int quantity) {
        System.out.println("Total Bill = " + (price * quantity));
    }

    void bill(double price, double quantity) {
        System.out.println("Total Bill = " + (price * quantity));
    }

    public static void main(String[] args) {
        BillGenerator b = new BillGenerator();

        b.bill(100, 3);
        b.bill(99.50, 2.5);
    }
}
```
