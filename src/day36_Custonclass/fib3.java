package day36_Custonclass;

public class fib3 {
    public static void main(String[] args) {
       int num=8;
       String result="";
        int sum=0;
        int j=0,z=1;

        for(int i=1;i<num;i++){

            sum=j+z;//0+1==>j=0,  z=1==>j=1,  z=1==>j=1,z=2
            j=z;//j=1==>j=1==>j=2
            z=sum;//z=1==>z=2==>z=3
            result+=""+j+" ";
        }
        System.out.println(""+" 0"+ result);
    }
}
