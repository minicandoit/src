package day38_Statics;

public class Prime {
    public static void main(String[] args) {
        int num=3;
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){//2%i==0,3%2=1,4%2==0-->4%3==1
                isPrime=false;
            }
        }
        if(num==1){
            isPrime=false;
        }
        System.out.println(isPrime);
    }
}
