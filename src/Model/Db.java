// Yuri Braga 2017141

package Model;

import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import User.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import View.AddCustomerPanel;
import View.AddRental;
import View.ManageTitle;
import View.SearchTitle;
import View.UpdateCustomer;

/*
 * This class will be responsible for some of my Db connections.
 */

public class Db {
	
	private static final String Customer = null;

	String[][] data = new String[12][12]; //arrays with the query information
	
	Connection conn = null;
	
	Statement stmt =null;
	
	ResultSet rs =null;
	
	
	
	
	
	
// public void DbInsertCustomer(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9, String t10, String t11) 
	
	 public void DbInsertCustomer(String message) {
	        try {
	// Load the database driver

	            //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	            String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
	            String user = "root";
	            String password3 = "rootroot";

	            String query = message;
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
	 
	 public void selectdb(String message) {
		    //this method will connect my Provider once Login is selected at the Sample Frame class.                            
		        try {
		            //the start of my connection with the database.
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
		            String user = "root";
		            String password3 = "rootroot";
		            Connection con = DriverManager.getConnection(dbServer, user, password3);
		            Statement stmt = con.createStatement();
		            String sql = message;
		            ResultSet rs = stmt.executeQuery(sql);

		            if (rs.next()) {// if the informations typed exists inside my database..
		                JOptionPane.showMessageDialog(null, "Customer is free to rent");
		                // an option will Show up...
		                
		                AddRental myrental = new AddRental();// the method userPanel from the User class will be called.The Welcome Panel starts.

		            } else {// if the user informations are not there...
		                JOptionPane.showMessageDialog(null, "Customer not registred yet.");
		               
		                int reply=JOptionPane.showConfirmDialog(null, "Would you like to register a new customer?", "Test", JOptionPane.YES_NO_OPTION);
		                if (reply == JOptionPane.YES_OPTION) {
		                	
		                  AddCustomerPanel newcustomer = new AddCustomerPanel();
		                  
		                  
		                }
		                
		                else {
		                   JOptionPane.showMessageDialog(null, "GOODBYE");
		                   System.exit(0);
		                }
		              
					
		                // this option show the user can not go any further.
		            }
		            con.close();// this closes the connection with the database.
		        } catch (Exception e) {
		            System.out.print(e);
		        }
		    }
	 
	 public void selectdb2(String message) {
		    //this method will connect my Provider once Login is selected at the Sample Frame class.                            
		        try {
		            //the start of my connection with the database.
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
		            String user = "root";
		            String password3 = "rootroot";
		            Connection con = DriverManager.getConnection(dbServer, user, password3);
		            Statement stmt = con.createStatement();
		            String sql = message;
		            ResultSet rs = stmt.executeQuery(sql);

		            if (rs.next()) {// if the informations typed exists inside my database..
		                JOptionPane.showMessageDialog(null, "Update Customer Details");// an option will Show up...

		                
		            } else {// if the user informations are not there...
		                JOptionPane.showMessageDialog(null, "Customer not registred yet.");// this option show the user can not go any further.
		            }
		            con.close();// this closes the connection with the database.
		        } catch (Exception e) {
		            System.out.print(e);
		        }
		    }
	 
	   public void reading2(String message) {
	        try {
	// Load the database driver

	            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	            String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
	            String user = "root";
	            String password = "rootroot";
	            String query = message;

	// Get a connection to the database
	             conn = DriverManager.getConnection(dbServer, user, password);

	// Get a statement from the connection
	             stmt = conn.createStatement();

	// Execute the query
	             rs = stmt.executeQuery(query);
	// Loop through the result set
	             if (rs.next()) {// if the informations typed exists inside my database..
		                JOptionPane.showMessageDialog(null, "Login Successull");// an option will Show up...
		                Dbselect(message);
		                
		                
		              
		               

		            } else {// if the user informations are not there...
		                JOptionPane.showMessageDialog(null, "No Media found with this Id.Please try again...");
		               
		            }

	            
	            

	            

	// Close the result set, statement and the connection
	            rs.close();
	            stmt.close();
	            conn.close();
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
	 
		 
		 
	 
	 
	 public void dbsearch2(String search) {     //this method will connect my Provider once Login is selected at the Sample Frame class.                            
	        try {
	            //the start of my connection with the database.
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
	            String user = "root";
	            String password3 = "rootroot";
	            Connection con = DriverManager.getConnection(dbServer, user, password3);
	            Statement stmt = con.createStatement();
	            String sql = search;
	            ResultSet rs = stmt.executeQuery(sql);

	            if (rs.next()) {// if the informations typed exists inside my database..
	                JOptionPane.showMessageDialog(null, "Login Successull");// an option will Show up...
	                Dbselect(sql);

	               

	            } else {// if the user informations are not there...
	                JOptionPane.showMessageDialog(null, "No Media found with this Id.Please try again...");
	               
	            }
	            con.close();// this closes the connection with the database.
	        } catch (Exception e) {
	            System.out.print(e);}
	        }
	
	 
	 public void dbsearch(String search) {     //this method will connect my Provider once Login is selected at the Sample Frame class.                            
	        try {
	            //the start of my connection with the database.
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
	            String user = "root";
	            String password3 = "rootroot";
	            Connection con = DriverManager.getConnection(dbServer, user, password3);
	            Statement stmt = con.createStatement();
	            String sql = search;
	            ResultSet rs = stmt.executeQuery(sql);

	            if (rs.next()) {// if the informations typed exists inside my database..
	                JOptionPane.showMessageDialog(null, "Login Successull");// an option will Show up...

	                SearchTitle mytitle = new SearchTitle();// the method userPanel from the User class will be called.The Welcome Panel starts.

	            } else {// if the user informations are not there...
	                JOptionPane.showMessageDialog(null, "No Media found with this Id.Please try again...");
	                ManageTitle mytitle = new ManageTitle();// this option show the user can not go any further.
	            }
	            con.close();// this closes the connection with the database.
	        } catch (Exception e) {
	            System.out.print(e);
	        }
	    }

	 
	    public void reading(String select) {
	        try {
	// Load the database driver

	            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	            String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
	            String user = "root";
	            String password = "rootroot";
	            String query = select;

	// Get a connection to the database
	             conn = DriverManager.getConnection(dbServer, user, password);

	// Get a statement from the connection
	             stmt = conn.createStatement();

	// Execute the query
	             rs = stmt.executeQuery(query);
	// Loop through the result set

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
	            rs.close();
	            stmt.close();
	            conn.close();
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
	        
	     public void getUsers(){ 
	        	
	    		try{
	    			// Load the database driver
	    			Class.forName("com.mysql.cj.jdbc.Driver").newInstance() ;
	    			
	    			String dbServer = "jdbc:mysql://localhost:3306/ultravision?useTimezone=true&serverTimezone=UTC";
	    			String user = "root";
	    			String password = "rootroot";
	    			String query = "Select * from customer";;

	    			// Get a connection to the database
	    			Connection conn = DriverManager.getConnection(dbServer, user, password) ;

	    			// Get a statement from the connection
	    			java.sql.Statement stmt = conn.createStatement() ;

	    			// Execute the query
	    			ResultSet rs = stmt.executeQuery(query) ;
	    			
	    			
	    			
	    			
	    			  int i = 0;
	    	            while (rs.next()) {
	    	            	
	    	            	ArrayList<Customer> customer= new ArrayList();
	    	            	   
	    	            	   Customer c;
	    	            	   
	    	                 c = new Customer (rs.getString("idCustomer"),
	    	            			   rs.getString("MembershipCard"),
	    	            			   rs.getString("PlanType"),
	    	            			   rs.getString("Points"),
	    	            			   rs.getString("email"),
	    	            			   rs.getString("Name"),
	    	            			   rs.getString("Surname"),
	    	            			   rs.getString("Phone"),
	    	            			   rs.getString("Gender"),
	    	            			   rs.getString("RentalS"),
	    	            			   rs.getString("FreeRental"));
	    	            	   
	    	            	   customer.add(c);
	    	            	   
	    	            	   for(Customer newcustomer :customer)
	    	            		  
	    	            		   System.out.println(customer);
	    	            	   
	    	            	 
	    	            		   
	    	            	   
	    	               
	    	               
	    	               




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
	
	
	
	
		
		
	
	
	



