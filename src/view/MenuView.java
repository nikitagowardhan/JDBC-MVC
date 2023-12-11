package view;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.StudentDao;
import model.Student;    
public class MenuView  {  

public MenuView()   
{ 
	//Creating Frame
JFrame f=new JFrame("Asterisc");  
//Creating Lable
JLabel l1 = new JLabel("Name : ");
l1.setBounds(50,50, 100,30);
JLabel l2 = new JLabel("City : ");
l2.setBounds(50,100, 100,30);

 //Creating icon
ImageIcon img = new ImageIcon("E:\\myjava\\JDBC-MVC2\\icon");
f.setIconImage(img.getImage());



//Creating TextField
JTextField tx1 = new  JTextField();
tx1.setBounds(100,50,100,30);
JTextField tx2 = new  JTextField();
tx2.setBounds(100,100,100,30);

//Creating Button
JButton b=new JButton("Click Here");  
b.setBounds(100,190,100,50);

JLabel l3 = new JLabel("Result : ");
l3.setBounds(230,200,100,30);

//Creating ActionListener
b.addActionListener(new ActionListener() 
   {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	
	    Student s = new Student(tx1.getText(),tx2.getText());
	
	     try {
			int a = new StudentDao().save(s);
		
	     if(a>0)
	     {
	    	 l3.setText("Data Inserted ! ");
		     }
		     
		     } catch (ClassNotFoundException  | SQLException e) {
				
				e.printStackTrace();
			} 
		}

	});
	   		   
		   
		   
		   
f.add(b);  
f.add(l1);
f.add(l2);
f.add(l3);
f.add(tx1);
f.add(tx2);
f.setSize(400,400);
f.setLayout(null);  
f.setVisible(true);
Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
f.setLocation(dim.width/2-f.getSize().width/2,dim.height/2-f.getSize().height/2);

}


}
   
