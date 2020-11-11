package day22_javaRecap;

public class StringPractice3 {
    public static void main(String[] args) {


        String sentence= "Capital of Canada is Washington";
        sentence=sentence.replace("Canada","United States");
       //by assigning to sentence becomes to new object
        System.out.println(sentence);

        String s="Cybertek School is in Boston,cybertek Campus is in Mclean";

        s=s.replaceFirst("Cybertek","MIT");
        //only first cybertek replaced
       // s=s.replace("Cybertek","MIT");
        //all the Cybertek replaed to MIT
        System.out.println(s);

        String r="cava is cool programming language, I can learn cava at cybertek school";
        r=r.replace("cav","jav");//one more character
        // r=r.replace("ca","ja");  "can" will be error
                //r=r.replace('c','j');
                //all c becomes j
        System.out.println(r);

        String p="I like Java and Java Java Java Java Java Java";
       p=p.replaceFirst("Java","C#");
       p=p.replaceFirst("Java","java");
       p=p.replace("Java","");
        // p=p.replace("Java","").replace("like ","like java");
        System.out.println(p);


        System.out.println("=========================================");
//trim: removes white spaces only
        String str="                       ";
        System.out.println(str.length());

        str=str.trim();
        System.out.println(str.length());

        String str2="                     cybertek            school         ";
//space between words are not trimed
        str2=str.trim();
        System.out.println(str2);


        System.out.println("==========================================");
//contains, isEmpty,startsWith,endsWith

        String s2="I like to learn Java";
        System.out.println("Contains c#: "+ s2.toLowerCase().contains("java"));
      //equals different from cantains
        System.out.println(s2.equals("java"));//false
        System.out.println(s2.equalsIgnoreCase("java"));
        //false

        String s3="cybertek School is the best";
        System.out.println(s3.contains("cybertek"));//false
        System.out.println(s3.toLowerCase().contains("cybertek"));//true
        //because of ignore case sensitivity
        System.out.println(s3.equalsIgnoreCase("cybertek"));
        //fase
        System.out.println("Java".isEmpty());//false
        System.out.println("".isEmpty());//true
        System.out.println("==========================================");
//startsWith,endsWith

        String URL="http://www.amazon.com";//.com.gov.edu

        boolean isvalid=URL.startsWith("http")&&(URL.endsWith(".com")||URL.endsWith(".edu")||URL.endsWith("gov"));

        if(isvalid){
            System.out.println("URL is valid");
        }else{
            System.out.println("Invalid");
        }

/*
valid emails : gmail,hotmail,yahoo.outlook

 */
String email="Java_ Yahoo@java.com";
boolean vaildEmail=email.endsWith("gmail.com")||email.endsWith("yahoo.com")||email.endsWith("hotmail.com")
        ||email.endsWith("outlook.com");
if(vaildEmail){
    System.out.println("valid Email");
}else{
    System.out.println("Invalid Email");
}






    }
}
