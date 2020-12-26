package Office_Hours.Practice_11_25_2020;

public class MethodPractice2 {
    public static void main(String[] args) {
        max(100,200);//after return type doesn't work by itself

        System.out.println( max(100,200)*2);//400
        System.out.println(max(100,200,300));//300
        System.out.println(max(100,200,300,400));//400
        System.out.println(max(2.5,3.5));

    }

   public static int max(int a,int b){
        int maximum=(a>=b)?a:b;
        return maximum;
    }

    public static double max(double a, double b){
        return(a>=b)?a:b;
    }

    public static int max(int a, int b, int c){

       return max(max(a,b),c);

    }

    public static int max(int a, int b, int c, int d){
        return max(max(a,b,c),d);
    }

}
