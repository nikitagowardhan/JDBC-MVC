package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;    
public class MenuView {  

	
	
	public MenuView() { 
	//Creating Frame
    JFrame f=new JFrame("Asterisc");  
    //Creating Lable
    JLabel l1 = new JLabel("Name : ");
    l1.setBounds(50,50, 100,30);
    JLabel l2 = new JLabel("City : ");
    l2.setBounds(50,100, 100,30);
    
    //Creating TextField
    JTextField tx1 = new  JTextField();
    tx1.setBounds(100,50,100,30);
    JTextField tx2 = new  JTextField();
    tx2.setBounds(100,100,100,30);
    
    //Creating Button
    JButton b=new JButton("Click Here");  
    b.setBounds(100,190,100,50);
    
    //Creating ActionListener
    b.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){
    		JTextArea area=new JTextArea("Welcome to Asterisc.");  
            area.setBounds(10,30, 200,200);
            f.add(area);  
            f.add(b);
    	           }
    	});  
    
    
    
    f.add(b);  
    f.add(l1);
    f.add(l2);
    f.add(tx1);
    f.add(tx2);
    f.setSize(400,400);
    f.setLayout(null);  
    f.setVisible(true); 
	}
}