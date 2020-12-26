package day43_Inheritance.RestautantTask;

import day43_Inheritance.PersonTask.Employee;

public class Server extends Employee {
 /*
inherited:
    variables: name, age, gender, hourlyRate, jobTitle, ID
    methods: work, setInfo, setInfo, toString, eat, sleep,calSalary()
 */

    public Server(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){//constructor
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }//constructor==>to create objects

    public void takeOrder(){
        System.out.println(jobTitle+" "+name+" is taking order");
    }
    public void cleanTable(){
        System.out.println(jobTitle+" "+" is cleaning a table");
    }

}
