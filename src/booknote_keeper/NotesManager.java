package booknote_keeper;

public class NotesManager {

    public NotesManager(){

    }

    public void addNoteToBook(Book book, Note note){
        book.addNote(note);
    }
}
