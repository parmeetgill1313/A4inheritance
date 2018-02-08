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
 
import Pokemon.Pokemon.Gender;
import Pokemon.Pokemon.OGmoves;
import Pokemon.Pokemon.Rarity;
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

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
        
    	Pokemon poke = new Pokemon("Pokemon", 15, Gender.Female, Rarity.Common, OGmoves.Pound);
        Pokemon bulb= new Pokemon("Pokemon", 8, Gender.Male, Rarity.Legendary, OGmoves.Leer);
        Pokemon charm = new Pokemon("Pokemon", 1, Gender.Male, Rarity.Rare, OGmoves.Scratch);
        Pokemon squirt = new Pokemon("Pokemon", 12, Gender.Female, Rarity.Common, OGmoves.Tackle);
    // ********** Print output Banner **********
	
		strout = programInfo.getBanner("A4 Inheritance");
		System.out.println(strout);
 	    	
    // ************************ get input **********************



    // ************************ processing ***************************
    
    // ************************ print output ****************************
        
        System.out.println("ID: " + poke.getId());        
        System.out.println("Name: " + poke.getName());        
        System.out.println("Rarity: " + poke.getRarity());
        System.out.println("Lifespan: " + poke.getLifeSpan());
        System.out.println("Gender: " + poke.getGender());
        System.out.println("Move: " + poke.getOgmoves());
    
        // ******** closing message *********
        
        strout = programInfo.getClosingMessage();
		System.out.println("\n" + strout);
        //fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        //fout.close();			// close output buffer
    }  // end main
}  // end class
