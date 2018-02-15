package Pokemon;

/********************************************************************
 * Programmer:	sveinson
 * Class:  CS20S
 *
 * Assignment: Inheritance Example
 * Program Name:  AnimalClient
 *
 * Description: client code to drive the Animal inheritance hierarchy
 *
 * Input: na
 *
 * Output: na
 ***********************************************************************/
 
 // import java libraries here as needed
 
import Pokemon.Fire.FireMoves;
import Pokemon.Grass.GrassMoves;
import Pokemon.Pokemon.Gender;
import Pokemon.Pokemon.OGmoves;
import Pokemon.Pokemon.Rarity;
import Pokemon.Pokemon.Type;
import Pokemon.Water.WaterMoves;
import javax.swing.*;
import java.text.DecimalFormat;
import java.io.*; 			// import file io libraries
 

public class PokemonClient {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
    	
    // create instances of objects for i/o and formatting
    
        ProgramInfo programInfo = new ProgramInfo();
        
    	Fire pokey = new Fire("Pokey", 15, Gender.Female, Rarity.Common, OGmoves.Pound,Type.Fire, FireMoves.Roast);
        Grass bulb = new Grass("Bulbasaur", 8, Gender.Male, Rarity.Legendary, OGmoves.Leer, Type.Grass, GrassMoves.FrenzyPlant);
        Fire charm = new Fire("Charmander", 1, Gender.Male, Rarity.Rare, OGmoves.Scratch, Type.Fire, FireMoves.Scorch);
        Water squirt = new Water("Squirtle", 12, Gender.Female, Rarity.Common, OGmoves.Tackle, Type.Water, WaterMoves.Splash);
    // ********** Print output Banner **********
	
		strout = programInfo.getBanner("A4 Inheritance");
		System.out.println(strout);
 	    	
    // ************************ get input **********************

    // ************************ processing ***************************
    
    // ************************ print output ****************************
    
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("ID: " + pokey.getId());        
        System.out.println("Name: " + pokey.getName());        
        System.out.println("Rarity: " + pokey.getRarity());
        System.out.println("Lifespan: " + pokey.getLifeSpan());
        System.out.println("Gender: " + pokey.getGender());
        System.out.println("Move: " + pokey.getOgmoves());
        System.out.println("Fire Move: " + charm.getFiremoves());
        System.out.println("Type: " + charm.getType());
         
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("ID: " + bulb.getId());        
        System.out.println("Name: " + bulb.getName());        
        System.out.println("Rarity: " + bulb.getRarity());
        System.out.println("Lifespan: " + bulb.getLifeSpan());
        System.out.println("Gender: " + bulb.getGender());
        System.out.println("Move: " + bulb.getOgmoves());
        System.out.println("Grass Move: " + bulb.getGrassmoves());
        System.out.println("Type: " + bulb.getType());
        
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("ID: " + charm.getId());        
        System.out.println("Name: " + charm.getName());        
        System.out.println("Rarity: " + charm.getRarity());
        System.out.println("Lifespan: " + charm.getLifeSpan());
        System.out.println("Gender: " + charm.getGender());
        System.out.println("Original Move: " + charm.getOgmoves());
        System.out.println("Fire Move: " + charm.getFiremoves());
        System.out.println("Type: " + charm.getType());
        
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("ID: " + squirt.getId());        
        System.out.println("Name: " + squirt.getName());        
        System.out.println("Rarity: " + squirt.getRarity());
        System.out.println("Lifespan: " + squirt.getLifeSpan());
        System.out.println("Gender: " + squirt.getGender());
        System.out.println("Move: " + squirt.getOgmoves());
        System.out.println("Water Move: " + squirt.getWatermoves());
        System.out.println("Type: " + squirt.getType() + "\n!!!!!!!!!!!!!!!!!!!!!!!!!" );
    
        // ******** closing message *********
        
        strout = programInfo.getClosingMessage();
		System.out.println("\n" + strout);
        //fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        //fout.close();			// close output buffer
    }  // end main
}  // end class
