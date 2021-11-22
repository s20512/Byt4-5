package Memento;

import java.util.ArrayList;

public class MementoDemo {
    /*
    This program is designed to easily implement an ability that all Paladins and Time Wizards use called
    "Divine Favour" and "Redo" respectively. Both pf those abilities function similarly - they store a state of the player -
    health, mana and conditions, and when the user activates the ability, all those statistics go back to how they
    were during the previous round.
     */
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator character = new Originator();
        //turn start
        character.setState(100, 100, "Blinded 3");
        caretaker.addMemento(character.save());
        //turn end
        //turn start
        character.setState(93, 90, "Blinded 2");
        caretaker.addMemento(character.save());
        //turn end
        //turn start
        character.setState(81, 90, "Blinded 1");
        caretaker.addMemento(character.save());
        //turn end
        //turn start
        character.setState(73, 80, "Confused 1");
        // ability is used
        character.restore(caretaker.getMemento());
    }
}