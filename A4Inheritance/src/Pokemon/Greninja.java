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
 
 
 public class Greninja extends Water
 {  

// begin class
 	// ***** enums *****
     
        public enum GreninjaMoves{
            Haze, QuickAttack, WaterPulse
        }
        
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********

            private GreninjaMoves greninjamoves = null;
        
 	// ********** constructors ***********
        
/*****************************************************
 Purpose: create a new fire type object
 Interface: IN: 
 * From super class

						
 Returns: na
 *****************************************************/ 
	public Greninja(String n, int ls, Gender g, 
			Rarity r, OGmoves og, Type t, WaterMoves watermoves,GreninjaMoves sm){
             
                super(n, ls, g, r, og, t, watermoves);
                    greninjamoves = sm;
                    
	 } // end construcot
	 
 	// ********** accessors **********

	 
	// ********** mutators **********

    public GreninjaMoves getGreninjamoves() {
        return greninjamoves;
    }

    public void setGreninjamoves(GreninjaMoves GreninjaMoves) {
        this.greninjamoves = greninjamoves;
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
                info += ("Grass Moves:" + this.getWatermoves()+ "\t");
                info += ("Kartana Moves: " + this.getGreninjamoves() + "\t");
                return info; //return data
            }//end toString
            
 }  // end class