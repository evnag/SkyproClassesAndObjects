package ru.skypro;

public class Book {
    private final String title;
    private final Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        if (yearOfPublication >= 0) {
            this.yearOfPublication = yearOfPublication;
        } else {
            System.out.println("Incorrect value!");
        }
    }

    public void bookInfo(){
        System.out.printf("Title: %s\nAuthor: %s\nYear of publishing: %s\n", title, author.getAuthorFullName(), yearOfPublication);
        System.out.println("========================");
    }
}
