package day40_Constructor;

public class ConstructorIntro {//constructor mandatory
    static int b;

    static{//staticBlock
        System.out.println("static block");
        b = 200;  // 1
    }

    public ConstructorIntro(int a){//constructor,is mandatory
        // if you don't make it compiler make it automatically without the parameter

        System.out.println("Constructor with int arg");
        b = 200;  //
        this.a = a;
    }

    int a ;//instance

    public static void main(String[] args) {
        System.out.println("Hello");
        // System.out.println(a);-->instance can't be accepted in static

        int num =   new ConstructorIntro(200).a; // a = 200
//Constructor with int arg
        ConstructorIntro obj2 = new ConstructorIntro(300); // a = 300
//Constructor with int arg
        ConstructorIntro obj3 = new ConstructorIntro(400); // 400
//Constructor with int arg

        //constructor executed whenever we create the objects

    }

}
