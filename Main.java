import java.util.Scanner;
import java.lang.*;
public class Main{
  private static int intInput(String str){
    Scanner intScan = new Scanner(System.in); //method to get integer input
    System.out.print("Enter " + str + ": ");
    int intinput = intScan.nextInt();
    return intinput;
  }
  private static String strInput(String str){// method to get string input
    Scanner strScan = new Scanner(System.in);
    System.out.print("Enter " + str + ": ");
    String strinput = intScan.nextLine();
    return strinput;
  }
  public static void main(String[] args){
    int choice,bookCounter = 0;//counts the instance of books
    String title;
    Library libary = new Library();
    do{
      System.out.println("==============MAIN MENU==============");
      System.out.println("[1] Add Book");
      System.out.println("[2] Borrow Book");
      System.out.println("[3] Return Book");
      System.out.println("[4] View Books In Library");
      System.out.println("[5] View Books In User ");
      System.out.println("[0] Exit ");
      System.out.println("=====================================");
      choice = intInput("Choice");
      switch(choice){
        case 1:
                //library.addBook(Integer.toHexString(bookCounter++), strInput("Book Title"), strInput("Book Author"), strInput("Year Published"));
                break;
        case 2: break;
                title = strInput("Title of the Book to be Borrowed");
        case 3: break;
                title = strInput("Title of the Book to be Returned");
        case 4: library.viewBooksInLib();
                break;
        case 5: library.viewBooksInUser();
                break;
        default: System.out.println("Invalid Choice!!!"); break;
      }
    }while(choice != 0);
  }
}
