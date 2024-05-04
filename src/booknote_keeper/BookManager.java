package booknote_keeper;

import java.io.*;
import java.util.ArrayList;

public class BookManager {
    
    
    public static boolean same(Book book){
      Book obook= loadOneBook(book);
      if(obook.getTitle().equals(book.getTitle())){
          return true;
      }
      return false;
    }
    
    //save a book object to file.
    public static void saveBook(Book book){
        
        book.BrowseBook();
        
        try {
                String filepath = "data/" + book.getTitle() + "-" + book.getAuthor() + ".ser";
                
                System.out.println(filepath);
                
                FileOutputStream f = new FileOutputStream(filepath);
                ObjectOutputStream o = new ObjectOutputStream(f);

                // Write objects to file
                o.writeObject(book);

                System.out.println("Book saved successfully.");
                f.close();
                o.close();
        } catch (FileNotFoundException e) {
                System.err.println("File not found: " + e.getMessage());
                e.printStackTrace();
        } catch (IOException e) {
                System.err.println("Error saving books: " + e.getMessage());
                e.printStackTrace();
        } 
    }
    
    //load all books from file
    public static ArrayList<Book> loadBooks() {
        ArrayList<Book> loadedBooks = new ArrayList<>();
        
        File directory = new File("data");
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".ser")) {
                    
                    System.out.println(file.getName());
                    
                    try (FileInputStream f = new FileInputStream(file);
                         ObjectInputStream o = new ObjectInputStream(f)) {

                        Book book = (Book) o.readObject();
                        loadedBooks.add(book);
                        f.close();
                        o.close();
                    } catch (IOException | ClassNotFoundException e) {
                        System.err.println("Error loading book from file: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
        }
        return loadedBooks;
    }
    
    
    //load one book from file
    public static Book loadOneBook(Book bookToLoad) {
        Book book = new Book();
        String title = "";
        String author = "";
        
        File directory = new File("data");
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                    String[] parts = file.getName().split("-");
                    if (parts.length == 2) {
                        title = parts[0];
                        author = parts[1].replace(".ser", "");
                    }
                    if(bookToLoad.getTitle().toLowerCase().equals(title.toLowerCase()) 
                        && bookToLoad.getAuthor().toLowerCase().equals(author.toLowerCase())){
                        
                        try (FileInputStream f = new FileInputStream(file);
                         ObjectInputStream o = new ObjectInputStream(f)) {

                            book = (Book) o.readObject();

                            System.out.println("Find the book!");
                            f.close();
                            o.close();
                            break;
                        
                        } catch (IOException | ClassNotFoundException e) {
                            System.err.println("Error loading book from file: " + file.getName());
                            e.printStackTrace();
                        }
                        
                    }

            }
        }
        
        return book;
    }
    
   
    
    public static void deleteAllBooks() {
        
        File directory = new File("data");
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                deleteBook(file);
            }
        }

    }
    
    
    public static void deleteBook(File file) {
        if (file.isFile() && file.exists() && file.getName().endsWith(".ser")) {
            if (file.delete()) {
                System.out.println("Deleted: " + file.getAbsolutePath());
            } else {
                System.err.println("Failed to delete: " + file.getAbsolutePath());
            }
        }
    }
    


}
