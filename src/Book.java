
public class Book{
  private String id; //converter in main
  private String title;
  private String author;
  private String year;
  private String type;
  private static int bookCounter;//

  public Book(String type, String title, String author, String year ){
    this.type = type;
    this.title = title;
    this.author = author;
    this.year = year;
    this.id = Integer.toHexString(bookCounter++);
  }
  public Book(String id,String type, String title, String author, String year ){
    this.type = type;
    this.title = title;
    this.author = author;
    this.year = year;
    this.id = id;
    bookCounter++;
  }
  public void displayInfo(){
    System.out.println("Book Type: " + this.type);
    System.out.println("Book ID: " + this.id);
    System.out.println("Book Title: " + this.title);
    System.out.println("Book Author: " + this.author);
    System.out.println("Year Published: " + this.year);
  }
                //public modifier
  public String getID(){
    return this.id;
  }
  public String getTitle(){
    return this.title;
  }
  public String getAuthor(){
    return this.author;
  }
  public String getYear(){
    return this.year;
  }
  public String getType(){
    return this.type;
  }
}
