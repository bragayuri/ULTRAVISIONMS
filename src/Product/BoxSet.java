// Yuri Braga 2017141

package Product;

import Model.Db;

// This is my BoxSet class. It main responsibility is to manage informations regards BoxSet.
//It will save the informations passed from my View to the Database.

public class BoxSet extends Media implements Dvd,BlueRay {
	
	// here I will define attributes that are exclusive to this class
	
	protected String season;
	


	protected String episodeN;
	protected String tvStudio;
	
	// This constructor will encapsulate the data passed from the view.
	// After the values are set it will insert into the database.
	
	
	public BoxSet (String a,String b,String c,String d,String E,String f,String g,String h, String I, String j,String k,String l) {
		this.name=a;
		this.type=b;
		this.format=c;
		this.year=d;
		this.genre=E;
		this.description=f;
		this.arrival=g;
		this.director=h;
		this.rate=I;
		this.tvStudio=j;
		this.season=k;
		this.episodeN=l;
		this.Avaiability=("Avaiable");
		
		String message = "INSERT INTO `ultravision`.`tvserie` (`MediaName`, `MediaType`,`Format`,`Year`,`genre`,`description`,`ArrivalDate`,`Rate`,`Director`,`TvStudio`,`Season`,`EpisodeNumber`,`Avaiability`) "
	    		+ "VALUES ('" + name + "','" + type + "','" + format + "','" + year + "', '" + genre + "', '" + description + "','" + arrival + "','" + rate + "','" + director + "','" + tvStudio + "','" + season + "', '" + episodeN + "','" + Avaiability + "');";
		
		Db mydb = new Db();
		 mydb.DbInsertCustomer(message);
	
		
	
		
	}
	
	// Here I am declaring the getters and setters for this class.
	
	public String getSeason() {
		return season;
	}







	public void setSeason(String season) {
		this.season = season;
	}







	public String getEpisodeN() {
		return episodeN;
	}







	public void setEpisodeN(String episodeN) {
		this.episodeN = episodeN;
	}







	public String getTvStudio() {
		return tvStudio;
	}







	public void setTvStudio(String tvStudio) {
		this.tvStudio = tvStudio;
	}





	
	

	// Here are the methods implemented by my interface.
	

	@Override
	public void HighqualityVideos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ultraHighQualityVideos(String blueray) {
		// TODO Auto-generated method stub
		
	}







	@Override
	public void ultraHighQualityVideos() {
		// TODO Auto-generated method stub
		
	}

}
