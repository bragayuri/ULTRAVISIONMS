package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import Model.Db;

public class UpdateCustomer extends JFrame implements ActionListener {
	
	String[][] data = new String[11][11];
	
	 static JTable t;
	
	public UpdateCustomer() {
		this.setVisible(true);
		this.setSize(900,400);
		this.setTitle("UPDATE CUSTOMER");
		
		JPanel one = new JPanel();
		this.add(one);
		
		

		GridLayout grid = new GridLayout(2,1);
		one.setLayout(grid);
		
		 String[] columnName = {
				 "CustomerID", 
				 "MembershipCard", 
				 "Plan Type","Points",
				 "Email","Name",
				 "Surname","Phone",
				 "Gender","Rental Status",
				 "Free Rental",
				 };
		
		 
		Db();
		 
		 
		  t = new JTable(data, columnName);
		  
		  
			String select = "SELECT * FROM customer";
				
				
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
	        
	        
	        JButton btn2 = new JButton("Delete");
	        two.add(btn2);
	        btn2.setActionCommand("DEL");
	        btn2.addActionListener(this);
	        
	        
	        JButton btn3 = new JButton("Home");
	        two.add(btn3);
	        btn3.setActionCommand("Home");
	        btn3.addActionListener(this);
	        
	        
	        JButton btn4 = new JButton("Go Back");
	        two.add(btn4);
	        btn4.setActionCommand("GOBACK");
	        btn4.addActionListener(this);
	        
	        
	        
	        
	        

		
		
		this.validate();
		this.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("GOBACK")){
	        this.dispose();
	       ManageCustomer mycustomer = new ManageCustomer();
	        
		}else if(e.getActionCommand().equals("Home")){
	        this.dispose();
	       MainPanel mypanel = new MainPanel(); 
			
		}
		
	}

	public void Db() {
	
		try{
			// Load the database driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance() ;
			
			String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
			String user = "root";
			String password = "rootroot";
			String query = "SELECT * FROM customer";

			// Get a connection to the database
			Connection conn = DriverManager.getConnection(dbServer, user, password) ;

			// Get a statement from the connection
			java.sql.Statement stmt = conn.createStatement() ;

			// Execute the query
			ResultSet rs = stmt.executeQuery(query) ;
			
			
			
			
			  int i = 0;
	            while (rs.next()) {
	                data[i][0] = rs.getString("idCustomer");// criando um array
	                data[i][1] = rs.getString("MembershipCard");
	                data[i][2] = rs.getString("PlanType");
	                data[i][3] = rs.getString("Points");// criando um array
	                data[i][4] = rs.getString("email");
	                data[i][5] = rs.getString("Name");
	                data[i][6] = rs.getString("Surname");// criando um array
	                data[i][7] = rs.getString("Phone");
	                data[i][8] = rs.getString("Gender");
	                data[i][9] = rs.getString("RentalS");// criando um array
	                data[i][10] = rs.getString("FreeRental");
	               




	                i++;

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
