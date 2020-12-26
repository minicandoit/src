package day44_Inheritance;

class A{
    public A(){
        System.out.println("A");
    }
}


class B extends A{

    public B(){
       // super(); implicitly done dont' need to call the constructor
        System.out.println("B");
    }
}





public class ConstructorCall extends B {

    public ConstructorCall(){
        //super();//A,AB
        System.out.println("C");
    }


    public static void main(String[] args) {
      //  new B();//AB
        new ConstructorCall();//C,AC ==>parent class is A
        //ABC==>parent class is B

        //subclass must call super class constructor
    }
}
