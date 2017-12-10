/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class ViewRestaurant extends JFrame implements ActionListener {

    private ImageIcon RestaurantImage1 = new ImageIcon("src/Images/mamak.jpg");
    private ImageIcon RestaurantImage2 = new ImageIcon("src/Images/bighug.jpg");
    private ImageIcon RestaurantImage3 = new ImageIcon("src/Images/sushi.jpg");
    private ImageIcon RestaurantImage4 = new ImageIcon("src/Images/kopitiam.jpg");
    private JButton jbtBack = new JButton("Back");
    private JButton jbtExit = new JButton("Exit");
    private JButton jbtMainMenu = new JButton("Main Menu");
    private JLabel RestaurantLabelChoice = new JLabel("List of the Restaurant ");
    private JButton jbtChoc1 = new JButton("Restaurant Al-Fariz ");
    private JButton jbtChoc2 = new JButton("Big Hug Restaurant");
    private JButton jbtChoc3 = new JButton("Sushi Mentai ");
    private JButton jbtChoc4 = new JButton("Chong Hwa Curry Laksa Restaurant");
    private JButton jbRestaurant = new JButton("Restaurant");

    public ViewRestaurant() {
        Container cont = getContentPane();
        cont.setLayout(new BorderLayout(5, 5));
        cont.setBackground(Color.white);

        cont.add(RestaurantLabelChoice, BorderLayout.NORTH);

        JPanel pA = new JPanel(new GridLayout(2, 3, 5, 5));

        jbtChoc1.setIcon(RestaurantImage1);
        pA.add(jbtChoc1);
        jbtChoc1.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc1.setHorizontalTextPosition(AbstractButton.CENTER);
        jbtChoc2.setIcon(RestaurantImage2);
        pA.add(jbtChoc2);
        jbtChoc2.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc2.setHorizontalTextPosition(AbstractButton.CENTER);
        jbtChoc3.setIcon(RestaurantImage3);
        pA.add(jbtChoc3);
        jbtChoc3.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc3.setHorizontalTextPosition(AbstractButton.CENTER);
        jbtChoc4.setIcon(RestaurantImage4);
        pA.add(jbtChoc4);
        jbtChoc4.setVerticalTextPosition(AbstractButton.BOTTOM);
        jbtChoc4.setHorizontalTextPosition(AbstractButton.CENTER);
        cont.add(pA, BorderLayout.CENTER);
        
        JPanel pB = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pB.setBackground(Color.white);
        pB.add(jbtBack);
        pB.add(jbtExit);
        cont.add(pB, BorderLayout.SOUTH);

        jbtChoc1.addActionListener(this);
        jbtChoc2.addActionListener(this);
        jbtChoc3.addActionListener(this);
        jbtChoc4.addActionListener(this);
        jbtBack.addActionListener(this);
        jbtExit.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jbtMainMenu) {
            FoodDelivery frame = new FoodDelivery();
            frame.setTitle("MAIN ");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(650, 500);
            frame.setVisible(true);
            frame.setResizable(true);
            frame.setLocationRelativeTo(null);
            this.dispose();
        }
        if (e.getSource() == jbtBack) {
            FoodDelivery frame = new FoodDelivery();
            frame.setTitle("MAIN ");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setVisible(true);
            frame.setResizable(true);
            frame.setLocationRelativeTo(null);
            this.dispose();
        }
        if (e.getSource() == jbtExit) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to exit?", "Exit ", JOptionPane.YES_NO_OPTION);

            if (confirm == 0) {
                System.exit(0);
            }

        }
        if(e.getSource() ==jbtChoc1)
		{
				Open frame = new Open();
				frame.setTitle("Food Menu");
				frame.setSize(750,500);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.dispose();
		}
		if(e.getSource() ==jbtChoc2)
		{
				Open2 frame = new Open2();
				frame.setTitle("Food Menu");
				frame.setSize(750,500);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.dispose();
		}
		/*if(e.getSource() ==jbtChoc3)
		{
				Open frame = Open();
				frame.setTitle("Food Menu");
				frame.setSize(750,500);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.dispose();
		}*/
		/*if(e.getSource() ==jbtChoc4)
		{
				Open frame = new Open();
				frame.setTitle("Food Menu");
				frame.setSize(750,500);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.dispose();
		}*/
    }

    public static void main(String[] args) {
        ViewRestaurant frame = new ViewRestaurant();
        frame.setTitle("Restaurant");
        frame.setSize(850, 600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
