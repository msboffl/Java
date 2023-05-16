package inheritance;

class Animal {
    public void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is Barking");
    }
}

class BabyDog extends Dog {
    public void babydog() {
        System.out.println("Baby Dog");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        obj.babydog();
        obj.bark();
        obj.eat();
    }
}
