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
 
 
 public class Grass extends Pokemon
 {  // begin class
 	// ***** enums *****
     
        public enum GrassMoves{
            SolarBeam, SeedFlare, LeafStorm, FrenzyPlant
        }
        
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********

            private GrassMoves grassmoves = null;
        
 	// ********** constructors ***********
        
/*****************************************************
 Purpose: create a new fire type object
 Interface: IN: 
 * From super class

						
 Returns: na
 *****************************************************/ 
	 public Grass(String n, int ls, Gender g, 
			 Rarity r, OGmoves og, Type t,GrassMoves gm){
             
		super(n, ls, g, r, og, t);
                    grassmoves = gm;
                    
	 } // end construcot
	 
 	// ********** accessors **********

	 
	// ********** mutators **********

    public GrassMoves getGrassmoves() {
        return grassmoves;
    }

    public void setGrassmoves(GrassMoves grassmoves) {
        this.grassmoves = grassmoves;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Pokemon.nextID = nextID;
    }

 }  // end class