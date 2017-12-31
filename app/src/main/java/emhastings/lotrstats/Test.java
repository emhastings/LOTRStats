package emhastings.lotrstats;

/**
 * Created by ehast on 12/30/2017.
 *
 * Testing class for Game and Character.  Run main().
 */

public class Test {

    public static void main(String[] args)  {
        Game game = new Game("FotR");

        System.out.println("Started Fellowship");
        System.out.println(game);

        //Give items
        Character frodo = game.getChars().get("Frodo");
        frodo.addItem("Ring");
        frodo.addItem("Secret");
        System.out.println("Gave Frodo items");
        System.out.println(game);

        //+4 to magic for Frodo
        frodo.setMagicModifier(4);
        System.out.println("+4 to magic for Frodo");
        System.out.println(game);

        //change game
        game.changeGame("TT");
        System.out.println("Change to Two Towers");
        System.out.println(game);

        //+10 to power for Theoden
        Character theoden = game.getChars().get("Theoden");
        theoden.setPowerModifier(10);
        System.out.println("+10 to power for Theoden");
        System.out.println(game);

        //change again
        game.changeGame("RotK");
        System.out.println("Change to Return of the King");
        System.out.println(game);

        //clear
        game.clearStats();
        System.out.println("Cleared game");
        System.out.println(game);
    }
}