package Practices;
class Animal {
    void makeSound() {
        System.out.println("Animal making a sound...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barking...");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("cat moewing");
    }
}
public class Polymorphisim {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.makeSound();
        a=new Cat();
        a.makeSound();




    }
}
