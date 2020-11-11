package day14_Switch_Recap;

public class Test {
    public static void main(String[] args) {

        int x=10;
        int y=x++;
        System.out.println(y++ + " "+ x++ +" "+y);
        System.out.println(x);
        System.out.println(y);

        System.out.println("=============================");
        int score=0;
        if(score==0){
            score+=50;//score=50
        }if(score!=0){//50!=0==>true
            score+=50;//50+50=100
        }//
        System.out.println(score);


    }
}
