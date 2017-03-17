public class Clothing {
	private String type;
	private String color;

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
	
	public String getType()
	{
		return this.type;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setType(String aType)
	{
		this.type = aType;
	}
	
	public void setColor(String aColor)
	{
		this.color = aColor;
	}
	
	public String toString(String aType, String aColor)
	{
		return "Type: " + this.type + ", Color: " + this.color;
	}
	
	public boolean equals(Clothing aType, Clothing aColor)
	{
		return aType != null && aColor != null && this.type == aType.getType() && this.color == aColor.getColor(); 
	}
}


