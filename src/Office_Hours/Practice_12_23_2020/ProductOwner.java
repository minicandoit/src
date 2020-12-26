package Office_Hours.Practice_12_23_2020;

public class ProductOwner extends Employee {

    public ProductOwner(String name,  String ID, char gender, double salary, boolean isFullTime) {
        super(name, "Product Owner", ID, gender, salary, isFullTime);

   //without super line 6 line 5 will get error because constructor can cal another constructor
    }

    public void acceptProduct(){
        System.out.println(jobTitle+" "+name+" "+" accepted the product.");
    }

    public void resectProduct(){
        System.out.println(jobTitle+" "+name+" rejected the product.");
    }
    public void writeUserStory(){
        System.out.println(jobTitle+" "+name+ " is writing a user story.");
    }



}
