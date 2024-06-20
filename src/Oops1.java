class Animal {
    public void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("A dog bark");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("A cat meow");
    }
}

public class Oops1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();
        Animal a = new Cat();
        a.sound();
    }
}