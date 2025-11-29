package com.lms;


public class Book 
{
	private int id;
    private String title;
    private String author;
    private Boolean isAvailable;

    

    public Book(int id,String title,String author, boolean isAvailable){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void borrow()
    {
        if(isAvailable)
        {
            isAvailable = false;
            System.out.println(title + " Book Borrowed");
        }
        else
        {
            System.out.println(title + " Book not available");
        }
    }

    public void returnBook()
    {
        isAvailable = true;
        System.out.println(title + " book returned");
    }

    public String getBookName()
    {
        return title;
    }

    
    public int getId() 
    {
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	

	@Override
    public String toString() 
    {
        return "[" + id + "]" + "[" + title + "]" + "[" + author + "]" + "[" + isAvailable +"]";
    }

}
