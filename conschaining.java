class Animal {
    String name;

    Animal() {
        this("Unknown");
    }

    Animal(String name) {
        this.name = name;
        System.out.println("Animal name: " + name);
    }
}

public class conschaining {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Lion");
    }
}
