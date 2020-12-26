package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
     String[]jobTitle={"SDET", "Scrum Master", "QA", "Developer", "PO", "BA", "CEO", "SDET", "QA", "Developer","SDET"};
     ArrayList<String> jobs=new ArrayList<>();
     jobs.addAll(Arrays.asList(jobTitle));

     jobs.retainAll(Arrays.asList("SDET","QA"));//gain all
//Arrays.asList==>array to the collection type

   //   jobs.removeIf(p->!p.equals("SDET")&&!p.equals("QA"));
        System.out.println(jobs);

        System.out.println("==================================");

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,-1,-2,-3,-4,-1,0,1,2,3));

       //only keep the numbers 7,8,9==>retain is preffered
        numbers.retainAll(Arrays.asList(7,8,9));//data is already known and given
      //  numbers.removeIf(p->!(p==7||p==8||p==9));
        System.out.println(numbers);


        ArrayList<Integer>numbers2=new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,-1,-2,-3,-4,-1,0,1,2,3));
        //remove the elements that are less than 7

        numbers2.removeIf(p->p<7);
        System.out.println(numbers2);

        System.out.println("=========================================");

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,100,1200,200,400,500,6660000));
        //solution1
        // list.removeIf(p->p>100);

        //solution2
        ArrayList<Integer>temp=new ArrayList<>();

        for(int each:list){
            if(each<=100){
                temp.add(each);
            }
        }

        list=temp;//reassigning temp to list

        System.out.println(list);










    }
}
