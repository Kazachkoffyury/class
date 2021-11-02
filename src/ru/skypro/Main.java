package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Author firstAuthore = new Author("Жюль Верн");
        Author secondAuthore = new Author("Даниэль Дефо");


        Book book = new Book("20 тысяч лье под водой", 1870, firstAuthore.getAuthoreName());
        Book book2 = new Book("таинственный остров", 1875, firstAuthore.getAuthoreName());
        Book book3 = new Book("путешествие к центру земли", 1864, firstAuthore.getAuthoreName());
        Book book4 = new Book("вокруг света за 80 дней", 1872, firstAuthore.getAuthoreName());
        Book book5 = new Book("Робинзон Крузо", 1719, secondAuthore.getAuthoreName());
        book5.setYearPublishing(1725);


        Library library = new Library(5);

        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);


        library.printAllBooks();
        library.getBook("робинзон Крузо");
        library.setYearPublishing("робинзон Крузо", 1800);
        library.getBook("робинзон Крузо");


    }


}



