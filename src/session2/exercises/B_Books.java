package session2.exercises;

class Book {
    String title;
    String author;
    int publicationYear;

    int pages;

    int ISBN;

    String language;

    Book (String t, String a, int p_year, int pages, int ISBN, String lang) {
        this.title = t;
        this.author = a;
        this.publicationYear = p_year;
        this.pages = pages;
        this.ISBN = ISBN;
        this.language = lang;
    }

    Book (String t, String a, int p_year, int pages) {
        this.title = t;
        this.author = a;
        this.publicationYear = p_year;
        this.pages = pages;
        this.ISBN = 0;
        this.language = "";
    }

    Book (String t, String a, int p_year, int pages, int ISBN) {
        this.title = t;
        this.author = a;
        this.publicationYear = p_year;
        this.pages = pages;
        this.ISBN = ISBN;
        this.language = "";
    }

    Book (String t, String a, int p_year, int pages, String lang) {
        this.title = t;
        this.author = a;
        this.publicationYear = p_year;
        this.pages = pages;
        this.ISBN = 0;
        this.language = lang;
    }

    double readingDuration (int pagesPerMinute) {
    return (double) this.pages / pagesPerMinute;
    }
}

public class B_Books {

    public static void main(String[] args) {
    Book denLilleHavfrue = new Book("Den lille havfrue", "H.C Andersen", 1805, 31);

System.out.println("It will take " + denLilleHavfrue.readingDuration(2) + " minutes for you to read " + denLilleHavfrue.title);
    }


}
