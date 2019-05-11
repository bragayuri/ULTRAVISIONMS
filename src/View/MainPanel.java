
// Yuri Braga Student Number: 2017141

package View;

import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

/* 
 * This is my Main Panel Class. This Class is responsible for the visual aspects of the main panel.
 * 
 */

/*
 * Applying the object oriented programming where MainPanel is an abstraction of my JFrame Class.
 * Also the MainPanel class implements the interface ActionListener.
 */
public class MainPanel extends JFrame implements ActionListener {

	/*
	 * This constructor will start defining attributes of my frame.
	 */
	public MainPanel() {
		this.setVisible(true);
		this.setSize(600, 600);

		/*
		 * creating a GridLayout to organise all the items.
		 */
		GridLayout grid = new GridLayout(4, 1);
		this.setLayout(grid);

		/*
		 * creating a container to my frame.
		 */

		JPanel one = new JPanel();
		this.add(one);

		JLabel welcome = new JLabel(" UltraVision Management System");// Label that is the Title of my frame.
		one.add(welcome);// adding my Label to my Panel.
		welcome.setFont(new Font("Serif", Font.PLAIN, 30));// setting a new Font to the Label.
		welcome.setForeground(Color.RED);// Setting a new colour to my Label.

		// ##################################################################################################

		JPanel two = new JPanel();// creating a container to my frame, in this case it will keep my Name option
									// for login.
		this.add(two);

		GridLayout grid6 = new GridLayout(1, 3); // creating a GridLayout to organise all the itens.
		two.setLayout(grid6);

		/*
		 * Creating some JButtons.
		 */

		JButton btn1 = new JButton("TITLES");
		two.add(btn1);
		btn1.setActionCommand("Register");
		btn1.addActionListener(this);

		JButton btn2 = new JButton("Customer");
		two.add(btn2);
		btn2.setActionCommand("Customer");
		btn2.addActionListener(this);

		JButton btn3 = new JButton("RENTALS");
		two.add(btn3);
		btn3.setActionCommand("Media");
		btn3.addActionListener(this);

		// ######################################################################################################
		JPanel three = new JPanel();
		this.add(three);

		GridLayout grid2 = new GridLayout(1, 2); // creating a GridLayout to organise all the items.
		three.setLayout(grid2);

		// ######################################################################################################

		JPanel left = new JPanel();
		three.add(left);

		GridLayout grid3 = new GridLayout(4, 1); // creating a GridLayout to organise all the items.
		left.setLayout(grid3);

		// ######################################################################################################

		JPanel right = new JPanel();
		three.add(right);

		JLabel l1 = new JLabel("Quick Media Management");
		left.add(l1);

		;
		JLabel quick = new JLabel("Enter Title Id number");
		left.add(quick);

		JTextField idnumber = new JTextField(10);
		left.add(idnumber);

		JPanel newpanel = new JPanel();
		left.add(newpanel);

		JButton searchbtn = new JButton("Search");
		newpanel.add(searchbtn);
		searchbtn.setActionCommand("SearchTitle");
		searchbtn.addActionListener(this);

		JButton rentbtn = new JButton("Rent");
		newpanel.add(rentbtn);

		JButton returnbtn = new JButton("Return");
		newpanel.add(returnbtn);

		// ###########################################################
		GridLayout grid4 = new GridLayout(5, 1); // creating a GridLayout to organise all the items.
		right.setLayout(grid4);

		JPanel right1 = new JPanel();
		right.add(right1);

		JPanel right2 = new JPanel();
		right.add(right2);

		JPanel right3 = new JPanel();
		right.add(right3);

		JPanel right4 = new JPanel();
		right.add(right4);

		JPanel right5 = new JPanel();
		right.add(right5);

		JLabel quick2 = new JLabel("Quick subscription check");
		right1.add(quick2);

		JLabel quick3 = new JLabel("Enter Customer ID number");
		right2.add(quick3);

		JLabel quick6 = new JLabel("Id");
		right3.add(quick6);

		JTextField customeridtxt = new JTextField(10);
		right3.add(customeridtxt);

		JLabel quick5 = new JLabel("Email");
		right4.add(quick5);

		JTextField customemailtxt = new JTextField(10);
		right4.add(customemailtxt);

		JButton searchbtn2 = new JButton("Search");
		right5.add(searchbtn2);
		searchbtn2.setActionCommand("Search");
		searchbtn2.addActionListener(this);

		this.validate();
		this.repaint();

	}

	// This method will define which action will be taken according to the user
	// decision.
	// If user chooses Customer.The program will open the ManageCustomer class.
	// If user chooses Media. The Program will open ManageARental class.
	// If user chooses Register. The Program will open ManageTitle class.

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("Customer")) {
			this.dispose();

			ManageCustomer nc = new ManageCustomer();

		} else if ((e.getActionCommand().equals("Media"))) {
			this.dispose();

			ManageARental nr = new ManageARental();

		} else if ((e.getActionCommand().equals("Register"))) {
			this.dispose();

			ManageTitle mt = new ManageTitle();

		} else if ((e.getActionCommand().equals("Search"))) {
			this.dispose();
			
			SearchCustomerPanel np = new SearchCustomerPanel();
		}


	}

}
