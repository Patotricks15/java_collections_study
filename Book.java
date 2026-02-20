import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;
    private int numberPage;
    private boolean available;

    public Book(String title, String author, int year, int numberPage) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.numberPage = numberPage;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // Static Comparators
    public static final Comparator<Book> BY_TITLE = Comparator.comparing(Book::getTitle);
    public static final Comparator<Book> BY_AUTHOR = Comparator.comparing(Book::getAuthor);
    public static final Comparator<Book> BY_YEAR = Comparator.comparing(Book::getYear);
    public static final Comparator<Book> BY_PAGES = Comparator.comparing(Book::getNumberPage);
}