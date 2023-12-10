package view;


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;    
public class MenuView implements ActionListener {  

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
        Image icon = Toolkit.getDefaultToolkit().getImage("icon/image.png");    
  		f.setIconImage(icon); 
    
    
    
    //Creating TextField
    JTextField tx1 = new  JTextField();
    tx1.setBounds(100,50,100,30);
    JTextField tx2 = new  JTextField();
    tx2.setBounds(100,100,100,30);
    
    //Creating Button
    JButton b=new JButton("Click Here");  
    b.setBounds(100,190,100,50);
    
    JButton b1=new JButton("Click Here");  
    b1.setBounds(100,190,100,50);
  //Creating ActionListener
   

f.add(b);  
f.add(l1);
f.add(l2);
f.add(tx1);
f.add(tx2);
f.setSize(400,400);
f.setLayout(null);  
f.setVisible(true); 
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
   
