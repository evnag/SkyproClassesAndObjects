package ru.skypro;

import java.util.Objects;

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
        System.out.printf("Title: %s\nAuthor: %s\nYear of publishing: %s\n", title, getAuthor().getAuthorFullName(), yearOfPublication);
        System.out.println("========================");
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
