class Animal{
    void show(){
        System.out.println("Show from superclass");
    }
}
class Dog extends Animal{
    void show(){
        System.out.println("Show from subclass");
    }
}
public class overriding{
    public static void main(String[] args){
        Dog.d = new Dog();
        d.show();
    }
}