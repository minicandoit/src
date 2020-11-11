package day11_MultiBranchIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int m=3;

        String nameOfMonth =(m==1)?"Jan":(m==2)?"Feb":(m==3)?"Mar"
                :(m==4)?"Apr":(m==5)?"May":(m==6)?"Jun":(m==7)?"Jul":(m==8)?"Aug"
                :(m==9)?"Sep":(m==10)?"Oct":(m==11)?"Nov":"Dec";

        System.out.println(nameOfMonth);
    }
}

