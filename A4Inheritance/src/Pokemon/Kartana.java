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
 
 
 public class Kartana extends Grass
 {  // begin class
 	// ***** enums *****
     
        public enum KartanaMoves{
           leafBlade, RazorLeaf, Synthesis
        }
        
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********

            private KartanaMoves kartanamoves = null;
        
 	// ********** constructors ***********
        
/*****************************************************
 Purpose: create a new fire type object
 Interface: IN: 
 * From super class

						
 Returns: na
 *****************************************************/ 
	 public Kartana(String n, int ls, Gender g, 
			 Rarity r, OGmoves og, Type t, GrassMoves grassmoves, KartanaMoves km){
             
		super(n, ls, g, r, og, t, grassmoves);
                    kartanamoves = km;
                    
	 } // end construcot
	 
 	// ********** accessorsand setters **********

    public KartanaMoves getKartanamoves() {
        return kartanamoves;
    }

    public void setKartanamoves(KartanaMoves kartanamoves) {
        this.kartanamoves = kartanamoves;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Pokemon.nextID = nextID;
    }
    
     /********************************************************
            * Purpose:        Override toString() function and return
            *                 employee's id, hours, wage, pay, 
            *                 OT pay, and total pay
            *         
            * Interface:
            *     in:         None
            *     out:        Data string
            ********************************************************/
            public String toString(){
                String info = ""; //employee data to be outputted
                
                info = ("ID: " + this.getId() + "\t");
                info += ("Name:" + this.getName() + "\t");
                info += ("Gender:" + this.getGender() + "\t");
                info += ("Rarity:" + this.getRarity() + "\t");
                info += ("Original Moves:" + this.getOgmoves() + "\t");
                info += ("Type:" + this.getType() + "\t");
                info += ("Grass Moves:" + this.getGrassmoves()+ "\t");
                info += ("Kartana Moves: " + this.getKartanamoves() + "\t");
                return info; //return data
            }//end toString
 }  // end class