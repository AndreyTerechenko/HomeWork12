public class Book {
    private int year;
    private String bookTitle;
    private Author author;

    public Book(int year, String bookTitle, Author author) {
        this.year = year;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
// Надеюсь все правильно.
//все верно.