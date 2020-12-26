package day35_CustomClass;

import java.time.LocalDate;

public class Dog {

    public String nickName;
    public String breed;
    public String size;
    public char gender;
    public String color;
    public LocalDate DOB;
    public int age;
    //sets the instance variable of dog objects
    public void setInfo(String dogNickName,String dogBreed,String dogSize,char dodGender,String dogColor,LocalDate dogDOB) {
        nickName = dogNickName;
        breed = dogBreed;
        size = dogSize;
        gender = dodGender;
        color = dogColor;
        DOB = dogDOB;
        age=LocalDate.now().getYear()-DOB.getYear();
        //current year-birth year
    }

       //to print the info of the dog objects
       public void getInfo(){
            System.out.println("Name: "+nickName+", Breed: "+breed+", Gender: "+gender+", Color: "+color
            +",Size: "+size+",Age: "+age);
        }

        public void eat(String food) {
            System.out.println(nickName+" is eating "+food);
    }

    public void drinks(String drinks){
        System.out.println(nickName+" is drinking "+drinks);
    }





}
