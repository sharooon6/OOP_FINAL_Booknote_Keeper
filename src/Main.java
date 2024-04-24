import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BookManager bookManager = new BookManager();
        NotesManager notesManager = new NotesManager();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n--- Book Manager ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Note to Book");
            System.out.println("3. Browse All Books");
            System.out.println("4. Delete Books");
            System.out.println("5. Edit Book");
            System.out.println("6. Search Book");
            System.out.println("7. Exit");
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option){

                case 1: //Add Book
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter genre: ");
                    String genre = scanner.nextLine();
                    System.out.println("Enter review: ");
                    String review = scanner.nextLine();
                    bookManager.addBook(title, author, genre, review);
                    System.out.println("Book added successfully");
                    break;

                case 2: //Add Note to Book
                    System.out.println("Enter the book title to add notes for: ");
                    title = scanner.nextLine();
                    Book book = bookManager.searchByTitle(title);
                    if(book != null){
                        System.out.println("Enter note text: ");
                        String text = scanner.nextLine();
                        System.out.println("Enter page number: ");
                        int pageNumber = scanner.nextInt();
                        scanner.nextLine();
                        Note note = new Note(text, pageNumber);
                        notesManager.addNoteToBook(book, note);
                        System.out.println("Note added successfully.");
                    }else{
                        System.out.println("Book not found for adding notes.");
                    }
                    break;

                case 3://Browse All Books
                    bookManager.browseAllBooks();
                    break;

                case 4://Delete Books
                    System.out.println("Enter the book title to delete for: ");
                    title = scanner.nextLine();
                    if(bookManager.deleteBook(title)){
                        System.out.println("Book removed successfully");
                    }else{
                        System.out.println("Book not found for deleting");
                    }
                    break;

                case 5://Edit Book
                    System.out.println("Enter the book title to edit for: ");
                    title = scanner.nextLine();
                    book = bookManager.searchByTitle(title);
                    if(book!= null){
                        System.out.println("Enter the new title: ");
                        String newTitle = scanner.nextLine();
                        System.out.println("Enter the new author: ");
                        String newAuthor = scanner.nextLine();
                        System.out.println("Enter the new genre: ");
                        String newGenre = scanner.nextLine();
                        System.out.println("Enter the new review: ");
                        String newReview = scanner.nextLine();
                        bookManager.editBook(book, newTitle, newAuthor, newGenre, newReview);
                        System.out.println("Book edited successfully");
                    }else{
                        System.out.println("Book not found for editing");
                    }
                    break;

                case 6://Search Book
                    System.out.println("1. Search book by title");
                    System.out.println("2. Search book by author");
                    System.out.println("3. Search book by genre");
                    System.out.println("Choose an option: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    if(choice == 1){
                        System.out.println("Enter the book title to search for: ");
                        title = scanner.nextLine();
                        book = bookManager.searchByTitle(title);
                        if(book != null){
                            book.BrowseBook();
                        }else{
                            System.out.println("Book not found for searching");
                        }
                    }
                    if(choice == 2){
                        System.out.println("Enter the book author to search for: ");
                        author = scanner.nextLine();
                        book = bookManager.searchByAuthor(author);
                        if(book != null){
                            book.BrowseBook();
                        }else{
                            System.out.println("Book not found for searching");
                        }
                    }
                    if(choice == 3){
                        System.out.println("Enter the book genre to search for: ");
                        genre = scanner.nextLine();
                        book = bookManager.searchByGenre(genre);
                        if(book != null){
                            book.BrowseBook();
                        }else{
                            System.out.println("Book not found for searching");
                        }
                    }else{
                        System.out.println("Invalid option.");
                    }

                case 7://Exit
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");

                
            }
            scanner.close();
        }


    }

}
