package ru.skypro;

public class Library {
    private Book[] books;

    public Library(int countBook) {
        this.books = new Book[countBook];
    }

    public Book[] addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return books;
            }


        }
        return books;

    }

    public void getBook(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                System.out.println("book = " + book.getName() + ":" + book.getAuthorName() + ":" + book.getYearPublishing());
                return;

            }

        }
        System.out.println("нет такой книги");


    }

    public void setYearPublishing(String name, int year) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                book.setYearPublishing(year);
                return;

            }

        }

    }


    public void printAllBooks() {
        for (Book book : books) {
            if (book == null) {
                return;
            }
            System.out.println("book = " + book.getName() + ":" + book.getAuthorName() + ":" + book.getYearPublishing());


        }

    }
}
