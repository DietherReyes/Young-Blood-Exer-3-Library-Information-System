import java.util.ArrayList;

public class User{
 private String name;
 private ArrayList<Book> borrowedBooks = new ArrayList<Book>();
 
 public User(Books borrowBook){
  this.borrowedBooks[this.borrowedBooks.size()] = borrowBook;
 }
 
 void borrowBook(){
  
 }
 
 void returnBook(){
  
 }
}
