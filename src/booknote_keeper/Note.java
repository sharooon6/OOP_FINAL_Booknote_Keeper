package booknote_keeper;


public class Note {
    private String text;
    private int pageNumber;

    public Note(String text, int pageNumber){
        this.text = text;
        this.pageNumber = pageNumber;
    }

    public String getText(){
        return text;
    }

    public int getPageNumber(){
        return pageNumber;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setPageNumber(int pageNumber){
        this.pageNumber = pageNumber;
    }
}

