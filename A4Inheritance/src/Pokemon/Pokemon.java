package Pokemon;

import javax.swing.JOptionPane;

/** **********************************************************
 * Programmer:	P. Gill
 * Class:		CS30S
 * 
 * Assignment:	A4 Inheriance
 *
 * Description:	Pokemon super class. this is the main super class
 *		all other classes will derive form this one.
 *              
 *
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Pokemon
 {  // begin class
 	
	public enum Gender{
		Male, Female;
	} // end gender
        
        public enum Rarity{
		Common, Rare, Legendary;
	} // end gender
        
        public enum OGmoves{
		Leer, Tackle, Scratch, Pound;
	} // end gender
        public enum Type{
		Grass, Dragon, Water;
	} // end gender
        
        
	 	 	
        static int nextID = 1000;
 	// ********** instance variable **********
         private int id = 0000;
         private String name = "";
	 private int lifeSpan = 0;			
	 private Gender gender = null;	
         private Rarity rarity = null;	
         private OGmoves ogmoves = null;	
         private Type type = null;	
	  
 	// ********** constructors ***********
/*****************************************************
 Purpose: create a new pokemon object
 Interface: IN: Name:           Name n: String
				rarity r: Rarity
				lifeSpan ls: int
				gender g: Gender

							
 Returns: na
 *****************************************************/
	 public Pokemon(String n, int ls, Gender g, 
			 Rarity r, OGmoves og, Type t){
                 id = nextID++;
                 name = n;
		 lifeSpan = ls;
		 gender = g;
		 rarity = r;
                 ogmoves = og;
                 type = t;
	 } // and initialized constructor

/*****************************************************
 Purpose: create a new animal object no properties set
 Interface: IN: none							
 Returns: na
 *****************************************************/
	 public Pokemon(){
		 id = nextID++;		
	 } // and default constructor
         

 	// ********** getters **********
        public static int getNextID() {
            return nextID;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getLifeSpan() {
            return lifeSpan;
        }

        public Gender getGender() {
            return gender;
        }

        public Rarity getRarity() {
            return rarity;
        }

        public OGmoves getOgmoves() {
            return ogmoves;
        }
         public Type getType() {
            return type;
        }

 	// ********** mutators **********

        public static void setNextID(int nextID) {
            Pokemon.nextID = nextID;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLifeSpan(int lifeSpan) {
            this.lifeSpan = lifeSpan;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public void setRarity(Rarity rarity) {
            this.rarity = rarity;
        }

        public void setOgmoves(OGmoves ogmoves) {
            this.ogmoves = ogmoves;
        }

        public void setType(Type type) {
            this.type = type;
        }

 }  // end class