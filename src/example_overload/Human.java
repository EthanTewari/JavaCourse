package example_overload;

public class Human extends Animal {
    @Override
    public void eat() {
        System.out.println("cook food");
        System.out.println("then eat food");
    }

    @Override
    public void sleep() {
        System.out.println("sleep during the day");
        super.sleep();
    }

    public static void main(String[] args) {
        Animal doggo= new Animal();
        Human Akash= new Human();
        System.out.println("The output of Animal");
        doggo.eat();
        doggo.sleep();
        System.out.println("The output of Human");
        Akash.sleep();
        Akash.eat();
    }
}