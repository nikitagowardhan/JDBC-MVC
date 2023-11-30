package controller;

import java.sql.SQLException;

import model.Student;

public interface DaoImp {

	 int save(Student s)throws ClassNotFoundException, SQLException;
	 int update()throws ClassNotFoundException, SQLException;
	 int delete(int rollno)throws ClassNotFoundException, SQLException;
	 int show() throws ClassNotFoundException, SQLException;
	
}
