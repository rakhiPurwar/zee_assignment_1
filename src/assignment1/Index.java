package assignment1;
import java.util.*;
import java.sql.*;
public class Index {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		System.out.println("MENU");
		System.out.println("1: Login");
		System.out.println("2: Register");
		System.out.println("3: Exit");
	    Scanner sc = new Scanner(System.in);
	    int ch = sc.nextInt();
	    Account ac = new Account();
	    if(ch == 1)
	    {
	      ac.login();
	    }
	    else if(ch == 2)
	    {
	    	ac.register();
	    }
	    else
	    	return;
	    
	}
}
