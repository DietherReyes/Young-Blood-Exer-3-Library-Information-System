import java.util.Scanner;
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
    String strinput = intScan.nextLine();
    return strinput;
  }
  public static void main(String[] args){
    int choice;
    do{
      System.out.println("==============MAIN MENU==============");
      System.out.println("[1] Borrow Book");
      System.out.println("[2] Return Book");
      System.out.println("[3] View Books In Library");
      System.out.println("[4] View Books In User ");
      System.out.println("[0] Exit ");
      System.out.println("=====================================");
      choice = intInput("Choice");
      switch(choice){
        case 1: break;
        case 2: break;
        case 3: break;
        case 4: break;
        default: System.out.println("Invalid Choice!!!"); break;
      }
    }while(choice != 0);
  }
}
