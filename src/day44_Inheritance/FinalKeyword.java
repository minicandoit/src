package day44_Inheritance;


class Q{

    public final void method(){
        System.out.println("Method A");
    }

    public final void method(int a){//giving some different parameter overloading possible
        System.out.println("Method A"+ a);
    }


}


public class FinalKeyword {

/*
    @Override
    public void method(){
        System.out.println("Method B");   // final methods cannot be overriden
    }
*/


    public final static int z = 200 ;

    public final static void main(String[] args) {
//main method contatin static so can't  override
        System.out.println(z); // 0
        //  z = 300; cannot be re-assigned

    }

}



class Z {


}
/*
 //without the subclass no way to override
    public final static int z=200;//final does not have default value
//public final static int z;==>error you have to initialize it
    public final static void main(String[] args) {
        System.out.println(z);
      //  z=300; you can't be reassign it
    }
 */