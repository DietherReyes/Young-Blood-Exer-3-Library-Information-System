import java.util.ArrayList;

public class User{
 String name;
 ArrayList<Books> borrowedBooks = new ArrayList<Books>();
 
 public User(Books borrowBook){
  this.borrowedBooks[this.borrowedBooks.size()] = borrowBook;
 }
 
 void borrowBook(){
  
 }
 
 void returnBook(){
  
 }
}
