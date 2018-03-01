package Pokemon;

/**
 * ******************************************************************
 * Programmer:	sveinson Class: CS20S
 *
 * Assignment: Inheritance Example Program Name: AnimalClient
 *
 * Description: client code to drive the Animal inheritance hierarchy
 *
 * Input: na
 *
 * Output: na
 **********************************************************************
 */
// import java libraries here as needed
import Pokemon.Dragon.DragonMoves;
import Pokemon.Dragonite.DragoniteMoves;
import Pokemon.Grass.GrassMoves;
import Pokemon.Greninja.GreninjaMoves;
import Pokemon.Kartana.KartanaMoves;
import Pokemon.Pokemon.Gender;
import Pokemon.Pokemon.OGmoves;
import Pokemon.Pokemon.Rarity;
import Pokemon.Pokemon.Type;
import Pokemon.Water.WaterMoves;
import javax.swing.*;
import java.text.DecimalFormat;
import java.io.*; 			// import file io libraries

public class PokemonClient {  // begin class

    public static void main(String[] args) throws IOException {  // begin main

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

//        Dragon pokey = new Dragon("Pokey", 15, Gender.Female, Rarity.Common, OGmoves.Pound, Type.Dragon, DragonMoves.DragonTail);
//        Grass bulb = new Grass("Bulb", 8, Gender.Male, Rarity.Legendary, OGmoves.Leer, Type.Grass, GrassMoves.FrenzyPlant);
//        Dragon charm = new Dragon("Charm", 1, Gender.Male, Rarity.Rare, OGmoves.Scratch, Type.Dragon, DragonMoves.DragonRage);
//        Water squirt = new Water("Squirt", 45, Gender.Female, Rarity.Common, OGmoves.Tackle, Type.Water, WaterMoves.Splash);

        Greninja g = new Greninja("Geninja", 78, Gender.Male, Rarity.Rare, OGmoves.Scratch, Type.Water, WaterMoves.Vortex, GreninjaMoves.Haze);
        Kartana k = new Kartana("Kartana", 87, Gender.Female, Rarity.Common, OGmoves.Tackle, Type.Grass, GrassMoves.SolarBeam, KartanaMoves.Synthesis);
        Dragonite d = new Dragonite("Dragonite", 23, Gender.Female, Rarity.Legendary, OGmoves.Pound, Type.Dragon, DragonMoves.Twister, DragoniteMoves.FirePunch);

        // ********** Print output Banner **********
        strout = programInfo.getBanner("A4 Inheritance");
        System.out.println(strout);

        // ************************ get input **********************
        // ************************ processing ***************************
        // ************************ print output ****************************
        g.setGender(Gender.Male);
        k.setName("Kartanic");
        d.setRarity(Rarity.Common);
        
        System.out.println(g.toString());
        System.out.println(k.toString());
        System.out.println(d.toString());
        
        
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!"); 
//        System.out.println("ID: " + pokey.getId());        
//        System.out.println("Name: " + pokey.getName());        
//        System.out.println("Rarity: " + pokey.getRarity());
//        System.out.println("Lifespan: " + pokey.getLifeSpan());
//        System.out.println("Gender: " + pokey.getGender());
//        System.out.println("Move: " + pokey.getOgmoves());
//        System.out.println("Fire Move: " + pokey.getDragonmoves());
//        System.out.println("Type: " + pokey.getType());
//         
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println("ID: " + bulb.getId());        
//        System.out.println("Name: " + bulb.getName());        
//        System.out.println("Rarity: " + bulb.getRarity());
//        System.out.println("Lifespan: " + bulb.getLifeSpan());
//        System.out.println("Gender: " + bulb.getGender());
//        System.out.println("Move: " + bulb.getOgmoves());
//        System.out.println("Grass Move: " + bulb.getGrassmoves());
//        System.out.println("Type: " + bulb.getType());
//        
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println("ID: " + charm.getId());        
//        System.out.println("Name: " + charm.getName());        
//        System.out.println("Rarity: " + charm.getRarity());
//        System.out.println("Lifespan: " + charm.getLifeSpan());
//        System.out.println("Gender: " + charm.getGender());
//        System.out.println("Original Move: " + charm.getOgmoves());
//        System.out.println("Fire Move: " + charm.getDragonmoves());
//        System.out.println("Type: " + charm.getType());
//        
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println("ID: " + squirt.getId());        
//        System.out.println("Name: " + squirt.getName());        
//        System.out.println("Rarity: " + squirt.getRarity());
//        System.out.println("Lifespan: " + squirt.getLifeSpan());
//        System.out.println("Gender: " + squirt.getGender());
//        System.out.println("Move: " + squirt.getOgmoves());
//        System.out.println("Water Move: " + squirt.getWatermoves());
//        System.out.println("Type: " + squirt.getType());
//        
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println("ID: " + g.getId());        
//        System.out.println("Name: " + g.getName());        
//        System.out.println("Rarity: " + g.getRarity());
//        System.out.println("Lifespan: " + g.getLifeSpan());
//        System.out.println("Gender: " + g.getGender());
//        System.out.println("Move: " + g.getOgmoves());
//        System.out.println("Water Move: " + g.getWatermoves());
//        System.out.println("Type: " + g.getType());
//        System.out.println("Squirtle Moves: " + g.getGreninjamoves());
//        
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println("ID: " + k.getId());        
//        System.out.println("Name: " + k.getName());        
//        System.out.println("Rarity: " + k.getRarity());
//        System.out.println("Lifespan: " + k.getLifeSpan());
//        System.out.println("Gender: " + k.getGender());
//        System.out.println("Move: " + k.getOgmoves());
//        System.out.println("Water Move: " + k.getGrassmoves());
//        System.out.println("Type: " + k.getType());
//        System.out.println("Squirtle Moves: " + k.getKartanamoves());
//        
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println("ID: " + d.getId());        
//        System.out.println("Name: " + d.getName());        
//        System.out.println("Rarity: " + d.getRarity());
//        System.out.println("Lifespan: " + d.getLifeSpan());
//        System.out.println("Gender: " + d.getGender());
//        System.out.println("Move: " + d.getOgmoves());
//        System.out.println("Water Move: " + d.getDragonmoves());
//        System.out.println("Type: " + d.getType());
//        System.out.println("Squirtle Moves: " + d.getDragonitemoves());
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");

        // ******** closing message *********
        strout = programInfo.getClosingMessage();
        System.out.println("\n" + strout);
        //fout.format("%n%nend of processing.");

        // ***** close streams *****
        //fin.close();			// close input buffer
        //fout.close();			// close output buffer
    }  // end main
}  // end class
