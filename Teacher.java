package com.lms;

public class Teacher extends Member 
{
	private static final int BORROW_LIMIT = 5;

    public Teacher(int id, String name) 
    {
        super(id, name);
    }

    @Override
    public int getBorrowLimit() 
    {
        return BORROW_LIMIT;
    }

}
