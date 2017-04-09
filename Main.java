import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner strScan = new Scanner(System.in); // scanner for strings
    Scanner intScan = new Scanner(System.in); //scanner for integers
    do{
      System.out.println("==============MAIN MENU==============");
      System.out.println("[1] Borrow Book");
      System.out.println("[2] Return Book");
      System.out.println("[3] View Books In Library");
      System.out.println("[4] View Books In User ");
      System.out.println("[0] Exit ");
      System.out.println("=====================================");
      System.out.print("Enter Choice: ");
      
    }while(choice != 0);
  }
}
