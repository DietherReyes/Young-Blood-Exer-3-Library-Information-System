import java.util.ArrayList;
import java.io.*;
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
 public void saveFileUser(){

    try{
          FileWriter fw=new FileWriter("User.txt");
          for(Book temp : this.borrowedBooks){
            fw.write(temp.getID() + "," + temp.getType() + "," + temp.getTitle() + "," + temp.getAuthor() + "," + temp.getYear() + "\r\n" );
          }
           fw.close();
    }catch(Exception e){System.out.println(e);}
  }
  public void loadFileUser(Library library){
    // The name of the file to open.
     String fileName = "User.txt";
     Book tempBook;
     String line = null;
     String[] lineArray;
     try {
         FileReader fileReader =
             new FileReader(fileName);

         BufferedReader bufferedReader =          //for efficient reading
             new BufferedReader(fileReader);

         while((line = bufferedReader.readLine()) != null) {        //one line reader loop
            lineArray = line.split(",");
            tempBook = new Book(lineArray[0],lineArray[1],lineArray[2],lineArray[3],lineArray[4]);
            library.addBook(tempBook);                      //adds book to library
            this.borrowBook(library.removeBook(lineArray[2]));     //borrows book from library

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
