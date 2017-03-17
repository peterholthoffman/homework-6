public class Clothing {
	enum Type {UNDERGARMENT, SOCKS, STOCKINGS, TOP, BOTTOM, CAPE};
	enum Color {BROWN, RED, PINK, ORANGE, GREEN, BLUE, PURPLE, GREY};
	private Type type;
	private Color color;

	public Clothing()
	{
		this.type = Type.CAPE;
		this.color = Color.GREY;
	}
	
	public Clothing(Type aType, Color aColor)
	{
		this.setType(aType);
		this.setColor(aColor);
	}
	
	public Type getType()
	{
		return this.type;
	}
	
	public Color getColor()
	{
		return this.color;
	}
	
	public void setType(Type aType)
	{
		this.type = aType;
	}
	
	public void setColor(Color aColor)
	{
		this.color = aColor;
	}
	
	public String toString(Type aType, Color aColor)
	{
		return "Type: " + this.type + ", Color: " + this.color;
	}
	
	public boolean equals(Clothing aType, Clothing aColor)
	{
		return aType != null && aColor != null && this.type == aType.getType() && this.color == aColor.getColor(); 
	}
}


