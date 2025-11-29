package com.lms;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Library library = new Library();
		
		library.addBook(new Book(1, "Java Basics", "James Gosling", true));
		library.addBook(new Book(2, "Python for Beginners", "Guido van Rossum", true));
		library.addBook(new Book(3, "C++ Fundamentals", "Bjarne Stroustrup", true));
		library.addBook(new Book(4, "Web Development with HTML", "Tim Berners-Lee", true));
		library.addBook(new Book(5, "JavaScript Essentials", "Brendan Eich", true));
		library.addBook(new Book(6, "Database Concepts", "Elmasri & Navathe", true));
		library.addBook(new Book(7, "Operating Systems", "Abraham Silberschatz", true));
		library.addBook(new Book(8, "Computer Networks", "Andrew Tanenbaum", true));
		library.addBook(new Book(9, "Discrete Mathematics", "Kenneth Rosen", true));
		library.addBook(new Book(10, "Data Structures in Java", "Robert Lafore", true));
		
		library.addMember(new Student(1, "Shubham"));
		library.addMember(new Teacher(2, "Dr.Sagar"));

		Member student = library.getMemberById(1);
		Member teacher = library.getMemberById(2);

		student.borrowBook(library.getBookById(1));
		teacher.borrowBook(library.getBookById(2));

		student.getReport();
		teacher.getReport();

		int menuChoice;
		do {
			System.out.println("Library Management System");
			System.out.println("1. Show All Books");
			System.out.println("2. Show All Members");
			System.out.println("3. Search Books");
			System.out.println("4. Borrow book");
			System.out.println("5. Return book");
			System.out.println("6. Exit");
			System.out.println("Please enter your choice");

			menuChoice = scanner.nextInt();
			scanner.nextLine();

			switch (menuChoice) 
			{
			case 1 -> library.getAllBooks();
			case 2 -> library.showAllMembers();
			case 3 -> {
				System.out.println("Enter Book Name:");
				String title = scanner.nextLine();
				Book found = library.searchBook(title);
				if (found != null) 
				{
					System.out.println(title + " Book found");
				} else 
				{
					System.out.println(title + " Book not found");
				}
			}
			case 4 -> {
				System.out.print("Enter member Id: ");
				int memberId = scanner.nextInt();
				System.out.print("Enter Book Id: ");
				int bookId = scanner.nextInt();

				Member member = library.getMemberById(memberId);
				Book book = library.getBookById(bookId);

				if (member != null && book != null) 
				{
					member.borrowBook(book);
				} else 
				{
					System.out.println("Invalid member or book ID.");
				}
			}
			case 5 -> {
				System.out.print("Enter member ID: ");
				int memberId = scanner.nextInt();
				System.out.print("Enter book ID: ");
				int bookId = scanner.nextInt();

				Member member = library.getMemberById(memberId);
				Book book = library.getBookById(bookId);

				if (member != null && book != null) {
					member.returnBook(book);
				} else {
					System.out.println("Invalid member or book ID.");
				}
			}
			default -> System.out.println("Invalid choice!");
			}
		} while (menuChoice != 6);
		scanner.close();

	}

}
