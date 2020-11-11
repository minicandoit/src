package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

       /*
       Scrum team
       Testers:{"Dorin","Adil","Fatih","Subhi"}
       Developers: {"Kastrinsi","Mustafa","Rsulan"}
       SM:{"Ayse"}
       PO:{"Omid"}
       BA:{"Agalar"}

        */

     String[][] scrumTeam={
             {"Dorin","Adil","Fatih","Subhi"},
             {"Kastrinsi","Mustafa","Rsulan"},
             {"Ayse"},
             {"Omid"},
             {"Agalar"}
     };

        System.out.println(Arrays.deepToString(scrumTeam));

        for(int i=0;i< scrumTeam.length;i++){//i=index of 1D arrays
            System.out.println(Arrays.toString(scrumTeam[i]));//each group in sc team
        for(int j=0;j<scrumTeam[i].length;j++){//j==index num of elements
           // System.out.println(Arrays.deepToString(scrumTeam[i][j]));==>error
            System.out.println((scrumTeam[i][j]));
        }
        }

        System.out.println("==================================================");
        for(String[] eachGroup :scrumTeam){//eachGroup: represents each 1D array in scrum team
            System.out.println(Arrays.toString(eachGroup));

       for(String eachName:eachGroup){
           System.out.println(eachName);
       }


        }










    }
}
