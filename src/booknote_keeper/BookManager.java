package booknote_keeper;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager(){
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, String genre, String review){
        Book book = new Book(title, author, genre, review);
        books.add(book);
    }

    public Book searchByTitle(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public Book searchByAuthor(String author){
        for(Book book : books){
            if(book.getAuthor().equalsIgnoreCase(author)){
                return book;
            }
        }
        return null;
    }

    public Book searchByGenre(String genre){
        for(Book book : books){
            if(book.getGenre().equalsIgnoreCase(genre)){
                return book;
            }
        }
        return null;
    }

    public boolean deleteBook(String title){
        return books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public void browseAllBooks(){
        for(Book book : books){
            book.BrowseBook();
        }
    }

    public void editBook(Book book, String newTitle, String newAuthor, String newGenre, String newReview){
        book.setAuthor(newAuthor);
        book.setGenre(newGenre);
        book.setReview(newReview);
        book.setTitle(newTitle);
    }

}
