package day40_Constructor;

public class ConstructorCall2 {

    public ConstructorCall2(){
       // this();//it's calling itself so error
     //   this(10);//also calling itself
        //constructor body can not contain itself
    }
    public ConstructorCall2(int a){
        this();//calling default
    }


}
