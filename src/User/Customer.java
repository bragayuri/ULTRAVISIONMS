//Yuri Braga 2017141

package User;

import Model.Db;

/* 
 * This is class will be responsible to get the values inserted on the View and pass to the Database.
 * It will also encapsulate values and through the toString method its possible to observe the registered on the Console.
 * 
 */



public class Customer {
	
	
	// First I define all the attributes for a Customer.
	
	protected String cardN;
	protected String idCustomer;
	

	protected String planType;
	protected String loyaltyPoints;
	protected String cEmail;
	protected String cName;
	protected String cSurname;
	protected String phone;
	protected String gender;
	protected String rentalStatus;
	protected String freeRental;
	
	public Customer(String a,String b,String c,String d,String E,String f,String g,String h, String i, String j,String k) {
		this.idCustomer=a;
		this.cardN=b;
		this.planType=c;
		this.loyaltyPoints=d;
		this.cEmail=E;
		this.cName=f;
		this.cSurname=g;
		this.phone=h;
		this.gender=i;
		this.rentalStatus=j;
	}
	
	//My Constructor is receiving as a parameter a set of Strings that will be encapsulated for this class.
	//The String values are coming from my View class where the User types in from a jTextField class.
	//This Constructor will also pass the String message to my DB connection using a query message.
	//From there all my values will be saved on my Database.
	
	public Customer(String b,String c,String d,String E,String f,String g,String h, String i, String j,String k) {
		
		this.cardN=b;
		this.planType=c;
		this.loyaltyPoints=d;
		this.cEmail=E;
		this.cName=f;
		this.cSurname=g;
		this.phone=h;
		this.gender=i;
		this.rentalStatus=j;
		
		 
		String message = "INSERT INTO `ultravision`.`customer` (`MembershipCard`,`PlanType`,`Points`,`email`,`Name`,`Surname`,`Phone`,`Gender`,`RentalS`,`FreeRental`) "
    		+ "VALUES ('" + cardN + "','" + planType + "', '" + loyaltyPoints + "', '" + cEmail + "','" + cName + "','" + cSurname + "','" + phone + "','" + gender + "','" + rentalStatus + "', '" + freeRental + "');";

  
 Db mydb = new Db();
 mydb.DbInsertCustomer(message);
		
	}
	
	
			
	
	
	// My getters and Setters for the values set on this class.
	// The Setter and Getters will enable to get each attribute of this class whatever I would like to use it.
			
	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	
	public String getCardN() {
				return cardN;
			}
			public void setCardN(String cardN) {
				this.cardN = cardN;
			}
			public String getPlanType() {
				return planType;
			}
			public void setPlanType(String planType) {
				this.planType = planType;
			}
			public String getLoyaltyPoints() {
				return loyaltyPoints;
			}
			public void setLoyaltyPoints(String loyaltyPoints) {
				this.loyaltyPoints = loyaltyPoints;
			}
			public String getcEmail() {
				return cEmail;
			}
			public void setcEmail(String cEmail) {
				this.cEmail = cEmail;
			}
			public String getcName() {
				return cName;
			}
			public void setcName(String cName) {
				this.cName = cName;
			}
			public String getcSurname() {
				return cSurname;
			}
			public void setcSurname(String cSurname) {
				this.cSurname = cSurname;
			}
			public String getPhone() {
				return phone;
			}
			public void setPhone(String phone) {
				this.phone = phone;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public String getRentalStatus() {
				return rentalStatus;
			}
			public void setRentalStatus(String rentalStatus) {
				this.rentalStatus = rentalStatus;
			}
			public String getFreeRental() {
				return freeRental;
			}
			public void setFreeRental(String freeRental) {
				this.freeRental = freeRental;
			}
			
			// The ToString method will transform to String any build path I might want to consult.
			//For Example: When I want to instanciate this class and print the new Object of an ArrayList
			// My to String method will transform this Object to a String which enable the Strings to be printed
			//into the console.
			
			@Override
			public String toString() {
				return "I am a Customer.My new Loyalty Card number is "+cardN+" Plan Type "+ planType+" Points: "+ loyaltyPoints+" Email: "+cEmail+" Name: "+cName+" Surname: "+ cSurname+" Phone: "+ phone +" Gender: "+ gender+ "Status"+rentalStatus ;
				
			}
	
	
	
	
	

}
