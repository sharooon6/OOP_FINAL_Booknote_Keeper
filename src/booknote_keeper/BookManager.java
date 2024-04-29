package booknote_keeper;

import java.io.*;
import java.util.ArrayList;

public class BookManager {
    
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
                    } catch (IOException | ClassNotFoundException e) {
                        System.err.println("Error loading book from file: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
        }
        return loadedBooks;
    }
    
   
    
    public static void DeleteAllBooks() {
        
        File directory = new File("data");
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".ser")) {
                    if (file.delete()) {
                        System.out.println("Deleted: " + file.getAbsolutePath());
                    } else {
                        System.err.println("Failed to delete: " + file.getAbsolutePath());
                    }
                }
            }
        }

    }
    
    


}
