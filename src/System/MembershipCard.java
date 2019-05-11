
// Yuri Braga 2017141
package System;

// This is my Membership card class.
/*
 * The main responsability is to sum the points and display when a customer has a free rental.
 * Unfortunately I could not implement this class into the program.
 */

public class MembershipCard {

	   private int points;
	   private boolean freeRentAllowed;
	   
	   
	   public void addPoints(int points){
			this.points += points;
			setRentAllowed();
	   }
	   
	   public boolean availFreeRent(){
			if(this.isfreeRentAllowed()){
				this.points -= 100;
				setRentAllowed();
				return true;
			} else {
				return false;
			}
	   }
	   
	   private void setRentAllowed(){
			if (this.points >= 100){
				this.freeRentAllowed = true;
			} else {
				this.freeRentAllowed = false;
			}
	   }
	   
	   public int getPoints() {
			return  points;
       }
	   
	   public boolean isfreeRentAllowed(){
			return freeRentAllowed;
	   
	   }
	   
}