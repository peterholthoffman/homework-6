/*
 * Next write a class called Dresser
 *  
 * Instance Variables
 * 	Clothes – a 2D array where there are only 5 drawers, and each drawer can hold 10 items of clothing
 * Constructors
 * 	Just default that creates the 2D array
 * No Accessors or Mutators
 * Methods
 * 	add: Takes in an instance of Clothing as a parameter and returns nothing.  The parameter is then sorted in their proper drawers by its type as mentioned above.  If a drawer is full make sure to tell the user.
 * 	remove: Takes in an instance of Clothing as a parameter and returns nothing.  This method searches for a piece of clothing, and if it exists it is removed (by setting that value to null).
 * print: This prints out every piece of clothing in the dresser
*/

public class Dresser {
	// The drawers that will hold the clothes.
	// The first dimension is the item count.
	// The second dimension is the item. 
	private String[][] clothes;
	
	// Constructors -- just the default
	public Dresser()
	{
		this.clothes = new String[4][9];
	}
	
	// Accessors -- NONE
	
	// Mutators -- NONE

	// Methods
	public void add(Clothing aItem)
	{
		// find the right drawer and then put the item in it
		for(int i = 0; i < clothes.length; i++)
		{		
			
		}
	}
	
	public void remove(Clothing aItem)
	{
		
	}
	
	public void print()
	{
		for (int i=0; i<4; i++) {
			for (int j=0; j<9; j++) {
				System.out.println(this.clothes[i][j]);
			}
		}
	}
}