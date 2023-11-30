package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Student;



 public class StudentDao implements DaoImp  {

	
	private String url = "jdbc:mysql://localhost:3306/mydb";
	private String uname = "root";
	String q;
	private String upass = "abc123";
    private  String driver = "com.mysql.jdbc.Driver";
    
   Connection getConnect() throws ClassNotFoundException, SQLException
    {
    	Class.forName(driver);
		Connection c = DriverManager.getConnection(url, uname, upass);
    	
		return c;
    }

@Override
public int save(Student s) throws ClassNotFoundException, SQLException {
	
	Connection c=getConnect();
    q ="insert into db_tbl (name,city) values(?,?)";
    PreparedStatement p =c.prepareStatement(q);
	p.setString(1, s.getName());
	p.setString(2, s.getCity());
	return p.executeUpdate();
}

@Override
public int update() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int delete(int rollno) throws ClassNotFoundException, SQLException {
	
	Connection c=getConnect();
	Statement s = c.createStatement();
	 q = "delete from db_tbl where rollno = "+rollno; 
	
	return s.executeUpdate(q);
}

@Override
public int show() throws ClassNotFoundException, SQLException {
	Connection c=getConnect();
	Statement s = c.createStatement();
	q="Select *from db_tbl";
	  ResultSet rs = s.executeQuery(q);
	  while(rs.next())
	  {
		  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	  }
	  
	return 0;
}


	

}
