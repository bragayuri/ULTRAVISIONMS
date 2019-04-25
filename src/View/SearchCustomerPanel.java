package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import Model.Db;

public class SearchCustomerPanel extends JFrame implements ActionListener {
	
	
	JTable mytable;
	String[][] data = new String[11][11];
	
	
	
	
	public SearchCustomerPanel() {
		
		this.setVisible(true);
		this.setSize(600,600);
		
		JPanel one = new JPanel();
		this.add(one);
		
		 
		String[] columnName = {
				 "CustomerID", 
				 "MembershipCard", 
				 "Plan Type","Points",
				 "Email","Name",
				 "Surname","Phone",
				 "Gender","Rental Status",
				 "Free Rental",
				 };
		
		
		
		
		String message = "Select * from customer where idCustomer = " + customerid.getText();
		
		Db mydb = new Db();
		mydb.DbInsertCustomer(message);
		
		
		mytable = new JTable(data,columnName);
		mytable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	        JScrollPane sp = new JScrollPane(mytable);
	        one.add(sp);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
