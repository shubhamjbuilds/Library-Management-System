package com.lms;

import java.util.ArrayList;
import java.util.List;

public abstract class Member implements Borrowable,Reportable {
    protected int id;
    protected String name;
    protected List<Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public abstract int getBorrowLimit();

    public void borrowBook(Book book) {
        if(!book.isAvailable()){
            System.out.println(book.getBookName() + " Book is not available");
            return;
        }
        if (borrowedBooks.size() < getBorrowLimit()) {
            borrowedBooks.add(book);
            book.borrow();
        } else {
            System.out.println(name + " cannot borrow more books.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
        } else {
            System.out.println(name + " did not borrow this book.");
        }
    }
    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
    public void getReport() {
        System.out.println("\n--- Report for " + name + " ---");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book b : borrowedBooks) {
                System.out.println(b);
            }
        }
    }
    @Override
    public String toString() {
        return id + " - " + name + " (" + borrowedBooks.size() + " books borrowed)";
    }
}