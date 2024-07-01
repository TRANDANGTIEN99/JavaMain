package D6;

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();

        Animal animal = new Animal();
        animal.makeSound();

        Animal doggy = dog;
        doggy.makeSound();

        ((Dog)doggy).bark();
    }
}
