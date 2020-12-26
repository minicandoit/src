package day36_Custonclass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name,jobTitle,ID,companyName;
    public double salary;
    public LocalDate hireDate;
    public char gender;

    public void setInfo(String name,char gender,String jobTitle,String companyName,double salary,String ID,LocalDate hireDate) {//local variable is preffered inside the method
        this.name = name;//when instance name and local variable is the same
        this.gender = gender;//
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.ID = ID;
        this.hireDate = hireDate;
    }

       public void getInfo(){
           DateTimeFormatter df=DateTimeFormatter.ofPattern("MMM-dd_yyyy");
           DecimalFormat decimal=new DecimalFormat("0.00");
           System.out.println("name: "+name+", Gender: "+gender+", ID: "+ID+", company Name: "+companyName+", Job Title: "+jobTitle+", salary: $"+salary+", Hired Date: "+hireDate);
       }

       public void working(){
           System.out.println(name+" is working");
       }

       public void meeting(){
           System.out.println(name+" is in a meeting");
       }




    }








