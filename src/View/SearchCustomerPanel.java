
//Yuri Braga 2017141
// This is my View Search Customer.
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


import User.Customer;

// This class will be responsible to set my frame to Search for a Customer.
/*
 * From this panel will be possible to manage a customer such update, delete or go Back to main Menu and Home Panel.
 */

public class SearchCustomerPanel extends JFrame implements ActionListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * Instance of my Customer ArrayList to use within my connection.
	 */

	ArrayList<Customer> users;
	/*
	 * Instance of my JTable that will hold the values regards Users.
	 * 
	 */
	static JTable t;
/*
 * Here are my variables that will be Encapsulated and are protected to this class.
 */
	protected String custid;
    protected  String customerId;
	protected String membershiCard;
	protected String plantype;
    protected String points;
	protected String email;
	protected String name;	 
	protected String surname;
	protected  String phone;
	protected  String gender;
	protected String status;
	protected String freeRental;
	
	/* 
	 * Here is my default Table Model which will hold the values from my ArrayList.
	 */
	 
   public DefaultTableModel tableModel ;
	 
	 
	 
	/*
	 * Here starts my constructor which main responsibility is to set a frame and provide 
	 * visual aspects and also call the DB connection.
	 */
	public SearchCustomerPanel() {
		
		this.setVisible(true);
		this.setSize(900,400);
		this.setTitle("SEARCH FOR A CUSTOMER");
		
		JPanel one = new JPanel();
		this.add(one);
		
		GridLayout grid = new GridLayout(2,1);
		one.setLayout(grid);
		
		// The name of my columns Name.
		
		 String[] columnName = {
				 "CustomerID", 
				 "MembershipCard", 
				 "Plan Type","Points",
				 "Email","Name",
				 "Surname","Phone",
				 "Gender","Rental Status",
				 "Free Rental",
				 };
		 //Here I set my DefaultTable model and its columns Names.
		 //Also I start my Db connection.
		 
		 tableModel = new DefaultTableModel(columnName, 1);
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
	        
	        JButton btn1 = new JButton("Save Changes");
	        two.add(btn1);
	        btn1.setActionCommand("SAVE");
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
	        
	        // For these Buttons I will set ActionListeners and ActionCommand.
	        
	        
	        JButton btn3 = new JButton("Home");
	        two.add(btn3);
	        btn3.setActionCommand("Home");
	        btn3.addActionListener(this);
	        
	        
	        JButton btn4 = new JButton("Go Back");
	        two.add(btn4);
	        btn4.setActionCommand("GOBACK");
	        btn4.addActionListener(this);
	        
	        
	        
	        
	        

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
		
		// If Go Back button is selected. Manager Customer Panel will be called.
		
		if (e.getActionCommand().equals("GOBACK")){
	        this.dispose();
	       ManageCustomer mycustomer = new ManageCustomer();
	       
	       // If Home button is selected. Main Panel will be called.
	        
		}else if(e.getActionCommand().equals("Home")){
	        this.dispose();
	       MainPanel mypanel = new MainPanel(); 
			
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
			
			String query = "Select * from customer";

			// Get a connection to the database
			Connection conn = DriverManager.getConnection(dbServer, user, password) ;

			// Get a statement from the connection
			java.sql.Statement stmt = conn.createStatement() ;

			// Execute the query
			ResultSet rs = stmt.executeQuery(query) ;
			
            // setting a value to c type Customer.
			Customer c;
			
			
			
			  //Here c will receive the Strings from my Database using the rs.
			  // From here the values from my Customer Database are now with the variable ` c `.
	            while (rs.next()) 
	            {  c = new Customer (
	            		        rs.getString("idCustomer"),
	        					rs.getString("MembershipCard"),
	        					rs.getString("PlanType"),
	        					rs.getString("Points"),
	        					rs.getString("email"),
	        					rs.getString("Name"),
	        					rs.getString("Surname"),
	        					rs.getString("Phone"),
	        					rs.getString("Gender"),
	        					rs.getString("RentalS"),
	        					rs.getString("FreeRental")
	        					);
	            
                  //Here I start an Instance of my ArrayList of Customer which will hold the values extracted from my Databases.
	            
	              users = new ArrayList<Customer>();
	              
	              //Here I am passing the values to the Array List. From here all the values extracted from the Database are now
	              // hold into an ArrayList of Customer, which I named users.
                  users.add(c);
                  
                  // here I will pass the values from my Customer List to an Object.
                  // For each line I will use the get methods from my Customer ArrayList.
                  //From this point ahead all the values from the Database will be placed into a new set of Strings.
                  
                  
                  for(int i=0; i< users.size(); i++) {
         			 customerId =users.get(i).getIdCustomer();
         			 membershiCard=users.get(i).getCardN();
         			 plantype=users.get(i).getPlanType();
         			 points=users.get(i).getLoyaltyPoints();
         			 email=users.get(i).getcEmail();
         			 name=users.get(i).getcName();
         			 surname=users.get(i).getcSurname();
         			 phone=users.get(i).getPhone();
         			 gender=users.get(i).getGender();
         			 status=users.get(i).getRentalStatus();
         			 freeRental=users.get(i).getFreeRental();
         			 
         			 // This next line I will pass these Strings to an array of Objects.
         			 //Which then will be placed into my Default Table Model.
         			 
         			Object[] data = {customerId, membershiCard, plantype, points, email, name, 
                            surname, phone, gender, status, freeRental};
         			
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
