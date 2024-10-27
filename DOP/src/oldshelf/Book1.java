package oldshelf;

public abstract class Book1 {
    protected String title;
    protected String author;

    public Book1(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "Title: " + this.title;
    }
}
