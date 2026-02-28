package com.abstraction;

interface Borrowable {
    void borrowBook();
    void returnBook();
}
class Book implements Borrowable {
    private String title;
    private boolean isAvailable = true;

    public Book(String title) {
        this.title = title;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }
}
public class LMS {

	public static void main(String[] args) {
		Book b = new Book("Java Basics");
        b.borrowBook();
        b.borrowBook();
        b.returnBook();

	}

}
