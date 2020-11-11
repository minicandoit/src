package Office_Hours.Practice_11_11_2020;

public class ArrayPractice2 {
    public static void main(String[] args) {

        String[] word={"Anna","Level","Lol","Donald","Biden","Amir","Agalar","Engin","Mariam"};

   int count=0;
   for(String each:word){
    char firstCharacter=each.toLowerCase().charAt(0);//A
    char lastCharacter=each.toLowerCase().charAt(each.length()-1);//a
      //in order to ignore the case sensitivity
       //equalsignorescase==>boolean ==>can't put chat at method
      if(firstCharacter==lastCharacter){
          count++;
      }

   }
        System.out.println(count);







    }
}
