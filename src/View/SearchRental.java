//Yuri Braga 2017141

package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import System.Rental;
import User.Customer;

//This is my class Search for a Rental.
/*
 * It`s main responsibility is to set a new frame and a Table for Rental procedures.
 */
public class SearchRental extends JFrame implements ActionListener {
	/*
	 * Instance of my Rental ArrayList to use within my connection.
	 */
	
	ArrayList<Rental> rentals;
	
	/*
	 * Instance of my JTable that will hold the values regards Users.
	 * 
	 */
	
	static JTable t;
	
	/* 
	 * Here is my default Table Model which will hold the values from my ArrayList.
	 */
	
	protected String idRental;
    protected String customerId;
    protected String cardNumber;
    protected String titleId;
    protected String titleName;
    protected String startDate;
    protected String returnDate;
    protected String paid;
    protected String fee;
    protected String rentalCalc;
    protected String rentalPaid;
	 
   public DefaultTableModel tableModel ;

	
	public SearchRental() {
		
			this.setVisible(true);
			this.setSize(900,400);
			this.setTitle("Search for a Rental");
			
			
		    JPanel one = new JPanel();
			this.add(one);
			
			

			GridLayout grid = new GridLayout(2,1);
			one.setLayout(grid);
			
			// The name of my columns Name.
			
			 String[] columnName = {"IdRental", "Customer ID", 
					 "Card Number","TitleId",
					 "Title Name","StartDate",
					 "ReturnDate",
					 "Paid","Fee",
					 "RentalCalc","RentalPeriod",
					 };
			 //Here I set my DefaultTable model and its columns Names.
			 //Also I start my Db connection.
			 tableModel = new DefaultTableModel(columnName, 1);
			 
			 // Here I set a String select wich will be passed as parameter to my Db connection method;
			
			 
			 Db ();
			 
			 // Here my table adds the TableModel.
			 
				t = new JTable(tableModel);
			 
			
				// Here I set the Selectmode to be able to Update the table.
				//Also I will ad my ScrollPane.
		        t.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		        JScrollPane sp = new JScrollPane(t);
		        one.add(sp);
		        
		        JPanel two = new JPanel();
		        one.add(two);
		        
		        GridLayout grid2 = new GridLayout(1,5);
				two.setLayout(grid2);
		        
		        JButton btn1 = new JButton("Update");
		        two.add(btn1);
		        btn1.setActionCommand("Update");
			    btn1.addActionListener(this);
		        
			  //For this button I am creating an Anonymous Inner Class
		        // which main responsibility is to delete an Item.
		        
		        JButton btn2 = new JButton("Delete");
		        two.add(btn2);
		        btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						tableModel =(DefaultTableModel)t.getModel();
						try {
							
						int rowToRemove = t.getSelectedRow();
						tableModel.removeRow(rowToRemove);
						}catch(Exception ex) {
							
							JOptionPane.showMessageDialog(null, ex);
						}
							
						}
					
					
				});
		        
		        JButton btn3 = new JButton("Start Rental");
		        two.add(btn3);
		        btn3.setActionCommand("RENTAL");
			    btn3.addActionListener(this);
		        
		        JButton btn4 = new JButton("Go Back");
		        two.add(btn4);
		        btn4.setActionCommand("BACK");
			    btn4.addActionListener(this);
		        
		        JButton btn5 = new JButton("Home");
		        two.add(btn5);
		        btn5.setActionCommand("Home");
			    btn5.addActionListener(this);
		        
		        
		        
		        

			 // Those methods will ensure the frame is set correctly.
			
			this.validate();
			this.repaint();
		}
	
	 /*
     * The Action Performed method will define the actions the program will take when the Buttons are
     * pressed.
     */
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("Update")) {
			this.dispose();
			
		
		}else if (e.getActionCommand().equals("Delete")) {
			
			JOptionPane.showMessageDialog(null,"Select to delete");
			
		} if (e.getActionCommand().equals("Start Rental")) {
			
		}else if (e.getActionCommand().equals("Home")) {
			this.dispose();
			MainPanel mypanel = new MainPanel();
			
		}
		if (e.getActionCommand().equals("BACK")) {
			this.dispose();
			ManageARental mytitle = new ManageARental();
			
			
		}
		
		
		
	}
	/*
	 * This method will start the connection with my Database using Objects[].
	 */
		
		public void Db() {
			
			try{
				// Load the database driver
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance() ;
				
				String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
				String user = "root";
				String password = "rootroot";
				
				// Get query
				
				String query = "Select * from rental";

				// Get a connection to the database
				Connection conn = DriverManager.getConnection(dbServer, user, password) ;

				// Get a statement from the connection
				java.sql.Statement stmt = conn.createStatement() ;

				// Execute the query
				ResultSet rs = stmt.executeQuery(query) ;
				
				
				
				// setting a value to c type Customer.
				Rental r;
				
				//Here c will receive the Strings from my Database using the rs.
				  // From here the values from my Customer Database are now with the variable ` r `
				
				
				  
		            while (rs.next()) {
		            	 r= new Rental(
				            	    rs.getString("idRental"),
					                rs.getString("customerId"),
					                rs.getString("CustomerCardNumber"),
					                rs.getString("TitleId"),
					                rs.getString("TitleName"),
					                rs.getString("ArrivalDate"),
					                rs.getString("ReturnDate"),
					                rs.getString("Paid"),
					                rs.getString("Extra Fee"),
					                rs.getString("Rentalcol"),
					                rs.getString("RentalPeriod")
					                );
		            	  //Here I start an Instance of my ArrayList of Rental which will hold the values extracted from my Databases.
			                
		            	    rentals = new ArrayList<Rental>(); 
		            	   
		            	    //Here I am passing the values to the Array List. From here all the values extracted from the Database are now
		  	              // hold into an ArrayList of Rentals, which I named rentals.
		                    rentals.add(r);
		                    
		                   
		                    
		                    for(int i=0; i< rentals.size(); i++) {
		                    	 idRental=rentals.get(i).getIdRental();
				                 customerId=rentals.get(i).getCustId();
				                 cardNumber=rentals.get(i).getCardNumber();
				                 titleId=rentals.get(i).getTitleId();
				                 titleName=rentals.get(i).getTitleName();
				                 startDate=rentals.get(i).getStartDate();
				                 returnDate=rentals.get(i).getReturnDate();
				                 paid=rentals.get(i).getPaid();
				                 fee=rentals.get(i).getFee();
				                 rentalCalc=rentals.get(i).getRentalperiod();
				                 rentalPaid=rentals.get(i).getPaid();
				                 
				                 // This next line I will pass these Strings to an array of Objects.
			         			 //Which then will be placed into my Default Table Model.
			         			 
			         			Object[] data = {idRental, customerId, cardNumber, titleId, titleName, startDate, 
			                            returnDate,paid, fee, rentalCalc, rentalPaid};
			         			
			         			// Here I am adding the values to the default Table Model.
			         			
			         			tableModel.addRow(data);
		               




		               

		            }
		            }


				// Close the result set, statement and the connection
				rs.close() ;
				stmt.close() ;
				conn.close() ;
			}
			catch( SQLException se ){
				System.out.println( "SQL Exception:" ) ;

				// Loop through the SQL Exceptions
				while( se != null ){
					System.out.println( "State  : " + se.getSQLState()  ) ;
					System.out.println( "Message: " + se.getMessage()   ) ;
					System.out.println( "Error  : " + se.getErrorCode() ) ;

					se = se.getNextException() ;
				}
			}
			catch( Exception e ){
				System.out.println( e ) ;
			}
		}

	

	

}
