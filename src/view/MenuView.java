package view;

import javax.swing.*;    
public class MenuView {  

	public MenuView() {  
    JFrame f=new JFrame("Asterisc");  
     
    
    JLabel l1 = new JLabel("Name : ");
    l1.setBounds(50,50, 100,30);
    
    JLabel l2 = new JLabel("City : ");
    l2.setBounds(50,100, 100,30);
    f.add(l1);
    f.add(l2);
    f.setSize(400,400);
    f.setLayout(null);  
    f.setVisible(true); 
	}
}