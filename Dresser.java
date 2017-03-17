
public class Dresser {
	private Clothing[][] clothes;
	
	public Dresser()
	{
		this.clothes = new Clothing[5][10];
	}
	
	public Dresser(Clothing aDrawer, Clothing aItem)
	{
		this.clothes = clothes[aDrawer][aItem];
		for(int i = 0; i < clothes.length; i++) //drawer
		{
			for(int j = i; j < clothes.length; j++) //item
			{
				clothes[i][j] = clothes[aDrawer][aItem];
			}
		}
	}
	
	public void addItem(Clothing aItem)
	{
		for(int i = 0; i < clothes.length; i++)
		{		
			
		}
	}
}
