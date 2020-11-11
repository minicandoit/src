package day26_Array;

public class frequencyOfWord {
    public static void main(String[] args) {

      String sentence="I love java, java is cool programming and java is more useful than javascript,python python";
        String[] arr=sentence.split(" ");
       int countJava=0;
       int countPython=0;
        for(int i=0;i<arr.length;i++){//for loop is more prefered
            String eachWord=arr[i];
            if(arr[i].toLowerCase().contains("java")){
                countJava++;
            }
            if(arr[i].toLowerCase().contains("python")){
                countPython++;

                /*
                if(eachWord.toLowerCase().contains("python")){
                countPython++;==>same
                 */
            }
        }

        System.out.println("java: "+countJava);
        System.out.println("phthon: "+countPython);





    }
}
