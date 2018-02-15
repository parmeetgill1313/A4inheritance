package Pokemon;


/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	Inheritance example
 *
 * Description:	mammal class
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Fire extends Pokemon
 {  // begin class
 	// ***** enums *****
     
        public enum FireMoves{
            Blaze, Scorch, Flame, Roast
        }
        
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********

            private FireMoves firemoves = null;
        
 	// ********** constructors ***********
        
/*****************************************************
 Purpose: create a new fire type object
 Interface: IN: 
 * From super class

						
 Returns: na
 *****************************************************/ 
	 public Fire(String n, int ls, Gender g, 
			 Rarity r, OGmoves og, Type t,FireMoves fm){
             
		super(n, ls, g, r, og, t);
                    firemoves = fm;
                    
	 } // end construcot
	 
 	// ********** accessors **********

	 
	// ********** mutators **********

    public FireMoves getFiremoves() {
        return firemoves;
    }

    public void setFiremoves(FireMoves firemoves) {
        this.firemoves = firemoves;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Pokemon.nextID = nextID;
    }

 }  // end class