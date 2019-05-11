//Yuri Braga 2017141

package Product;

import Model.Db;

/*
 * This class will build a frame to Add LiveConert Videos.
 * It implements the interface BlueRay, Cd and Dvd.
 */

public class LiveConcert extends Media implements BlueRay,Dvd,Cd {
	
	// Declaring attributes that will be exclusive for this class.
	
	protected String artist;
	protected String musicgenre;
	
	// Here I will encapsulate the values passed as parameters.
	
	public LiveConcert(String a,String b,String c,String d,String E,String f,String g,String h, String I, String j,String k) {
	
		this.name=a;
		this.type=b;
		this.format=c;
		this.year=d;
		this.genre=E;
		this.description=f;
		this.arrival=g;
		this.rate=h;
		this.director=I;
		this.artist=j;
		this.musicgenre=k;
		this.Avaiability=(false);
		
		String message = "INSERT INTO `ultravision`.`lv` (`MediaName`, `MediaType`,`Format`,`genre`,`description`,`ArrivalDate`,`Rate`,`Director`,`MusicGenre`,`Artist`,`Avaiability`) "
	    		+ "VALUES ('" + name + "','" + type + "','" + format + "', '" + genre + "', '" + description + "','" + arrival + "','" + rate + "','" + director + "','" + musicgenre + "','" + artist + "', '" + Avaiability + "');";
		
		Db mydb = new Db();
		 mydb.DbInsertCustomer(message);
	
	
	}
	
	
	// here are the methods implemented witl the interface.

	@Override
	public void musicStorage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HighqualityVideos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ultraHighQualityVideos() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ultraHighQualityVideos(String blueray) {
		// TODO Auto-generated method stub
		
	}

}
