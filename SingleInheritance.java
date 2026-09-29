class SingleAnimal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class SingleDog extends SingleAnimal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        SingleDog d = new SingleDog();
        d.eat();
        d.bark();
    }
}