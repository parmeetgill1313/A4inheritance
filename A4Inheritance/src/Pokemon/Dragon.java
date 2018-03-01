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
 
 
 public class Dragon extends Pokemon
 {  // begin class
 	// ***** enums *****
     
        public enum DragonMoves{
            Twister, DragonRage, Outrage, DragonTail
        }
        
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********

            private DragonMoves dragonmoves = null;
            
 	// ********** constructors ***********
        
/*****************************************************
 Purpose: create a new fire type object
 Interface: IN: 
 * From super class

						
 Returns: na
 *****************************************************/ 
	 public Dragon(String n, int ls, Gender g, 
			 Rarity r, OGmoves og, Type t,DragonMoves dm){
             
		super(n, ls, g, r, og, t);
                    dragonmoves = dm;
                    
	 } // end construcot
	 
 	// ********** accessors **********

	 
	// ********** mutators **********

    public DragonMoves getDragonmoves() {
        return dragonmoves;
    }

    public void setDragonmoves(DragonMoves dragonmoves) {
        this.dragonmoves = dragonmoves;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Pokemon.nextID = nextID;
    }

 }  // end class