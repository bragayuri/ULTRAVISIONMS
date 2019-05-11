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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import Model.Db;
import Product.Movie;

public class SearchTitle extends JFrame implements ActionListener{
	
	 String[][] data = new String[13][13];
	 
	static JTable t;
	 
	
	public SearchTitle() {
		this.setVisible(true);
		this.setSize(900,400);
		this.setTitle("Search for a Title");
		
		
		
		
				
		
		
		JPanel one = new JPanel();
		this.add(one);
		
		

		GridLayout grid = new GridLayout(2,1);
		one.setLayout(grid);
		
		 String[] columnName = {"Media ID", "Media Title", 
				 "Media Type","Format",
				 "Year","Genre",
				 "Description",
				 "Arrival","Rate",
				 "Director","Cast",
				 "Classification","Avaiability"};
		 
		 String select = "SELECT* from `movies`;";
		 
		Db(select);
		// Db connection = new Db(data);
		// connection.reading(select);
		 
		
	
		 
		 
		 
		 t = new JTable(data, columnName);
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
	        
	        JButton btn2 = new JButton("Delete");
	        two.add(btn2);
	        btn2.setActionCommand("Delete");
		    btn2.addActionListener(this);
	        
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
	        
	        
	        
	        

		
		
		this.validate();
		this.repaint();
	}
	
	public void Db(String select) {
		
		try{
			// Load the database driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance() ;
			
			String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
			String user = "root";
			String password = "rootroot";
			String query = select;

			// Get a connection to the database
			Connection conn = DriverManager.getConnection(dbServer, user, password) ;

			// Get a statement from the connection
			java.sql.Statement stmt = conn.createStatement() ;

			// Execute the query
			ResultSet rs = stmt.executeQuery(query) ;
			
			
			
			
			  int i = 0;
	            while (rs.next()) {
	            	 data[i][0] = rs.getString("IdMovies");// criando um array
		                data[i][1] = rs.getString("MediaTitle");
		                data[i][2] = rs.getString("MediaType");
		                data[i][3] = rs.getString("Format");
		                data[i][4] = rs.getString("Yearr");
		                data[i][5] = rs.getString("Genre");
		                data[i][6] = rs.getString("Description");
		                data[i][7] = rs.getString("ArrivalDate");
		                data[i][8] = rs.getString("Rate");
		                data[i][9] = rs.getString("Director");
		                data[i][10] = rs.getString("Cast");
		                data[i][11] = rs.getString("Classification");
		                data[i][12] = rs.getString("Avaiability");
		                
	               




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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Update")) {
			this.dispose();
			
		
		}else if (e.getActionCommand().equals("Delete")) {
			
			JOptionPane.showMessageDialog(null,"Select to delete");
			
		} if (e.getActionCommand().equals("RENTAL")) {
			AddRental myrental = new AddRental();
			
		}else if (e.getActionCommand().equals("Home")) {
			this.dispose();
			MainPanel mypanel = new MainPanel();
			
		}
		if (e.getActionCommand().equals("BACK")) {
			this.dispose();
			ManageTitle mytitle = new ManageTitle();
			
			
		}
		
	}
	
	public static void main(String[]args) {
		new SearchTitle();
	}

	

}
