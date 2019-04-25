package User;

import Model.Db;


public class Customer {
	
	
	
	protected String custId;
	protected String cardNumber;
	protected String planType;
	protected String loyaltyPoints;
	protected String cEmail;
	protected String cName;
	protected String cSurname;
	protected String phone;
	protected String gender;
	protected String rentalStatus;
	protected String freeRental;
	
	// Generic method toString, to ensure subclasses have it.
	
	public Customer(String a,String b,String c,String d,String E,String f,String g,String h, String i, String j,String k) {
		this.custId=a;
		this.cardNumber=b;
		this.planType=c;
		this.loyaltyPoints=d;
		this.cEmail=E;
		this.cName=f;
		this.cSurname=g;
		this.phone=h;
		this.gender=i;
		this.rentalStatus=j;
		this.freeRental=k;
		 
		String message = "INSERT INTO `ultravision`.`customer` (`idCustomer`, `MembershipCard`,`PlanType`,`Points`,`email`,`Name`,`Surname`,`Phone`,`Gender`,`RentalS`,`FreeRental`) "
    		+ "VALUES ('" + custId + "','" + cardNumber + "','" + planType + "', '" + loyaltyPoints + "', '" + cEmail + "','" + cName + "','" + cSurname + "','" + phone + "','" + gender + "','" + rentalStatus + "', '" + freeRental + "');";

  
  Db mydb = new Db();
 mydb.DbInsertCustomer(message);
		
	}
			@Override
			public String toString() {
				return "I am a Customer"; 
				
			}
	
	
	// My getters and Setters
	
	public String getCustId(String a) {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getCardNumber(String b) {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPlanType(String c) {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public int getLoyaltyPoints(String d) {
		return loyaltyPoints;
	}
	public void setLoyaltyPoints(int loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}
	public String getcName(String f) {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcSurname(String g) {
		return cSurname;
	}
	public void setcSurname(String cSurname) {
		this.cSurname = cSurname;
	}
	public String getcEmail(String E) {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getGender(String i) {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPhone(String h) {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public boolean getRentalStatus(String j) {
		return rentalStatus;
	}
	public void setRentalStatus(boolean rentalStatus) {
		this.rentalStatus = rentalStatus;
	}
	public boolean isFreeRental(String k) {
		return freeRental;
	}
	public void setFreeRental(boolean freeRental) {
		this.freeRental = freeRental;
	}
	
	
	
	

}
