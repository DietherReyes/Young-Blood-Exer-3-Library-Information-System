package books;

public class Book{
  protected String id; //converter in main
  protected String title;
  protected String author;
  protected String year;


  public Book(String id, String title, String author, String year){
    this.title = title;
    this.author = author;
    this.year = year;
    this.id = id;
  }
  public void displayInfo(){
    System.out.println("Book ID: " + this.id);
    System.out.println("Book Title: " + this.title);
    System.out.println("Book Author: " + this.id);
    System.out.println("Year Published: " + this.id);
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
}
