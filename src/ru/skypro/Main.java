package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Herbert Schildt");
        Author secondAuthor = new Author("Cay S. Horstmann");

        Book book1 = new Book("Java A Beginner's Guide, 6th Edition", new Author("Herbert Schildt"), 2015);
        Book book2 = new Book("Core Java, Volume 1 - Fundamentals", new Author("Cay S. Horstmann"), 2018);

        Book book3 = new Book("Java A Beginner's Guide, 6th Edition", firstAuthor, 2015);
        Book book4 = new Book("Core Java, Volume 1 - Fundamentals", secondAuthor, 2018);

        book1.bookInfo();
        book2.bookInfo();
        book3.bookInfo();
        book4.bookInfo();

        book2.setYearOfPublication(2019);
        book2.bookInfo();
    }
}
