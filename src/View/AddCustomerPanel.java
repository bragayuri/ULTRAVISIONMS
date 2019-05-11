
// Yuri Braga 2017141

// This class belongs to my View packet.

package View;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



import Controller.Actions;

import User.Customer;

/*
 * The responsibility of this class is to ensure a frame is set and the User can register a new Customer.
 * This class is extending JFrame and Implementing the ActionListener interface.
 */


public class AddCustomerPanel extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Here you can find global some attributes and Classes that will bring the frame and its
	// functionality together.


	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JTextField t7;
	JTextField t8;
	JTextField t9;
	JTextField t10;
	JTextField t11;
	JComboBox<String> combo;
	JLabel total;

	Actions action = new Actions();




	// My constructor will start to build the frame and set some attributes to it.

	public AddCustomerPanel() {
		this.setVisible(true);
		this.setSize(600,600);






		GridLayout mygrid = new GridLayout(14,1);
		this.setLayout(mygrid);

		/*
		 *#########################################
		 */
		JPanel one = new JPanel();
		this.add(one);

		JLabel mylabel = new JLabel("ADD NEW CUSTOMER");
		one.add(mylabel);
		mylabel.setFont(new Font("Serif", Font.PLAIN, 30));

		/*
		 * ##########################################
		 */



		JPanel three = new JPanel();
		this.add(three);

		JLabel l2 = new JLabel("MEMBERSHIP N");
		three.add(l2);

		t2= new JTextField(20);
		three.add(t2);
		/*
		 /*
		 * ##############################################
		 */

		JPanel four = new JPanel();
		this.add(four);

		JLabel l3 = new JLabel("PLAN TYPE");
		four.add(l3);

		String[] items = {"MusicLovers (ML)", "VideoLovers (VL)", "TvLover (TV)", " PREMIUM (PR)"};

		combo = new JComboBox<>(items);
		four.add(combo);



		/*
		 * #################################################
		 */

		JPanel five = new JPanel();
		this.add(five);

		JLabel l4 = new JLabel("POINTS");
		five.add(l4);

		t4= new JTextField(20);
		five.add(t4);

		/*
		 * ####################################################
		 */

		JPanel six = new JPanel();
		this.add(six);

		JLabel l5 = new JLabel("EMAIL");
		six.add(l5);

		t5= new JTextField(20);
		six.add(t5);

		/*
		 * ##########################################
		 */

		JPanel seven = new JPanel();
		this.add(seven);

		JLabel l6 = new JLabel("NAME");
		seven.add(l6);

		t6= new JTextField(20);
		seven.add(t6);

		/*
		 * ############################################
		 */

		JPanel eight = new JPanel();
		this.add(eight);

		JLabel l7 = new JLabel("SURNAME");
		eight.add(l7);

		t7= new JTextField(20);
		eight.add(t7);

		/*
		 * #############################################
		 */
		JPanel nine = new JPanel();
		this.add(nine);

		JLabel l8 = new JLabel("PHONE");
		nine.add(l8);

		t8= new JTextField(20);
		nine.add(t8);

		/*
		 * ################################################
		 */

		JPanel ten = new JPanel();
		this.add(ten);

		JLabel l9 = new JLabel("GENDER");
		ten.add(l9);

		t9= new JTextField(20);
		ten.add(t9);

		/*
		 * ##################################################
		 */
		JPanel eleven = new JPanel();
		this.add(eleven);

		JLabel l10 = new JLabel("RENTAL STATUS");
		eleven.add(l10);

		t10= new JTextField(20);
		eleven.add(t10);

		/*
		 * ###################################################
		 */
		JPanel twelve = new JPanel();
		this.add(twelve);

		JLabel l11 = new JLabel("FREE RENTAL");
		twelve.add(l11);

		t11= new JTextField(20);
		twelve.add(t11);


		/*
		 * ###############################################################
		 */

		JPanel fourteen = new JPanel();
		this.add(fourteen);

		JPanel newone = new JPanel();
		this.add(newone);

		total = new JLabel ("0 Number Registered");
		newone.add(total);

		/*
		 * At this stage my frame is done and I will add some buttons to it.
		 * The button`s functionality will Register,Go Back or direct to the Main Panel.
		 */

		JButton btn1 = new JButton("REGISTER");
		fourteen.add(btn1);
		btn1.setActionCommand("REGISTER");
		btn1.addActionListener(this);



		JButton btn2 = new JButton("GO BACK");
		fourteen.add(btn2);
		btn2.setActionCommand("GOBACK");
		btn2.addActionListener(this);


		JButton btn3 = new JButton("HOME");
		fourteen.add(btn3);











		this.validate();
		this.repaint();

	}

	/*
	 *  The ActionPerformed method will ensure the text typed will be passed to a String.
	 *  The my Customer Class will receive the values and finish the Transaction in there.
	 *  The Actions class will be responsible to add the new user to an ArrayList.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("REGISTER")) {







			String b = t2.getText();
			String c = (String) combo.getSelectedItem();
			String d = t4.getText();
			String E = t5.getText();
			String f = t6.getText();
			String g = t7.getText();
			String h = t8.getText();
			String i = t9.getText();
			String j = t10.getText();
			String k = t11.getText();

			//Instance of my Customer class receving the String values.

			Customer newcustomer = new Customer (b,c,d,E,f,g,h,i,j,k);

			// Actions class will add the new user to an ArrayList
			action.cadastraCustomer(newcustomer);

			//This will display the amount of registered Users saved on an ArrayList.
			total.setText(action.numberOfContacts()+" Registred New Users");

			JOptionPane.showMessageDialog(this, "Register Completed!");




			// This is a test to be displayed on the Console if everything works.
			System.out.println(newcustomer);

			//This will erase the values of my JTextField once transaction is done.
			t2.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");
			t11.setText("");






			/*
			 * The else if will direct the user to the previous page in case GOBACK button is pressed.         
			 */

		}else if(e.getActionCommand().equals("GOBACK")) {

			ManageCustomer myC = new ManageCustomer();
			this.dispose();

		}



	}





}
