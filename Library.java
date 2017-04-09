import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import books.Book;
public class Library{
  private HashMap<String,ArrayList<Book>> library;
  private ArrayList<Book> bookinventory;
  public Library(){
    library = new HashMap<String,ArrayList<Book>>();
  }
  public void addBook(Book book){
    if(library.containsKey(book.getTitle())){
        bookinventory = library.get(book.getTitle());
        bookinventory.add(book);
      }else{
        bookinventory = new ArrayList<Book>();
        bookinventory.add(book);
        library.put(book.getTitle(),bookinventory);
      }
  }
  public void viewBooksInLib(){
    ArrayList<Book> arr;

    if(!library.isEmpty()){
      for(String book : library.keySet()){
        arr = library.get(book);
        arr.get(0).displayInfo();    
      }
      System.out.println("HERE");
    }else{
      System.out.println("lol");

    }
  }
}
