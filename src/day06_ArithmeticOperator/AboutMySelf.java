package day06_ArithmeticOperator;

public class AboutMySelf {
    public static void main(String[] args) {

        //String firstName ="mini",lastName="Bae",fullName=firstName+" "+lastName;
        //not recomanded right now to find error better
        String firstName ="mini";
        String lastName="Bae";
        String fullName=firstName+" "+lastName;
        String from="Korea";
        String favoriteBook="BIBLE";
        String favoriteShow="Super Book";
//  \"  \"   adding double quote
        System.out.println("Full name is: "+fullName);
        System.out.println("From: "+from);
        System.out.println("Favorite book is: \""+favoriteBook+"\"");
        System.out.println("Favorite Show is: "+"\""+favoriteShow+"\"");
//  ("Favorite Show is: \""+favoriteShow);

    }
}
/*
Task01: AboutMyself
    variables: firstName, lastName, fullName, from, favoriteBook, favoriteShow
    output:
        Full name is: YourFullName
        From: YourCountryName
        Favorite boos is: "YourFavovoriteBook"
        Favorite Show is: "YourFavoriteShow"

 */