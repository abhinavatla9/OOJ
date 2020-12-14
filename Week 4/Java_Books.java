import java.util.*;

class Book
{
	int bookid, no_of_pages, year_of_pub;
	double price;
	String booktitle, author, publisher;
	void Book_in()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter book name");
		booktitle = sn.nextLine();
		System.out.println("Enter book id");
		bookid = sn.nextInt();
		String k = sn.nextLine();
		System.out.println("Enter author name");
		author = sn.nextLine();
		System.out.println("Enter Publisher name");
		publisher = sn.nextLine();
		System.out.println("Enter year of publication");
		year_of_pub = sn.nextInt();
		System.out.println("Enter the price");
		price = sn.nextDouble();
		System.out.println("Enter number of pages");
		no_of_pages = sn.nextInt();
	}

	void details()
	{
		System.out.println("Book title:	"+booktitle);
		System.out.println("Book ID:	"+bookid);
		System.out.println("Author:	"+author);
		System.out.println("Publisher:	"+publisher);
		System.out.println("Price:	"+price);
		System.out.println("Number of pages:	"+no_of_pages);
		System.out.println("Year of publication:	"+year_of_pub);
	}

	void ifauthor(String aut)
	{
		if(aut==author)
		{
			details();
		}
	}

	double bookcost()
	{
		return price;
	}

	int pages()
	{
		return no_of_pages;
	}
}

class book
{
	public static void main(String[] args)
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter details of book 1");
		Book b1 = new Book();
		b1.Book_in();
		System.out.println("Enter details of book 2");
		Book b2 = new Book();
		b2.Book_in();
		System.out.println("Enter details of book 3");
		Book b3 = new Book();
		b3.Book_in();
		System.out.println("Enter the name of author");
		String s = sn.nextLine();
		b1.ifauthor(s);
		b2.ifauthor(s);
		b3.ifauthor(s);
		if(b1.price>b2.price)
		{
			if(b1.price>b3.price)
			{
				b1.details();
			}
			else
				b3.details();
		}
		else
		{
			if(b2.price>b3.price)
				b2.details();
			else
				b3.details();
		}
		int count = 0;
		if(b1.year_of_pub == 2020)
			count += 1;
		if(b2.year_of_pub == 2020)
			count += 1;
		if(b3.year_of_pub == 2020)
			count += 1;
		System.out.println("Number of books published in 2020 is:	"+count);
		if(b1.pages()>b2.pages())
		{
			if(b1.pages()>b3.pages())
			{
				b1.details();
			}
			else
				b3.details();
		}
		else
		{
			if(b2.pages()>b3.pages())
				b2.details();
			else
				b3.details();
		}
	}
}