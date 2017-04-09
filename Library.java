import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.FileWriter;
import books.Book;
public class Library{
  private HashMap<String,ArrayList<Book>> library;
  private ArrayList<Book> bookinventory;
  private Book tempbook;
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

    if(!library.isEmpty()){                       // if hashmap is not empty
      for(String book : library.keySet()){            //loop for all hashmap values
        bookinventory = library.get(book);                      //gets array of every hashmap value
        for(Book temp : bookinventory){
          temp.displayInfo();
        }
      }
    }else{
      System.out.println("Library is Empty");
    }
  }
   public Book removeBook(String title){
    if(library.containsKey(title)){             //if book is in hashmap
      bookinventory = library.get(title);       //get the array
      tempbook = bookinventory.get(0);          //get the book in the array
      bookinventory.remove(0);                  //remove a book in tje array
      if(bookinventory.size()==0){              //if array is empty delete hashmap
        library.remove(title);
      }
      System.out.println(tempbook.getTitle()+" has been borrowed");
      return tempbook;
    }else{
      System.out.println("The book titled "+title+" has not been found");
      return null;
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
