package day38_Statics.ScrumTask;

public class Developer {
    public String name,ID,jopTitle,companyName;
    public double salary;
    public char gender;

    public static boolean hasCodingSkills=true;

    public void setInfo(String name, String ID, String jopTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jopTitle = jopTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding(){
        System.out.println(jopTitle+" "+name+" is coding");
    }
    public void fixingBug(){
        System.out.println(jopTitle+" "+name+" is crying");
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jopTitle='" + jopTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
