//Yuri Braga 2017141

package Product;

import Model.Db;

// This class will mainly save the informations from the View to the Database.
//Also will be base from instance and use of getters and setters to display informations.

public class Music extends Media implements Cd {
	
	// here are some attributes that are exclusive for this class.
	protected String artist;
	protected String musicgenre;
	
	// My constructor which will receive as parameter the values from the View class.
	public Music(String a,String b, String c, String d, String E,String f, String g, String h, String I,String j, String k) {
		
		//
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
		
		String message = "INSERT INTO `ultravision`.`music` (`MediaName`, `MediaType`,`Format`,`genre`,`description`,`ArrivalDate`,`Rate`,`Director`,`Music Genre`,`Artist`,`Avaiability`) "
	    		+ "VALUES ('" + name + "','" + type + "','" + format + "', '" + genre + "', '" + description + "','" + arrival + "','" + rate + "','" + director + "','" + musicgenre + "','" + artist + "', '" + Avaiability + "');";
		

		 Db mydb = new Db();
		 mydb.DbInsertCustomer(message);
	}
	
	// Here is the method implemented from the interface Cd.

	@Override
	public void musicStorage() {
		// TODO Auto-generated method stub
		
	};

}
