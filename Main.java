import java.util.Scanner;
import java.lang.*;
import books.Book;
import Library;
import java.io.FileWriter;
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
    int choice,bookCounter= 0;
    String title;
    Book newBook;
    Library library = new Library();
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


          do{
            System.out.println("==============BOOK TYPE==============");
            System.out.println("[1] Text Book");
            System.out.println("[2] Novel");
            System.out.println("[3] Dictionary");
            System.out.println("[4] Encyclopedia");
            System.out.println("[0] Exit ");
            System.out.println("=====================================");
            choice2 = intInput("Choice");
            switch(choice2){
              case 1:
                newBook = new TextBooks(Integer.toHexString(bookCounter++), strInput("Book Title"), strInput("Book Author"), strInput("Year Published"));
                library.addBook(newBook);
                System.out.println("One copy of "+ newBook.getTitle() +" has been added");
                break;
              case 2:
                newBook = new TextBooks(Integer.toHexString(bookCounter++), strInput("Book Title"), strInput("Book Author"), strInput("Year Published"));
                library.addBook(newBook);
                System.out.println("One copy of "+ newBook.getTitle() +" has been added");
                break;
              case 3:
                newBook = new Dictionary(Integer.toHexString(bookCounter++), strInput("Book Title"), strInput("Book Author"), strInput("Year Published"));
                library.addBook(newBook);
                System.out.println("One copy of "+ newBook.getTitle() +" has been added");
                break;
              case 4:
                newBook = new Encyclopedia(Integer.toHexString(bookCounter++), strInput("Book Title"), strInput("Book Author"), strInput("Year Published"));
                library.addBook(newBook);
                System.out.println("One copy of "+ newBook.getTitle() +" has been added");
                    break;
              default:
                System.out.println("Not in the choices");
            }
          }while((choice2<0&&choice2>4)||choice2==0);
          if(choice2==0){
            System.out.println("Input has been cancelled");
          }
        

              break;
       case 2: title = strInput("Title of the Book to be Borrowed");
               break;

       case 3: title = strInput("Title of the Book to be Returned");
               break;

      case 4: library.viewBooksInLib();
              break;
      case 5: //library.viewBooksInUser();
              break;
      }
    }while(choice != 0);
    library.saveFileLibrary();
  }
}
