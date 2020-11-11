package day23_NestedLoop;

import java.util.Scanner;

/*
credentials:
cybertek
cubertek12345
 */
public class Credentials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your username");
        String userName=scan.next();

        System.out.println("Enter your password");
        String passWord=scan.next();
if(userName.equals("cybertek")&&passWord.equals("cybertek12345")) {
    System.out.println("Logged In");
    //if the credentials are valid ,user will be able to login
}else {
    //condition for invalid username and password
    for (int i = 1; i <= 3; i++) {

        if (i == 3) {//if the attempt is aready 3, the account should be locked
            System.err.println("Your account is locked");
            System.exit(0);//terminates the program
        }
        System.out.println("Invalid username or password, please re enter");
        System.out.println("Enter your username");
        userName = scan.next();

        System.out.println("Enter your password");
        passWord = scan.next();
        if (userName.equals("cybertek") && passWord.equals("cybertek12345")) {
            System.out.println("Logged In");
            break;
        }

    }

}







    }
}
