package emhastings.lotrstats;

import java.util.ArrayList;

/**
 * Created by ehast on 12/30/2017.
 */

public class Character {

    private String name;

    //base stats
    private int speed;
    private int power;
    private int wisdom;
    private int magic;

    //modifiers to be added to base stats
    private int speedModifier;
    private int powerModifier;
    private int wisdomModifier;
    private int magicModifier;

    //items
    private ArrayList<String> items;

    //should this character be displayed?
    boolean display;

    public Character(String name, String game)  {
        this.name = name;

        speed = 0;
        power = 0;
        wisdom = 0;
        magic = 0;

        speedModifier = 0;
        powerModifier = 0;
        wisdomModifier = 0;
        magicModifier = 0;

        items = new ArrayList<String>();

        display = true;

        //initialize stats from defaults
        switch(name)  {
            case "Boromir":
                //only in FotR
                switch(game) {
                    case "FotR":
                        speed = 7;
                        power = 8;
                        wisdom = 4;
                        magic = 3;
                        break;
                    case "TT":
                        display = false;
                        break;
                    case "RotK":
                        display = false;
                        break;
                    default:
                        break;
                }
                break;
            case "Frodo":
                switch(game) {
                    case "FotR":
                        speed = 4;
                        power = 4;
                        wisdom = 8;
                        magic = 6;
                        break;
                    case "TT":
                        speed = 3;
                        power = 5;
                        wisdom = 6;
                        magic = 6;
                        break;
                    case "RotK":
                        speed = 2;
                        power = 5;
                        wisdom = 6;
                        magic = 6;
                        break;
                    default:
                        break;
                }
                break;
            case "Gandalf":
                switch(game) {
                    case "FotR":
                        speed = 6;
                        power = 6;
                        wisdom = 9;
                        magic = 9;
                        break;
                    case "TT":
                        speed = 9;
                        power = 9;
                        wisdom = 12;
                        magic = 12;
                        break;
                    case "RotK":
                        speed = 9;
                        power = 12;
                        wisdom = 12;
                        magic = 14;
                        break;
                    default:
                        break;
                }
                break;
            case "Gimli":
                switch(game) {
                    case "FotR":
                        speed = 5;
                        power = 9;
                        wisdom = 3;
                        magic = 7;
                        break;
                    case "TT":
                        speed = 5;
                        power = 9;
                        wisdom = 6;
                        magic = 7;
                        break;
                    case "RotK":
                        speed = 5;
                        power = 11;
                        wisdom = 8;
                        magic = 8;
                        break;
                    default:
                        break;
                }
                break;
            case "Legolas":
                switch(game) {
                    case "FotR":
                        speed = 8;
                        power = 5;
                        wisdom = 7;
                        magic = 8;
                        break;
                    case "TT":
                        speed = 9;
                        power = 8;
                        wisdom = 8;
                        magic = 9;
                        break;
                    case "RotK":
                        speed = 9;
                        power = 10;
                        wisdom = 9;
                        magic = 12;
                        break;
                    default:
                        break;
                }
                break;
            case "Merry":
                switch(game) {
                    case "FotR":
                        speed = 3;
                        power = 2;
                        wisdom = 1;
                        magic = 2;
                        break;
                    case "TT":
                        speed = 5;
                        power = 3;
                        wisdom = 3;
                        magic = 2;
                        break;
                    case "RotK":
                        speed = 5;
                        power = 6;
                        wisdom = 8;
                        magic = 5;
                        break;
                    default:
                        break;
                }
                break;
            case "Pippin":
                switch(game) {
                    case "FotR":
                        speed = 3;
                        power = 1;
                        wisdom = 2;
                        magic = 1;
                        break;
                    case "TT":
                        speed = 5;
                        power = 3;
                        wisdom = 5;
                        magic = 2;
                        break;
                    case "RotK":
                        speed = 5;
                        power = 6;
                        wisdom = 8;
                        magic = 5;
                        break;
                    default:
                        break;
                }
                break;
            case "Sam":
                switch(game) {
                    case "FotR":
                        speed = 4;
                        power = 3;
                        wisdom = 5;
                        magic = 4;
                        break;
                    case "TT":
                        speed = 3;
                        power = 6;
                        wisdom = 6;
                        magic = 4;
                        break;
                    case "RotK":
                        speed = 4;
                        power = 9;
                        wisdom = 9;
                        magic = 5;
                        break;
                    default:
                        break;
                }
                break;
            case "Aragorn":
                switch(game) {
                    case "FotR":
                        speed = 7;
                        power = 7;
                        wisdom = 6;
                        magic = 5;
                        break;
                    case "TT":
                        speed = 8;
                        power = 8;
                        wisdom = 8;
                        magic = 6;
                        break;
                    case "RotK":
                        speed = 8;
                        power = 10;
                        wisdom = 10;
                        magic = 8;
                        break;
                    default:
                        break;
                }
                break;
            case "Gollum":
                switch(game) {
                    case "FotR":
                        display = false;
                        break;
                    case "TT":
                        speed = 9;
                        power = 8;
                        wisdom = 6;
                        magic = 6;
                        break;
                    case "RotK":
                        speed = 9;
                        power = 8;
                        wisdom = 8;
                        magic = 8;
                        break;
                    default:
                        break;
                }
                break;
            case "Smeagol":
                switch(game) {
                    case "FotR":
                        display = false;
                        break;
                    case "TT":
                        speed = 7;
                        power = 4;
                        wisdom = 3;
                        magic = 4;
                        break;
                    case "RotK":
                        speed = 7;
                        power = 4;
                        wisdom = 4;
                        magic = 4;
                        break;
                    default:
                        break;
                }
                break;
            case "Treebeard":
                //only in TT
                switch(game) {
                    case "FotR":
                        display = false;
                        break;
                    case "TT":
                        speed = 12;
                        power = 12;
                        wisdom = 15;
                        magic = 7;
                        break;
                    case "RotK":
                        display = false;
                        break;
                    default:
                        break;
                }
                break;
            case "Theoden":
                switch(game) {
                    case "FotR":
                        display = false;
                        break;
                    case "TT":
                        speed = 7;
                        power = 7;
                        wisdom = 6;
                        magic = 5;
                        break;
                    case "RotK":
                        speed = 7;
                        power = 10;
                        wisdom = 8;
                        magic = 8;
                        break;
                    default:
                        break;
                }
                break;
            case "Haldir":
                //only in TT
                switch(game) {
                    case "FotR":
                        display = false;
                        break;
                    case "TT":
                        speed = 8;
                        power = 7;
                        wisdom = 6;
                        magic = 8;
                        break;
                    case "RotK":
                        display = false;
                        break;
                    default:
                        break;
                }
                break;
            case "Eowyn":
                //only in RotK
                switch(game) {
                    case "FotR":
                        display = false;
                        break;
                    case "TT":
                        display = false;
                        break;
                    case "RotK":
                        speed = 5;
                        power = 8;
                        wisdom = 9;
                        magic = 7;
                        break;
                    default:
                        break;
                }
                break;
            case "Faramir":
                //only in RotK
                switch(game) {
                    case "FotR":
                        display = false;
                        break;
                    case "TT":
                        display = false;
                        break;
                    case "RotK":
                        speed = 5;
                        power = 8;
                        wisdom = 10;
                        magic = 5;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getSpeedModifier() {
        return speedModifier;
    }

    public void setSpeedModifier(int speedModifier) {
        this.speedModifier = speedModifier;
    }

    public int getPowerModifier() {
        return powerModifier;
    }

    public void setPowerModifier(int powerModifier) {
        this.powerModifier = powerModifier;
    }

    public int getWisdomModifier() {
        return wisdomModifier;
    }

    public void setWisdomModifier(int wisdomModifier) {
        this.wisdomModifier = wisdomModifier;
    }

    public int getMagicModifier() {
        return magicModifier;
    }

    public void setMagicModifier(int magicModifier) {
        this.magicModifier = magicModifier;
    }

    public ArrayList<String> getItems()  {
        return items;
    }

    public void addItem(String item)  {
        items.add(item);
    }

    public void setItems(ArrayList<String> items)  {
        this.items = items;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

}
