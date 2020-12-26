package day42_Inheritance.AnimalTask;

public class Cat extends Animal {


    public Cat(String name, String breed, char gender, int age, String color, String size) {

        setInfo(name, breed, gender, age, color, size);//control space at the sametime
    }

    public void meow() {
        System.out.println(name + " meowing");
    }


    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}