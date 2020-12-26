package day40_Constructor;

public class Employee {
    public String name,jopTitle,ID;
    public double salary;

    public Employee(String name){//A

        this.name=name;
    }
    public Employee(String name,String jopTitle){//B:A
       this(name);// this.name=name; constructor call has priority so first step
        this.jopTitle=jopTitle;
    }

    public Employee(String name, String jopTitle, String ID) {//C:B ,A
      this(name,jopTitle); // this.name = name;
      // this.jopTitle = jopTitle;
        this.ID = ID;
    }

    public Employee(String name, String jopTitle, String ID,double salary){//D: C,B,A
        this(name, jopTitle, ID);
        this.salary=salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jopTitle='" + jopTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
 1. class Name: Employee
            instance variables:
                    name, jobTitle, ID, salary
            1st constructor: initialize the name of the employee
            2d constructor: initialize the name, jobTitle of the employee
                            (MUST apply constructor Call)
            3rd Constructor: initialize the name, jobTitle, ID of the employee
                            (MUST apply constructor Call)
            4th Constructor: initialize all the instance of the employee
                                (MUST apply constructor Call)
            Instance methods:
                toString()

 */