package day18_String;

public class StringMethods3 {
    public static void main(String[] args) {

       String sentence="Java is fun, Java is cool";
       sentence=sentence.replace("Java","Python");
       //without variable sentence=  it will print out "Java is fun, Java is cool"
       //"Python is fun, Python is cool"
        System.out.println(sentence);

        String email="CybertekSchool@gmail.com";

        email=email.replace("gmail","yahoo");
//assign as "email="
        System.out.println(email);

        String essay="Batch 20 is cool, Batch 20 is the best, Batch 20 students are awsome";
essay=essay.replace("20","21");
        System.out.println(essay);
        String s="I like to learn c#, c# is very cool";
        s=s.replace("c#","Java");
        System.out.println(s);

        String r="Cat is friendly, Cat is cute";
        r=r.replaceFirst("Cat","Dog");
        //Dog is friendly, Cat is cute
       // r=r.replace("Cat","Dog");
        System.out.println(r);

        String t="I like to learn Java, because Java is cool,Java is powerful";
        t=t.replaceFirst("Java is","Python is");
        System.out.println(t);
        //I like to learn Java, because Python is cool,Java is powerful
        t=t.replaceFirst("Java is powerful","C# is powerful");
        System.out.println(t);

        //I like to learn Java, because Python is cool, c# is powerful

String a="Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";

        a=a.replaceFirst("was Monday","was sunsday");


        a=a.replaceFirst("be Monday","be Tuesday");

        System.out.println(a);
        System.out.println("=================================");
String emailAddress="Cybertek_School@gmail.com";
int beginningIndex=emailAddress.indexOf("@")+1;
int endingIndex=emailAddress.indexOf(".");
//(".com")same result
String domain= emailAddress.substring(beginningIndex,endingIndex);

        System.out.println(domain);


        String p="I like to watch movies and reading books";

String word2=p.substring(p.indexOf("m"), p.indexOf(" a"));
        System.out.println(word2);

        String y="I like to learn Java, Java is cool, I like to watch Jumanji";
        int n1=y.indexOf("Java ");//with(J) will return the first J
        //(", J")+2
        System.out.println(n1);
        int n2=y.lastIndexOf("J");
        System.out.println(n2);

String name="My name is Muhtar";

String result=name.substring(name.lastIndexOf("M"));
        System.out.println(result);











    }
}
