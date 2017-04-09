import java.util.Scanner;
import java.lang.*;
public class Main{
  private static int intInput(String str){
    Scanner intScan = new Scanner(System.in); //method to input integers
    System.out.print("Enter " + str + ": ");
    int intinput = intScan.nextInt();
    return intinput;
  }
  private static String strInput(String str){// method to input string
    Scanner strScan = new Scanner(System.in);
    System.out.print("Enter " + str + ": ");
    String strinput = strScan.nextLine();
    return strinput;
  }
  public static void main(String[] args){
    int choice;
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
              library.addBook(new Book(Integer.toHexString(bookCounter++), strInput("Book Title"), strInput("Book Author"), strInput("Year Published")));
              break;
       case 2: title = strInput("Title of the Book to be Borrowed");
               break;

       case 3: title = strInput("Title of the Book to be Returned")
               break;

      case 4: library.viewBooksInLib();
              break;
      case 5: library.viewBooksInUser();
              break;
      }
    }while(choice != 0);
  }
}
