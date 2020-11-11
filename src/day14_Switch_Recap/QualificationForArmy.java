package day14_Switch_Recap;

public class QualificationForArmy {
    public static void main(String[] args) {
        String citizen="Turkey";
        boolean isResident=true;
        boolean isAlien=false;
        boolean hasHighSchoolDiploma=true;
        int numberOfDependants=3;
        int age=18;

        if(citizen=="USA"||isResident||isAlien){//as long as one of them are true in the or logic
            if(age>=17&&age<=34){
                if(hasHighSchoolDiploma){
                    if(numberOfDependants<=2){
                        System.out.println("You are qualified for US Army");
                    }else{
                        System.err.println("You must have no more than 2 dependants");
                    }
                    System.out.println("you are qualified for the US Army");
                }else{
                    System.err.println("You must have a high school diploma");
                }
            }else{
                System.err.println("Your age must be 17 to 34 years old");
            }

        }else{
            System.err.println("You must be a U.S. citizen or a resident or an alien.");
        }


    }
}
/*
2. What are the qualifications to join the Army?
            You must be a U.S. citizen or a resident alien.
            Be between the ages of 17-34. ...
            Have a high school diploma.
            Have no more than two dependents.
 */