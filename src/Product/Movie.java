// Yuri Braga 2017141.

package Product;

import javax.swing.JOptionPane;

import Model.Db;
import View.ManageTitle;

// This class is my Movie class. Every time a user generates a Movie Media this class will store the values inside
// an ArrayList and also save it inside my Databases.

public class Movie extends Media implements Dvd,BlueRay { // The class Movie is a subclass of Media class.
	// The Interface DVD and BlueRay is implemented.
	
	protected String cast;
	protected String classification;
	String blueray;
	
	// setting properties that are exclusive for this subclass.
	
	
	
	// creating my Constructor where my values will be defined
	
	
	
	public Movie(String a,String b,String c,String d,String E,String f,String g,String h, String I, String j,String k) {
		
		// Here starts my encapsulation.
		
		this.name=a;
		this.type=b;
		this.format=c;
		this.year=d;
		this.genre=E;
		this.description=f;
		this.arrival=g;
		this.rate=h;
		this.director=I;
		this.cast=j;
		this.classification=k;
		this.Avaiability=(false);
		
		
		
		String message = "INSERT INTO `ultravision`.`movies` (`MediaTitle`, `MediaType`,`Format`,`Yearr`,`Genre`,`Description`,`ArrivalDate`,`Rate`,`Director`,`Cast`,`Classification`) "
	    		+ "VALUES ('" + name + "','" + type + "','" + format + "', '" + year + "', '" + genre + "','" + description + "','" + arrival + "','" + rate + "','" + director + "','" + cast + "', '" + classification + "');";
		
		 Db mydb = new Db();
		 mydb.DbInsertCustomer(message);
		 
		 JOptionPane.showMessageDialog(null, "Media Registered");
		
		
		 
		 ManageTitle mytitle = new ManageTitle();
	}
	
	
	
	// my setters and getters
	
	
	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	
	
	@Override
	
	public String toString() {
		return "I am a Media"; 
		
	}
	
	// this method is implemented from my BlueRay interface

	@Override
	public void ultraHighQualityVideos(String blueray) {
		return;
		
	}
	
	// this method is implemented from the DVD interface.

	@Override
	public void HighqualityVideos() {
		
	}



	@Override
	public void ultraHighQualityVideos() {
		// TODO Auto-generated method stub
		
	}
	

}
