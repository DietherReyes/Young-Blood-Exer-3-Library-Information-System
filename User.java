import java.util.ArrayList;

public class User{
 private ArrayList<Book> borrowedBooks;
 
 public User(){
  borrowedBooks = new ArrayList<Book>();
 }
 
 void borrowBook(Book book){
   borrowedBooks.add(book);
 }
 
 void returnBook(Book book, Library library){
  if(borrowedBooks.contain(book)){
    borrowedBooks.remove(book);
    library.addBook(book);
  }else{
    System.out.println("Cannot returned because that book is not borrowed");
  }
 }
   
 public void viewBooksInUser(){
  if(!borowedBooks.isEmpty()){
   for(int i = 0; i < borrowedBooks.size(); i++)
    borrowedBooks.get(i).displayInfo();
  }else
   System.out.println("User does not have borrowed books");
}
