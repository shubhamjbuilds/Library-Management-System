package com.lms;

import java.util.ArrayList;
import java.util.List;

public class Library 
{
	private List<Book> books;
    private List<Member> members;

    public Library()
    {
        books = new ArrayList<Book>();
        members = new ArrayList<Member>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public void addMember(Member member) 
    {
        members.add(member);
    }

    public Book getBookById(int id)
    {
    	 for (Book b : books) 
    	 {
    	        if (b.getId() == id) 
    	        {
    	            return b;
    	        }
    	    }
    	    return null;
    }

    public Member getMemberById(int id) {
        for (Member m : members) {
            if (m.getId()==id) 
            {
                return m;
            }
        }
        return null;
    }
    public void getAllBooks()
    {
        for (Book b : books)
        {
            System.out.println(b);
        }
    }

    public void showAllMembers() 
    {
        for (Member m : members) 
        {
            System.out.println(m);
        }
    }

    public Book searchBook(String title)
    {
        for(Book b : books)
        {
            if(b.getBookName().equalsIgnoreCase(title))
            {
                return b;
            }
        }
        return null;
    }


}
