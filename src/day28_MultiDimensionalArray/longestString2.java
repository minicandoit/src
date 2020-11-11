package day28_MultiDimensionalArray;

public class longestString2 {
    public static void main(String[] args) {
        String[]names={"Elizabeth","Christine","Apple","Pear","kiwi","Jehowahsh","mind"};
        int maxLength=names[0].length();
        int minLength= names[0].length();
        for(String each:names){
            if(each.length()>maxLength){//what is maximum length
                maxLength=each.length();
            }
            if(each.length()<minLength){
                minLength=each.length();
            }
        }

        System.out.println(maxLength);
        System.out.println(minLength);
//find out which Strings has the maximum length
        String longest="";
        String shortest="";
        for(String each:names){
            if(each.length()==maxLength){
              longest+=each+" ";
               // System.out.println(each);
            }
            if(each.length()==minLength){
              shortest+=each+" ";
                //System.out.println(each);
            }
        }
        System.out.println(longest);
        System.out.println(shortest);








    }
}
