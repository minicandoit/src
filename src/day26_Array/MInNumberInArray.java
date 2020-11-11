package day26_Array;

public class MInNumberInArray {
    public static void main(String[] args) {

        int[] number={300,100,400,50,500,150,170};
        int min=number[0];
        for(int i=0;i<number.length-1;i++){

            if(number[i]<min){
                min=number[i];
            }
        }

        System.out.println("min ="+min);




    }
}
