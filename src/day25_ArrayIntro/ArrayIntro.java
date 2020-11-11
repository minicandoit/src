package day25_ArrayIntro;

public class ArrayIntro {
    public static void main(String[] args) {

       // String names="cybertek","Muhtar"; error
        /*
        String name1="Azad";
        String name2="Ayse";
        String name3="Inna";
        String name4="Erjon";
        String name5="Aysel";

         */
        String[] names={"Azad","Ayse","Inna","Erjon","Aysel","mini","sue","hannah","daniel" };
        //index num:     0       1      2      3       4       5       6     7       8

        //retrieve data from array
        System.out.println(names[2]);//Inna
        String str1=names[0];
        System.out.println(str1);
//you are allowed to retrieve them from the array

        int [] score={80,85,90,70,75,77,87,97,88};
        //   index:   0  1  2  3  4  5  6  7  8

        /*
        //Erjon:70
        System.out.println(names[0]+" : "+score[0]);
        System.out.println(names[1]+" : "+score[1]);
        System.out.println(names[2]+" : "+score[2]);
        System.out.println(names[3]+" : "+score[3]);
        System.out.println(names[4]+" : "+score[4]);
        */

        System.out.println("================================");
             //i<9 is same with i<=9-1
        for(int i=0;i<=8;i++){//i represents index number i: 0,1,2,3,4,5,6,7,8
           // for(int i=0;i<=name.length-1;i++)
            //for(int i=0;i<name.length;i++)==same
            System.out.println(names[i]+" : "+score[i]);//increasing by index number

        }






    }
}
