package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str="abab";//a,b,c,d

        String nonDup="";//"ab"
        //if the character is not exist in nondup, then we can concate it
//i<11 =10==>last index number,i<str.length();
        for(int i=0;i<=str.length()-1;i++){

           //char eachChar= str.charAt(i);
String eachChar=""+str.charAt(i);
            if(nonDup.contains(eachChar)) {//each of the character in str
          //  if(nonDup.contains(""+str.charAt(i))) {//if the character
                //is already contained in nondup
                continue;//skip it
            }else {
                nonDup+=str.charAt(i);
            }

          /*
            if(!nonDup.contains(""+str.charAt(i))){

           // if(nonDup.contains(str.charAt(i))){
                //only accept String data type not char

                nonDup+=str.charAt(i);

*/
            }


        System.out.println(nonDup);


    }
}
