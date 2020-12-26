package day43_Inheritance.RestautantTask;

import day43_Inheritance.PersonTask.Employee;

public class Chef extends Employee {//is a relation, chef is an Employee,chef is a person


    /*
inherited:
    variables: name, age, gender, hourlyRate, jobTitle, ID
    methods: work, setInfo, setInfo, toString, eat, sleep
 */

    public Chef(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }
    public void makeOrder(){
        System.out.println(jobTitle+" "+name+" is making order");
    }
    public void cooking(){
        System.out.println(jobTitle+" "+name+" is cooking");
    }
}
