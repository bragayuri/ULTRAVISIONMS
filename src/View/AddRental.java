package View;




import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.Db;
import System.Rental;
import User.Customer;

public class AddRental extends JFrame implements ActionListener {
	
	 JTextField t1;
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
	 JFrame f;

	
	public AddRental() {
		
		welcomeframe2();
		
		
		
		
		this.setVisible(true);
		this.setSize(600,600);
		
		
		
		
		
		
		GridLayout mygrid = new GridLayout(13,1);
		this.setLayout(mygrid);
		
		/*
		 *#########################################
		 */
		 JPanel one = new JPanel();
		 this.add(one);
		 
		 JLabel mylabel = new JLabel("Start a Rental");
		 one.add(mylabel);
		 mylabel.setFont(new Font("Serif", Font.PLAIN, 30));
		 
		 /*
		  * ##########################################
		  */

		 JPanel two = new JPanel();
		 this.add(two);
		 
		 JLabel l1 = new JLabel("CustID");
		 two.add(l1);
		 
		  t1= new JTextField(20);
		 two.add(t1);
		/*
		 * ############################################# 
		 */
		 
		 JPanel three = new JPanel();
		 this.add(three);
		 
		 JLabel l2 = new JLabel("MEMBERSHIP N");
		 three.add(l2);
		 
		  t2= new JTextField(20);
		 three.add(t2);
		 
		 /*
		  * ##############################################
		  */
		 
		 JPanel four = new JPanel();
		 this.add(four);
		 
		 JLabel l3 = new JLabel("TITLE ID");
		 four.add(l3);
		 
		  t3= new JTextField(20);
		 four.add(t3);
		 
		 /*
		  * #################################################
		  */
		 
		 JPanel five = new JPanel();
		 this.add(five);
		 
		 JLabel l4 = new JLabel("TITLE NAME");
		 five.add(l4);
		 
		 t4= new JTextField(20);
		 five.add(t4);
		 
		 /*
		  * ####################################################
		  */
		 
		 JPanel six = new JPanel();
		 this.add(six);
		 
		 JLabel l5 = new JLabel("START DATE");
		 six.add(l5);
		 
		 t5= new JTextField(20);
		 six.add(t5);
		 
		 /*
		  * ##########################################
		  */
		 
		 JPanel seven = new JPanel();
		 this.add(seven);
		 
		 JLabel l6 = new JLabel("RETURN DATE");
		 seven.add(l6);
		 
		t6= new JTextField(20);
		 seven.add(t6);
		 
		 /*
		  * ############################################
		  */
		 
		 JPanel eight = new JPanel();
		 this.add(eight);
		 
		 JLabel l7 = new JLabel("PAID");
		 eight.add(l7);
		 
		 t7= new JTextField(20);
		 eight.add(t7);
		 
		 /*
		  * #############################################
		  */
		 JPanel nine = new JPanel();
		this.add(nine);
		
		JLabel l8 = new JLabel("Extra Fee");
		 nine.add(l8);
		 
		 t8= new JTextField(20);
		 nine.add(t8);
		 
		 /*
		  * ################################################
		  */
		 
		 JPanel ten = new JPanel();
		 this.add(ten);
		 
		 JLabel l9 = new JLabel("Rental Final Price");
		 ten.add(l9);
		 
		 t9= new JTextField(20);
		 ten.add(t9);
		 
		 /*
		  * ##################################################
		  */
		 JPanel eleven = new JPanel();
		 this.add(eleven);
		 
		 JLabel l10 = new JLabel("RENTAL Period");
		 eleven.add(l10);
		 
		  t10= new JTextField(20);
		 eleven.add(t10);
		 
		 /*
		  * ###################################################
		  */
		
		 
		 JPanel fourteen = new JPanel();
		 this.add(fourteen);
		 
		 
		 
		 JButton btn1 = new JButton("REGISTER");
		 fourteen.add(btn1);
		 btn1.setActionCommand("REGISTER");
	     btn1.addActionListener(this);
		 
		 
		 // for this JButton I will apply an Anonymous class to call my actionPerformed method.
		 JButton btn2 = new JButton("GO BACK");
		 fourteen.add(btn2);
		 btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ManageARental myrental = new ManageARental();
					}
				
			});
		 
		 
		 JButton btn3 = new JButton("HOME");
		 fourteen.add(btn3);
		 
		 
		 
		
		 
		
		
		
		
		
		
		this.validate();
		this.repaint();
		
	}
	
	// This method will control the access of a customer.
	
	public void welcomeframe2() {
		 String[] items = {"Music", "BoxSet", "Live Concert Videos", "Movie"};
		 
	        JComboBox<String> combo = new JComboBox<>(items);
	        
	        JTextField field1 = new JTextField("");
	        JTextField field2 = new JTextField("");
	        JTextField field3 = new JTextField("");
	        
	        JPanel panel = new JPanel(new GridLayout(0, 1));
	        panel.add(new JLabel("Enter Media type"));
	        panel.add(combo);
	        panel.add(new JLabel("Enter Customer ID:"));
	        panel.add(field1);
	        panel.add(new JLabel("Enter Loyalty Card:"));
	        panel.add(field2);
	        panel.add(new JLabel("Enter Title ID:"));
	        panel.add(field3);
	        
	        int result = JOptionPane.showConfirmDialog(null, panel, "MemberShip Card Control",
	           
	        		JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
	        
	        if (result == JOptionPane.OK_OPTION) {
	            System.out.println(combo.getSelectedItem()
	                + " " + field1.getText()
	                + " " + field2.getText());
	           
	            String message = "Select * from customer where idCustomer ='" + field1.getText() + "' and MembershipCard='" + field2.getText() + "'";
	             Db mydb = new Db();
	             mydb.selectdb(message);
	            ;
	        } else {
	            System.out.println("Cancelled");
	        }
	    }

	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getActionCommand().equals("REGISTER")) {
	              
			 
			 String a =t1.getText();
	              String b = t2.getText();
	              String c = t3.getText();
	              String d = t4.getText();
	              String E = t5.getText();
	              String f = t6.getText();
	              String g = t7.getText();
	              String h = t8.getText();
	              String i = t9.getText();
	              String j = t10.getText();
	              String aone = null;
	              
	              new Rental(a,b,c,d,E,f,g,h,i,j,aone );
	              
	              
	              
	               // String message = "INSERT INTO `ultravision`.`customer` (`idCustomer`, `MembershipCard`,`PlanType`,`Points`,`email`,`Name`,`Surname`,`Phone`,`Gender`,`RentalS`,`FreeRental`) "
	                	//	+ "VALUES ('" + a + "','" + b + "','" + c + "', '" + d + "', '" + E + "','" + f + "','" + g + "','" + h + "','" + i + "','" + j + "', '" + k + "');";

	              
	             // Db mydb = new Db();
	             // mydb.DbInsertCustomer(message);
	           
	              
	              
	            
		 }else if(e.getActionCommand().equals("GOBACK")) {
			
			 ManageCustomer myC = new ManageCustomer();
			 this.dispose();
			 
		 }
	            
	            
		
	}
		 public void DbConnection(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9, String t10, String t11) {
		        try {
		// Load the database driver

		            //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		            String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
		            String user = "root";
		            String password3 = "rootroot";

		            String query = "INSERT INTO `ultravision`.`customer` (`idCustomer`, `MembershipCard`,`PlanType`,`Points`,`email`,`Name`,`Surname`,`Phone`,`Gender`,`RentalS`,`FreeRental`) VALUES ('" + t1 + "','" + t2 + "','" + t3 + "', '" + t4 + "', '" + t5 + "','" + t6 + "','" + t7 + "','" + t8 + "','" + t9 + "','" + t10 + "', '" + t11 + "');";

		// Get a connection to the database
		            Connection conn = DriverManager.getConnection(dbServer, user, password3);

		// Get a statement from the connection
		            Statement stmt = conn.createStatement();

		// Execute the query
		            stmt.execute(query);
		            stmt.close();
		            conn.close();

		// Close the result set, statement and the connection
		        } catch (SQLException se) {
		            System.out.println("SQL Exception:");

		// Loop through the SQL Exceptions
		            while (se != null) {
		                System.out.println("State : " + se.getSQLState());
		                System.out.println("Message: " + se.getMessage());
		                System.out.println("Error : " + se.getErrorCode());

		                se = se.getNextException();
		            }
		        } catch (Exception e) {
		            System.out.println(e);
		        }

		    }

			
		

}
