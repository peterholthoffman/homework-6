/*
 * Write a class called Clothing
 * Instance Variables
 * 	Type – This can only be Undergarment, Socks, Stockings, Top, Bottom, and Cape
 * 	Color – This can only be Brown, Red, Pink, Orange, Green, Blue, Purple, and Grey
 * Constructors
 * 	Default
 * 	Parameterized
 * Accessors and Mutators for the instance variables
 * 	Make sure to check for valid values in the mutator
 * Methods
 * 	toString: Takes in no parameters and returns a string with the Type and Color of the garment
 * 	equals: Takes an instance of Clothing as a parameters and returns true only if the parameters are equal
 */
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

		typeFound = validateType(aType);
		colorFound = validateColor(aColor);

		if (typeFound && colorFound) {
			this.setType(aType);
			this.setColor(aColor);
			System.out.println("DEBUG: " + this.toString());
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
		if (validateType(aType)) this.type = aType;
	}
	
	public void setColor(String aColor)
	{
		if (validateColor(aColor)) this.color = aColor;
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
	
	private Boolean validateType(String aType) {
		
		Boolean typeFound = false;
		
		for (int i=0; i < typeValues.length; i++) {
			if (aType.equals(typeValues[i])) typeFound=true;
		}
		if (!typeFound) {
			System.out.println("Not a valid type: " + aType);
		}
		return typeFound;
	}
	
	private Boolean validateColor(String aColor)
	{
		Boolean colorFound = false;
		
		for (int i=0; i < colorValues.length; i++) {
			if (aColor.equals(colorValues[i])) colorFound=true;
		}

		if (!colorFound) {
			System.out.println("Not a valid color: " + aColor);
		}
		return colorFound;
	}
}