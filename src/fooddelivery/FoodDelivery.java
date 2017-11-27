/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class FoodDelivery extends JFrame implements ActionListener{

    private JButton jbabout = new JButton("About Us");
    private JButton jbexit = new JButton("Exit");
    private JButton jbRestaurant = new JButton("Restaurant");

    
    public FoodDelivery(){
        Container cont=getContentPane();
        cont.setLayout(new BorderLayout());
        cont.setBackground(Color.LIGHT_GRAY);
        
        ImageIcon icon = new ImageIcon("src/Images/Logo.jpg");
        JLabel jlbl = new JLabel("Fastest Delivery Sdn Bhd", icon, SwingConstants.CENTER);
        jlbl.setForeground(Color.BLACK);
        jlbl.setFont(new Font("Times New Roman",5,24));
        jlbl.setHorizontalTextPosition(SwingConstants.CENTER);
    	jlbl.setVerticalTextPosition(SwingConstants.NORTH);
    	jlbl.setIconTextGap(5);
        
        JPanel p1=new JPanel();
		p1.setLayout(new FlowLayout());
		p1.setBackground(Color.PINK);
		p1.add(jlbl, BorderLayout.NORTH);
		
		cont.add(p1,BorderLayout.NORTH);			
		
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout());
		p2.setBackground(Color.PINK);	
		p2.add(jbabout);
		p2.add(jbRestaurant);
		
		p2.add(jbexit);	
		p2.setBorder(new TitledBorder("Selection Button"));
		Border lineborder = new LineBorder(Color.GREEN,2);
		cont.add(p2,BorderLayout.SOUTH);	
		
                jbRestaurant.addActionListener(this);
		
		jbabout.addActionListener(this);
		jbexit.addActionListener(this);
    }
public void actionPerformed(ActionEvent e){
	 	
	 	if (e.getSource() == jbRestaurant){
		ViewRestaurant frame = new ViewRestaurant();
		frame.setTitle("Restaurant View");
		frame.setSize(850,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		this.dispose();
	 	}
	 	
	 
	 	
	 	if (e.getSource() == jbabout){
		About frame=new About();
		frame.setTitle("About");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,500);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);		
                this.dispose();
	 	}
		
		if (e.getSource() == jbexit){
	 			int confirm=JOptionPane.showConfirmDialog(null,"Are you sure to exit?","Exit ",JOptionPane.YES_NO_OPTION);
		 	
		 		if(confirm==0)
		 			System.exit(0);
	 	}
	}
    
    
    public static void main(String[] args) {
        FoodDelivery frame = new FoodDelivery();
        
        frame.setTitle("Food Delivery Menu ");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600,500);
	frame.setVisible(true);
	frame.setResizable(true);
	frame.setLocationRelativeTo(null);
    }
    
}
