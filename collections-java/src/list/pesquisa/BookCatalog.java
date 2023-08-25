package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> bookList;

    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int releaseYear) {
        Book book = new Book(title, author, releaseYear);
        bookList.add(book);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> bookListByAuhtor = new ArrayList<>(0);
        
        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    bookListByAuhtor.add(book);
                }
            }
        }
        return bookListByAuhtor;
    }
    
    public List<Book> searchByYearRange(int initialYear, int finishYear) {
        List<Book> bookListByYear = new ArrayList<>(0);
        
        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                int year = book.getReleaseYear();
                if (initialYear <= year && year <= finishYear) {
                    bookListByYear.add(book);
                }
            }
        }
        return bookListByYear;
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;
        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = book;
                    break;
                }
            }
        }
        return bookByTitle;
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("Livro 1", "Autor 1", 2020);
        bookCatalog.addBook("Livro 1", "Autor 2", 2021);
        bookCatalog.addBook("Livro 2", "Autor 2", 2022);
        bookCatalog.addBook("Livro 3", "Autor 3", 2023);
        bookCatalog.addBook("Livro 4", "Autor 4", 1994);

        System.out.println(bookCatalog.searchByAuthor("Autor 2"));
        System.out.println(bookCatalog.searchByYearRange(2020, 2022));
        System.out.println(bookCatalog.searchByTitle("Livro 1"));
    }
        
}
