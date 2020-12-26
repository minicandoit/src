package library;

import day43_Inheritance.PersonTask.Employee;

public class BA extends Employee {
    public static void main(String[] args) {
        System.out.println(BA.publicVariable);
        System.out.println(BA.protectedVariable);
      //  System.out.println(BA.defaultVariable);
       //outside of package default is not reachable



    }
}

class A{//not a subclass it can't reach to the subclass for the protected
    public static void main(String[] args) {
        System.out.println(BA.publicVariable);
       // System.out.println(BA.protectedVariable);
        //protected==>outside the package only visible to the subclass
    }//default: outside the package,never
    //public: always

}