package ru.skypro;

public class Book {
    private final String title;
    private final Author authorFullName;
    private int yearOfPublication;

    public Book(String title, Author authorFullName, int yearOfPublication) {
        this.title = title;
        this.authorFullName = authorFullName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthorFullName() {
        return authorFullName;
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
        System.out.printf("Title: %s\nAuthor: %s\nYear of publishing: %s\n", title, authorFullName.getAuthorFullName(), yearOfPublication);
        System.out.println("========================");
    }
}
