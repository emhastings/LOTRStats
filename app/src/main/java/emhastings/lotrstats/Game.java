package emhastings.lotrstats;

import java.util.ArrayList;

/**
 * Created by ehast on 12/30/2017.
 */

public class Game {

    private ArrayList<Character> chars;
    private ArrayList<String> charNames;
    private String game;

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

        chars = new ArrayList<Character>();
        for (String name : charNames) {
            Character newChar = new Character(name, game);
            chars.add(newChar);
        }
    }

    public void changeGame(String game) {

        this.game = game;

        //update characters
        ArrayList<Character> newChars = new ArrayList<Character>();

        for (Character character : chars)  {
            Character newChar = new Character(character.getName(), game);

            //keep old modifiers and items
            newChar.setSpeedModifier(character.getSpeedModifier());
            newChar.setPowerModifier(character.getPowerModifier());
            newChar.setWisdomModifier(character.getWisdomModifier());
            newChar.setMagicModifier(character.getMagicModifier());
            newChar.setItems(character.getItems());

            newChars.add(newChar);
        }

        chars = newChars;
    }

    public void clearStats()  {

        ArrayList<Character> newChars = new ArrayList<Character>();
        for (Character character : chars)  {
            Character newChar = new Character(character.getName(), game);
            newChars.add(newChar);
        }
    }

}
