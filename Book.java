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
  String getID(){
    return this.id;
  }
  String getTitle(){
    return this.title;
  }
  String getAuthor(){
    return this.author;
  }
  String getYear(){
    return this.year
  }
}
