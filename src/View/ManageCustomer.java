//Yuri Braga 2017141

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

import Model.Db;

/*
 * This class will hold the frame that enable the user to manage customer tasks.
 */

public class ManageCustomer extends JFrame implements ActionListener {


	// This Global variable enables to search the custmoerID on the database.

	JTextField customerid;   


	/*
	 * Creating my constructor to define my attributes and properties.
	 */

	public ManageCustomer() {
		//this.str=customerid.getText();

		this.setVisible(true);
		this.setSize(550,550);

		GridLayout grid = new GridLayout(5, 1); //creating a GridLayout to organise all the items.
		this.setLayout(grid);

		/*
		 * This Frame was dived into 5 panels.
		 * Each Panel has an object like JLabels, JtextField, JButtons.
		 */

		JPanel panel1 = new JPanel();
		this.add(panel1);

		JLabel label1 = new JLabel("MANAGE CUSTOMER");
		panel1.add(label1);
		label1.setFont(new Font("Serif", Font.PLAIN, 30));

		//####################################################################    


		JPanel panel2 = new JPanel();
		this.add(panel2);

		JLabel label2 = new JLabel("REGISTER OR SEARCH A CUSTOMER");
		panel2.add(label2);
		label2.setFont(new Font("Serif", Font.PLAIN, 20));
		//########################################################################
		JPanel panel3 = new JPanel();
		this.add(panel3);

		JLabel label3 = new JLabel("Customer ID");
		panel3.add(label3);
		label3.setFont(new Font("Serif", Font.PLAIN, 20));


		customerid = new JTextField(10); 
		panel3.add(customerid);

		//##########################################################################
		JPanel panel5 = new JPanel();
		this.add(panel5);

		GridLayout grid2 = new GridLayout(1, 3); //creating a GridLayout to organise all the itens.
		panel5.setLayout(grid2);



		JButton btn1 = new JButton("Search");
		panel5.add(btn1);
		btn1.setActionCommand("Search");
		btn1.addActionListener(this);

		JButton btn2 = new JButton("Register");
		panel5.add(btn2);
		btn2.setActionCommand("Register");
		btn2.addActionListener(this);

		JButton btn3 = new JButton("UPDATE");
		panel5.add(btn3);
		btn3.setActionCommand("update");
		btn3.addActionListener(this);
		//###################################################################       

		JPanel panel6 = new JPanel();
		this.add(panel6);

		JButton btn4 = new JButton("GO BACK");
		panel6.add(btn4);
		btn4.setActionCommand("GOBACK");
		btn4.addActionListener(this);

		//#####################################################################    

		this.validate();
		this.repaint();


	}

	// This method will define different actions according to the user decision.
	//If GOBACK button is selected. The MainPanel will be called.
	//If UPDATE is selected. The ID from the text field is then passed to a String which will 
	//be passed to the UpdateCustomer constructor from my UpdateCustmer class.
	// If Register is selected. Add new customer frame will be called.
	//If Search is selected.SearchCustomer panel will be called.

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("GOBACK")){
			this.dispose();
			MainPanel mypanel = new MainPanel();

		} else if (e.getActionCommand().equals("update")) {
			this.dispose();

			// This String will be sent to my UpdateCustomer class where will happen the encapsulation.
			String a = customerid.getText();
			UpdateCustomer newcustomer = new UpdateCustomer();



		} else if (e.getActionCommand().equals("Register")) {
			this.dispose();
			AddCustomerPanel mycustomer2 = new AddCustomerPanel();

		} else if (e.getActionCommand().equals("Search")){
			this.dispose();

			SearchCustomerPanel mypanel = new SearchCustomerPanel();








		}


	}







}
