package bg.smg;

public class Referat extends Document implements Cloneable{
    private Author author;
    private String theme;
    private int pages;

    public Referat() {
        super();
        this.author = new Author();
        this.theme = "";
        this.pages = 0;
    }

    public Referat(boolean isSubmitted, Author author, String theme, int pages) {
        super(isSubmitted);
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Referat newRef = (Referat) super.clone();
        newRef.setAuthor((Author) author.clone());
        return newRef;
    }

    @Override
    public String toString() {
        return "Referat by" + author.toString() + " with theme \"" + theme + "\"" + " (" + pages + " pages long)";
    }

    @Override
    public void submit() {
        setSubmitted(true);
        System.out.println("The referat by " + author.toString() + " is submitted");
    }
}
