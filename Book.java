package Books;

public class Book{
  private String id; //converter in main 
  private String title;
  private String author;
  private String year;

  public Book(String id, String title, String Author, String year){
    this.title = title;
    this.author = author;
    this.year = year;
    this.id = id; 
  }
  
  String getID(){
    return this.id;
  }
  String getTitle(){
    return this.id;
  }
  String getAuthor(){
    return this.author;
  }
  String getYear(){
    return this.year
  }
}
  
