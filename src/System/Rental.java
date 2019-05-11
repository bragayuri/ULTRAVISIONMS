// Yuri Braga 2017141.

package System;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Db;
import View.ManageARental;

public class Rental {
	
	// Defining the values to my attributes.
	protected String idRental;
	protected String custId;
	protected String cardNumber;
	protected String titleId;
	protected String titleName;
	protected String startDate;
	protected String returnDate;
	protected String paid;
	protected String fee;
	protected String finalprice;
	protected String rentalperiod;
	
	
	// My Constructor is receiving as a parameter the Strings collected from the View. textField.
	//Here will start my encapsulation. 

	public Rental(String aone,String a, String b, String c, String d, String E,String f, String g,String h, String i, String j) {
		this.idRental=aone;
		this.custId=a;
		this.cardNumber=b;
		this.titleId=c;
		this.titleName=d;
		this.startDate=E;
		this.returnDate=f;
		this.paid=g;
		this.fee=h;
		this.finalprice=i;
		this.rentalperiod=j;
		
		
		String message = "INSERT INTO `ultravision`.`rental` (`customerId`, `CustomerCardNumber`,`TitleId`,`TitleName`,`ArrivalDate`,`ReturnDate`,`Paid`,`Extra Fee`,`Rentalcol`,`RentalPeriod`) "
	    		+ "VALUES ('" + custId + "','" + cardNumber + "', '" + titleId + "', '" + titleName + "', '" + startDate + "','" + returnDate + "','" + paid + "','" + fee + "','" + finalprice + "', '" + rentalperiod  + "');";
		
		Db mydb = new Db();
		mydb.DbInsertCustomer(message);
		 
		
		 
		
		
		
		
	}
	
	
	// Here start my Getters for all my encapsulated values.
	
	public String getTitleId() {
		return titleId;
	}


	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}
	
	public String getIdRental() {
		return idRental;
	}


	public void setIdRental(String idRental) {
		this.idRental = idRental;
	}
	public String getCustId() {
		return this.custId;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public String getPlantype() {
		return this.getPlantype();
	}

	public String getTitleName() {
		return titleName;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public String getPaid() {
		return paid;
	}

	public String getFee() {
		return fee;
	}

	public String getFinalprice() {
		return finalprice;
	}

	public String getRentalperiod() {
		return rentalperiod;
	}

	public String getFreeRental() {
		return getFreeRental();
	}
	
	
}
