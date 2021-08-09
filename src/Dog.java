/**
 * this is a class to create a dog object related to real life dogs
**/
public class Dog implements EdibleFood
{
    private String breed;
    private int age;
    private String color;
    private String dogType;

    public Dog(String breed, int age, String color, String dogType) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.dogType = dogType;
    }

    public void bark() {
        System.out.println("bow wow");
    }


    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("bow wow");

        }
    }

    @Override
    public void setFoodList() {

    }

    @Override
    public void selectFood(String Food) {

    }
}

