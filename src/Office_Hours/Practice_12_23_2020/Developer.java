package Office_Hours.Practice_12_23_2020;

public class Developer extends Employee{
    public Developer(String name, String jobTitle, String ID, char gender, double salary, boolean isFullTime) {
        super(name, jobTitle, ID, gender, salary, isFullTime);
    }

  public void fixingBug(){
      System.out.println(jobTitle+" "+name+ " fixing bug.");
  } //if I put this in super class all the employee will have the same method



}
