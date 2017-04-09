import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.FileWriter;
import books.Book;
public class Library{
  private HashMap<String,ArrayList<Book>> library;
  private ArrayList<Book> bookinventory;
  public Library(){
    library = new HashMap<String,ArrayList<Book>>();
  }
  public void addBook(Book book){
    if(library.containsKey(book.getTitle())){       //if book title is in the key list of hashmap
        bookinventory = library.get(book.getTitle());         //gets the array
        bookinventory.add(book);                              //inputs book into the array
      }else{
        bookinventory = new ArrayList<Book>();        //else creates new array
        bookinventory.add(book);                      //adds book to array
        library.put(book.getTitle(),bookinventory);   //adds newkey to hashmap
      }
  }
  public void viewBooksInLib(){
    ArrayList<Book> arr;

    if(!library.isEmpty()){                       // if hashmap is not empty
      for(String book : library.keySet()){            //loop for all hashmap values
        arr = library.get(book);                      //gets array of every hashmap value
        for(Book temp : arr){
          temp.displayInfo();                      //displays info of the book inside the array
          System.out.println("");
        }

      }
    }else{
      System.out.println("Library is Empty");

    }
  }
  public void saveFileLibrary(){
    ArrayList<Book> arr;
    try{
            FileWriter fw=new FileWriter("Library.txt");
            if(!library.isEmpty()){                       // if hashmap is not empty
              for(String book : library.keySet()){            //loop for all hashmap values
                arr = library.get(book);                      //gets array of every hashmap value

                for(Book temp : arr){
                  //writes details(CSV);
                   fw.write(temp.getID() + "," + temp.getTitle() + "," + temp.getAuthor() + "," + temp.getYear()  + "\r\n" );
                }

              }
              fw.close();
            }else{
              System.out.println("Library is Empty");
            }
    }catch(Exception e){System.out.println(e);}

  }
}
