package library;

import day41_Encapsulation.Data;
import day43_Inheritance.AccessModifier;

import static day41_Encapsulation.Data.*;

public class Test extends AccessModifier {

    public static void main(String[] args) {

        System.out.println(Data.publicVariable);
        //   System.out.println(privateVariable);
        //    System.out.println(defaultVariable);

        //  Data obj1 = new Data();//outside package unreachable

        publicMethod();
        //  privateMethod();
        //  defaultMethod();




    }

}
