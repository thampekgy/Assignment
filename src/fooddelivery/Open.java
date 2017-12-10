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

public class Open extends JFrame implements ActionListener {

    private JButton jbtFoods = new JButton("Foods");
    private JButton jbtDrinks = new JButton("Drinks");
    private JButton jbtExit = new JButton("Exit");
    private JButton jbtMainMenu = new JButton("Main Menu");
    private JButton jbtBack = new JButton("Back");
    private JButton jborder = new JButton("Order Menu");

    public Open() {

        Container cont = getContentPane();
        cont.setLayout(new BorderLayout());
        cont.setBackground(Color.white);

        ImageIcon restpic = new ImageIcon("src/fooddelivery/Rest1.jpg");
        JLabel jlbl = new JLabel(restpic, SwingConstants.CENTER);
        jlbl.setForeground(Color.red);
        jlbl.setHorizontalTextPosition(SwingConstants.CENTER);
        jlbl.setVerticalTextPosition(SwingConstants.NORTH);
        jlbl.setIconTextGap(5);

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 5, 10, 10));
        p1.setBackground(Color.white);
        p1.add(jlbl, BorderLayout.NORTH);

        cont.add(p1, BorderLayout.NORTH);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout());
        p2.setBackground(Color.white);
        p2.add(jbtFoods);
        p2.add(jbtDrinks);
        p2.add(jborder);
        p2.add(jbtMainMenu);
        p2.add(jbtExit);
        p2.setBorder(new TitledBorder("SelecTion Button"));
        Border lineborder = new LineBorder(Color.GREEN, 2);
        cont.add(p2, BorderLayout.SOUTH);

        jbtFoods.addActionListener(this);
        jbtDrinks.addActionListener(this);
        jborder.addActionListener(this);
        jbtExit.addActionListener(this);
        jbtMainMenu.addActionListener(this);
        jbtBack.addActionListener(this);
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
        if (e.getSource() == jbtFoods) {
            Food1 frame = new Food1();
            frame.setTitle("Foods");
            frame.setSize(750, 500);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }

        if (e.getSource() == jbtDrinks){
		Drinks1 frame = new Drinks1();
		frame.setTitle("Drinks");
		frame.setSize(550,500);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	 	}
       /* if (e.getSource() == jborder){
		ordermenu frame = new ordermenu();
		frame.pack();
		frame.setTitle("Ordering System");
		frame.setSize(1100, 650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		this.dispose();
        }*/
	 	
        if (e.getSource() == jbtBack) {
            ViewRestaurant frame = new ViewRestaurant();
            frame.setTitle("Restaurant View");
            frame.setSize(850, 600);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

    }

    public static void main(String[] args) {
        Open frame = new Open();
        frame.setTitle("Food Menu");
        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
    }
}
