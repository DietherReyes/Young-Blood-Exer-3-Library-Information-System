package bin;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.*;

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
  public Book removeBook(String title){

      bookinventory = library.get(title);
      tempbook = bookinventory.get(0);
      bookinventory.remove(0);
      if(bookinventory.size()==0){
        library.remove(title);
      }
      System.out.println(tempbook.getTitle()+" has been borrowed");
      return tempbook;

  }
  public HashMap<String,ArrayList<Book>> getLibrary(){
    return this.library;
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
                   fw.write(temp.getID() + "," + temp.getType() + "," + temp.getTitle() + "," + temp.getAuthor() + "," + temp.getYear() + "\r\n" );
                }

              }
              fw.close();
            }else{
              System.out.println("Library is Empty");
            }
    }catch(Exception e){System.out.println(e);}
  }

  public void loadFileLibrary(){
    // The name of the file to open.
     String fileName = "Library.txt";
     Book tempBook;
     // This will reference one line at a time
     String line = null;
     String[] lineArray;
     try {
         FileReader fileReader =
             new FileReader(fileName);

         BufferedReader bufferedReader =    //for efficient readin
             new BufferedReader(fileReader);

         while((line = bufferedReader.readLine()) != null) {      //one line reader loop
            lineArray = line.split(",");
            tempBook = new Book(lineArray[0],lineArray[1],lineArray[2],lineArray[3],lineArray[4]);
            this.addBook(tempBook);
         }

         // Always close files.
         bufferedReader.close();
     }
     catch(FileNotFoundException ex) {
         System.out.println(
             "Unable to open file '" +
             fileName + "'");
     }
     catch(IOException ex) {
         System.out.println(
             "Error reading file '"
             + fileName + "'");
     }
  }
}
