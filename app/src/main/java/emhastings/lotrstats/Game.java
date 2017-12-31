package emhastings.lotrstats;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ehast on 12/30/2017.
 *
 * Class representing game state.  Knows which game it is and the characters and their stats.
 */

public class Game {

    private ArrayList<String> charNames;
    private HashMap<String, Character> charMap;
    private String game;

    /**
     * Constructor
     * @param game Game name ("FotR", "TT" or "RotK")
     */
    public Game(String game)  {

        this.game = game;

        //initialize characters
        charNames = new ArrayList<String>();
        charNames.add("Boromir");
        charNames.add("Frodo");
        charNames.add("Gandalf");
        charNames.add("Gimli");
        charNames.add("Legolas");
        charNames.add("Merry");
        charNames.add("Pippin");
        charNames.add("Sam");
        charNames.add("Aragorn");
        charNames.add("Gollum");
        charNames.add("Smeagol");
        charNames.add("Treebeard");
        charNames.add("Theoden");
        charNames.add("Haldir");
        charNames.add("Eowyn");
        charNames.add("Faramir");

        charMap = new HashMap<String, Character>();
        for (String name : charNames) {
            Character newChar = new Character(name, game);
            charMap.put(name, newChar);
        }
    }

    /**
     * Switch games
     * @param game  Game name ("FotR", "TT" or "RotK")
     */
    public void changeGame(String game) {

        this.game = game;

        //update characters
        HashMap<String, Character> newMap = new HashMap<String, Character>();

        for (Character character : charMap.values())  {
            Character newChar = new Character(character.getName(), game);

            //keep old modifiers and items
            newChar.setSpeedModifier(character.getSpeedModifier());
            newChar.setPowerModifier(character.getPowerModifier());
            newChar.setWisdomModifier(character.getWisdomModifier());
            newChar.setMagicModifier(character.getMagicModifier());
            newChar.setItems(character.getItems());

            newMap.put(newChar.getName(), newChar);
        }

        charMap = newMap;
    }

    /**
     * Remove all stat modifiers and items.
     */
    public void clearStats()  {

        HashMap<String, Character> newMap = new HashMap<String, Character>();
        for (Character character : charMap.values())  {
            Character newChar = new Character(character.getName(), game);
            newMap.put(newChar.getName(), newChar);
        }
        charMap = newMap;
    }

    public HashMap<String, Character> getChars()  {
        return charMap;
    }

    public String toString()  {
        String retVal = "";

        retVal += String.format("%10s %5s %5s %6s %5s %20s%n", "Character", "Speed", "Power", "Wisdom", "Magic", "Items");
        for (Character ch : charMap.values())  {
            if (ch.isDisplay()) {
                retVal += ch;
            }
        }

        return retVal;
    }
}