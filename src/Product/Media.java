package Product;

public abstract class Media {
	
	
	
	// attributes that will be common for subclasses will be declared here
		//The protected modifier will ensure that subclass will access them.
	protected String type;
	protected String format;
	protected String year;
	protected String genre;
	protected String description;
	protected String arrival;
	protected String rate;
	protected String director;
	protected Boolean Avaiability;
	
	protected String name;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getArrival() {
		return arrival;
	}


	public void setArrival(String arrival) {
		this.arrival = arrival;
	}


	public String getRate() {
		return rate;
	}


	public void setRate(String rate) {
		this.rate = rate;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	
	
	
	// Generic method toString, to ensure subclasses have it.
	
		@Override
		public String toString() {
			return "I am a Media"; 
			
		}

		// Abstract method has no implementation
		// the only reason to put it here is to ensure that subclasses will have it
		
	
		

}


