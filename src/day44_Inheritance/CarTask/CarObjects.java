package day44_Inheritance.CarTask;

public class CarObjects {
    public static void main(String[] args) {
        Honda honda=new Honda("Civic","Red",23000,2019);
   honda.start();// implementation from Car since no overriding for honda
        System.out.println(honda);

        Mercedes mercedes=new Mercedes("E320","red",230000,2020);
        mercedes.start();
        System.out.println(mercedes);

        Jeep jeep=new Jeep("cherokee","Red",230000,2019);
        jeep.start();
        System.out.println(jeep);

        Tesla tesla=new Tesla("Model Y","white",34000,2020);

        tesla.start();
        System.out.println(tesla);





    }
}
