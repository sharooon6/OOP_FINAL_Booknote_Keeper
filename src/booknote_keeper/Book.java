package booknote_keeper;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable {  

    private String title;
    private String review;
    private String author;
    private String genre;
    private ArrayList<Note> notes;

    public Book(String title, String review, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.review = review;
        this.notes = new ArrayList<>();
    }
    
    public Book(){
        this.title = "";
        this.author = "";
        this.genre = "";
        this.review = "";
        this.notes = new ArrayList<>();
    }

    
    public void addNote(Note note){
        notes.add(note);
        
    }
    

    public String getTitle(){
        return title;
    }

    public String getReview(){
        return review;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public ArrayList<Note> getNotes(){
        return notes;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setReview(String review){
        this.review = review;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void BrowseBook(){
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Genre " + this.genre + ", Review: " + this.review);
    }
    
}
