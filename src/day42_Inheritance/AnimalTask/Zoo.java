package day42_Inheritance.AnimalTask;

public class Zoo {//Zoo has a Tiger

    public static void main(String[] args) {
        Tiger tiger =new Tiger("Sher Khan","Bengal Tiger",'M',5,"Orange","large");


        System.out.println(tiger);


   tiger.eat("Chicken");
         // tiger.meow(); only for subclass use only
          //tiger.bark();
   tiger.roar();
   tiger.hunt();

   Cat cat=new Cat("Kitty","British fold",'F',1,"White","Small");
        System.out.println(cat);
        cat.eat("Tuna");
        cat.drink("milk");
        cat.sleep();
        cat.meow();

        Dog dog = new Dog("Nina","American bull dog",'F',2,"White and brown","Big");
        System.out.println(dog);
        dog.eat("Chicken");
        dog.drink("water");
        dog.sleep();
        dog.bark();
        //to string method implicitly done by the compiler





    }

}
