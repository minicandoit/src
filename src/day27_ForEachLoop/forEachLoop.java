package day27_ForEachLoop;

import com.sun.nio.sctp.PeerAddressChangeNotification;

public class forEachLoop {
    public static void main(String[] args) {

        String[]names={"Mii","Mini","Sam","Daniel","Elizabeth"};

        for(int i=0;i< names.length;i++){//i is the index number of array
            System.out.println(names[i]);
        }

        System.out.println("======================================");

        for( String each :names ){//each is the element
            System.out.println(each);
        }
        System.out.println("=========================================");
        int[]numbers={1,2,3,4,5,6,7,8,9,10,11,12};

        int countEvens=0;
        int countOdds=0;

        for(int each :numbers){//each is the element of the array
            if(each%2==0){
                countEvens++;
            }else{
                countOdds++;
            }
        }
        System.out.println("count Evens="+countEvens);
        System.out.println("count Odds="+countOdds);

        System.out.println("==========================================");

        int []scores={10,2,3,25,5,100,-5,-2,1000,30,40,56};
        int max=scores[0];
        int min=scores[0];

        for(int each:scores){
            if(each>max){
                max=each;

            }
            if(each<min){
                min=each;
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);










    }
}
