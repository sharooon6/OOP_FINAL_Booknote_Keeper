package booknote_keeper;

import java.io.Serializable;

public class Note implements Serializable {
    private String text;
    private int pageNumber;

    public Note(String text){
        this.text = text;
        this.pageNumber = 0;
        //this.pageNumber = pageNumber;
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

