/*
 * 1  create file one.txt having  welcome message
 * 2 create another file two.txt having java definition
 * 3 create class  Data having readdata method with string arguement that read data from  file  and 
 	 display it on console character by character after 1000 milliseconds of pause
 * 4 create 2  thread class ThreadRead1,ThreadRead2 both calls above class readdata method
	 in run method
 * 5 create another class Main Class reading having main method create object of both thread class*/
package assignment_9;
import java.util.*;
import java.io.*;
class Threadread1 extends Thread
{
	Data data;
	String filename;
	Threadread1(Data data,String filename)
	{
		this.data=data;
		this.filename=filename;
	}
	public void run()
	{
		data.readdata(filename);
	}
}
class Threadread2 extends Thread
{
	Data data;
	String filename;
	Threadread2(Data data, String filename)
	{
		this.data=data;
		this.filename=filename;
	}
	public void run()
	{
		data.readdata(filename);
	}
}
class Data{
	void readdata(String filename)
	{
		try{
			BufferedReader b=new BufferedReader(new FileReader(filename));
			String r;
			int ch;			
			while((ch=b.read())!=-1)
			{
				System.out.print((char)ch);
				Thread.sleep(1000);
			}
		}catch(Exception d) {}
	}
}
public class Main {
	
	public static void main(String[] args) {
		
		Data d=new Data();
		Threadread1 tr1=new Threadread1(d,"one.txt");
		Threadread2 tr2=new Threadread2(d, "two.txt");
		tr1.start();
		tr2.start();
		
	}

}
