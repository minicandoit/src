package Office_Hours.Practice_12_09_2020;

public class StudentObjects {

    public static void main(String[] args) {

        CybertekStudent student1=new CybertekStudent();
        student1.setInfo("mini",39,'F');
      //  student1.schoolName="MIT";==>warning sign
        CybertekStudent.schoolName="MIT";//preferred way
        //static call from the class


        CybertekStudent student2=new CybertekStudent();
        student2.setInfo("ELizabeth",11,'F');

        System.out.println(student1);
        System.out.println(student2);








    }



}
