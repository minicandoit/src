package day40_Constructor;

public class ConstructorCall {

    public ConstructorCall(){
        System.out.println("Default constructor");

    }
    public ConstructorCall(int a){//default , int
        //constructor can be overloaded
       //ConstructorCall;//need special keyword to call ConstructorCall in the same ConstructorCall
      //constructor cannot be called by constructor name. we need this() keyword
       this();//calling the default constructor
        System.out.println("Constructor with int arg");
    }

    public ConstructorCall(String str){//dfault, int ,string
        this(10);//default ,int
    //    this();==>only one can be called in the constructor
        System.out.println("Constructor with String arg");
      //  this(10);//if you call the constructor,constructor call MUST be at first step
    }

    public static void main(String[] args) {
       ConstructorCall obj1=new ConstructorCall("A");
    }



    public void method4(){
        //   ConstructorCall;
    }

    public  static void method1(){
        System.out.println("Method 1");
    }
    public  static void method2(){
        method1();
        System.out.println("Method 2");
    }

    public  static void method3(){
        method1();
        method2();//can call as many as method you want
        System.out.println("Method 3");
    }

}