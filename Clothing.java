public class Clothing {
	private String type;
	private String color;

	//
	// Constructors
	//
	public Clothing()
	{
		this.type = "";
		this.color = "";
	}
	
	public Clothing(String aType, String aColor)
	{
		this.setType(aType);
		this.setColor(aColor);
	}

	//
	// Accessors
	//
	public String getType()
	{
		return this.type;
	}
	
	public String getColor()
	{
		return this.color;
	}

	//
	// Mutators
	//
	public void setType(String aType)
	{
		this.type = aType;
	}
	
	public void setColor(String aColor)
	{
		this.color = aColor;
	}

	//
	// Methods
	//
	public String toString(String aType, String aColor)
	{
		return "Type: " + this.type + ", Color: " + this.color;
	}
	
	public boolean equals(Clothing clothing)
	{
		return this.type == clothing.getType() && this.color == clothing.getColor(); 
	}
}
