package Office_Hours.Practice_12_23_2020;

public class Tester extends Employee{
   //subclass has to call the parent constructor

    public final static boolean isCool;

    static{
        isCool=true;
    }
    public Tester(String name, String jobTitle, String ID, char gender, double salary, boolean isFullTime) {
        super(name, jobTitle, ID, gender, salary, isFullTime);//control space
        //you have to call the parent constructor
    }


    //why can't inherit the constructor
  //  public Employee () can't have it
    //initialize the constructor call in inside only constructor

    public void foundBug(){
        System.out.println(jobTitle+" "+name+" found a Bug.");
    }

}
