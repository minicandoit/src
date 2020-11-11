package day19_ForLoop;
/*
for( initialization; Condition ; Iterator){
                    statements;

 */
public class ForLoopIntro {
    public static void main(String[] args) {


        for(int i=1; i<=25; i++){//if condition never gonna be false loop never stop
            System.out.println("hello");
//after 25 execution i value will be 26 then false
        }//by changing number i it will turns out by changed number

        System.out.println("===================================");
String name="Cybertek School";
for(int i=5;i>0; i--){//i:5,when iterator executed i's value become 4,3,2,1,0
    System.out.println(name);//1,2,3,4,5,stop===5times print name
}   //for(int i=5;i>0;i++)=====>next print line can not be executed because it's always true
        System.out.println("Hello Batch 21");








    }
}
