/*Write program for maintaining book record of library .
use ArrayList Class to hold an multiple book record and display all book record using iterator .
b) traverse arraylist and store each book record in class object and display book name*/
package Assignment_8;
import java.util.*;
class library
{
	String title;
	String author;
	double price;
	library(String t,String a,double p)
	{
		this.title=t;
		this.author=a;
		this.price=p;
	}
	public String toString()
	{
		return ("Title - "+title+" Author - "+author+" Price - "+price );
	}
}
public class ArrayLibrary {

	public static void main(String[] args) {
		ArrayList<library> arr=new ArrayList<library>();
		Scanner s=new Scanner(System.in);
		String title;
		String author;
		double price;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Book title");
			title=s.next();
			System.out.println("Enter Book Author");
			author=s.next();
			System.out.println("Enter Book Price");
			price=s.nextDouble();
			library l=new library(title, author, price);
			arr.add(l);
		}
		Iterator j= arr.iterator();
		while(j.hasNext())
		{
			System.out.println(" "+j.next());
		}
	}

}
