//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name;
        int age;
        double weight;

        Human human = new Human("Rick",65,70);
        Human human2 = new Human("Rachel",34,67.8);

        human2.eat();
        human.drink();

    }
}