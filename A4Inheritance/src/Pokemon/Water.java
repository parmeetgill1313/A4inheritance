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
 
 
 public class Water extends Pokemon
 {  // begin class
 	// ***** enums *****
     
        public enum WaterMoves{
            Vortex, Whirlpool, WaterShuriken, Splash
        }
        
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********

            private WaterMoves watermoves = null;
        
 	// ********** constructors ***********
        
/*****************************************************
 Purpose: create a new fire type object
 Interface: IN: 
 * From super class

						
 Returns: na
 *****************************************************/ 
	 public Water(String n, int ls, Gender g, 
			 Rarity r, OGmoves og, Type t,WaterMoves wm){
             
		super(n, ls, g, r, og, t);
                    watermoves = wm;
                    
	 } // end construcot
	 
 	// ********** accessors **********

	 
	// ********** mutators **********

    public WaterMoves getWatermoves() {
        return watermoves;
    }

    public void setWatermoves(WaterMoves watermoves) {
        this.watermoves = watermoves;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Pokemon.nextID = nextID;
    }

 }  // end class