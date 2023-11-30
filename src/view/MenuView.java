package view;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import controller.StudentDao;
import model.Student;

public class MenuView {
	
	public MenuView() throws ClassNotFoundException, SQLException
	{ 

	int rollno,a;
    String name,city;
    Scanner sc = new Scanner(System.in);
    boolean l=true;
	
    
    while(l)
	   {
	System.out.println("Welcome to Student Management System");
	System.out.println("1. INSERT");
	System.out.println("2. UPDATE");
	System.out.println("3. DELETE");
	System.out.println("4. SHOW  ");
	System.out.println("0. EXIT  ");
	
	System.out.println("Enter your choice : ");
	int ch = Integer.parseInt(sc.nextLine());
	
	StudentDao db = new StudentDao();
	
	switch(ch)
	{
	
	  case 1 :
		  
		  System.out.println("Insert your data");
		  //System.out.println("Enter Roll No : ");
		  //rollno = Integer.parseInt(sc.nextLine());
		  
		  System.out.println("Enter a Name  : ");
		  name = sc.nextLine();
		  
		  System.out.println("Enter a city : ");
		  city = sc.nextLine();
		  
		  Student s = new Student(name,city);
		  
		  a= db.save(s);
		  
		   
		  if(a>0)
			  System.out.println("Data inserted");
		  else
			  System.out.println("Data not inserted");
		
		  break;
	
	  case 2:
		  System.out.println("Update your data");
		  
			/*while(l){  
			  System.out.println("1. Roll No");
			  System.out.println("2. Name   ");
			  System.out.println("3. City   ");
			  System.out.println("0. Exit   ");
		      System.out.println("Enter the data that you want to Update:");
		      int ch1 = Integer.parseInt(sc.nextLine());
		      
		      switch(ch1)
		      {
		      case 1:
		    	  System.out.println("Enter a Roll No :");
			      int rollno1 = Integer.parseInt(sc.nextLine());
			      
			      String q="update register set rollno1=? where rollno=?";
			      PreparedStatement ps = c.prepareStatement(q);
			      ps.setInt(1, rollno1);
			      break;
			      
		      }
		      l=false;
			}*/
		  break;
		  
	  
	  case 3:
		  
		  System.out.println("Delete your data/n");
		  
	      
	    	  
	    	  System.out.println("Enter a Roll No : ");
	    	  rollno = Integer.parseInt(sc.nextLine());
	    	  
	    	  a= db.delete(rollno);
			  
	    	  
			  if(a>0)
				  System.out.println("Data deleted");
			  else
				  System.out.println("Data not deleted");
			
			  break;
	      
	      
	  case 4:
		 a= db.show();
		 
	    	break; 
	
		  
	  case 0:
		  l= false;
		  System.out.println("THANKU FOR USING .....!");
		  break;
		  
		  
		default:
			System.out.println("Plese choose correct option.....");
	    break;
	
	}
	}
	
	}
	
	}
    

