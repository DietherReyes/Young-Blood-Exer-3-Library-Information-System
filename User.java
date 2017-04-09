import java.util.ArrayList;

public class User{
 private ArrayList<Book> borrowedBooks;

 public User(){
  borrowedBooks = new ArrayList<Book>();
 }

 public void borrowBook(Book book){
   borrowedBooks.add(book);
 }

 public void returnBook(String title, Library library){
  for(int i = 0; i < borrowedBooks.size(); i++){
   if(borrowedBooks.get(i).getTitle().equals(title)){
     library.addBook(borrowedBooks.get(i));
     borrowedBooks.remove(i);
     return;
   }
  }
  System.out.println("User does not have that book");
 }

 public void viewBooksInUser(){
  if(!borrowedBooks.isEmpty()){
   for(int i = 0; i < borrowedBooks.size(); i++)
    borrowedBooks.get(i).displayInfo();
  }else{
   System.out.println("User does not have borrowed books");
}
}
}
