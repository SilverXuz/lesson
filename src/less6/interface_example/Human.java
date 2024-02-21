package interface_example;

public class Human extends Mammal implements Swimable{
    @Override
    public void swim() {
        System.out.println("Человек плывет");
    }
}
