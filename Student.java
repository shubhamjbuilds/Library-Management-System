package com.lms;

public class Student extends Member
{

	  private static final int BORROW_LIMIT = 3;

	    public Student(int id, String name) 
	    {
	        super(id, name);
	    }

	    @Override
	    public int getBorrowLimit() 
	    {
	        return BORROW_LIMIT;
	    }
}
