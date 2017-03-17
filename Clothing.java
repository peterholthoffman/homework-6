public class Clothing {

	private String type;
	private String[] typeValues={"undergarment", "socks", "stockings", "top", "bottom", "cape"};
	
	private String color;
	private String[] colorValues={"brown", "red", "pink", "orange", "green", "blue", "purple", "grey"};

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
		Boolean typeFound=false;
		Boolean colorFound=false;

		for (int i=0; i < typeValues.length; i++) {
			if (aType.equals(typeValues[i])) typeFound=true;
		}
		for (int i=0; i < colorValues.length; i++) {
			if (aColor.equals(colorValues[i])) colorFound=true;
		}

		if (!typeFound) {
			System.out.println("Not a valid type: " + aType);
		}
		if (!colorFound) {
			System.out.println("Not a valid color: " + aColor);
		}

		if (typeFound && colorFound) {
			this.setType(aType);
			this.setColor(aColor);
			System.out.println("DEBUG: Added this -- " + this.toString());
		}
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
	public String toString()
	{
		return "Type: " + this.type + ", Color: " + this.color;
	}
	
	public boolean equals(Clothing clothing)
	{
		return this.type.equals(clothing.getType()) && this.color.equals(clothing.getColor()); 
	}
}