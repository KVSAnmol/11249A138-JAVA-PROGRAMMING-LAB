import mypackage.Calculator;

public class PackageDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Addition: " + c.add(10, 20));
        System.out.println("Subtraction: " + c.subtract(20, 10));
    }
}