package interface_example;

public class Tree extends Plant implements Swimable {
    @Override
    public void swim() {
        System.out.println("Дерево держится на воде");
    }
}
