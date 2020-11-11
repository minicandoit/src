package day27_ForEachLoop;

public class ReverseString {
    public static void main(String[] args) {

        String[]names={"Mini","Mi","Christin","Sophia","Selah"};
        for(String eachName:names){
            String reversedName="";//if it;s starting from the last index can't use
       for(int i=eachName.length()-1;i>=0;i--){
           reversedName+=eachName.charAt(i);
       }
            System.out.println(reversedName);

        }


    }
}
